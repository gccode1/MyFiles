import requests
import json
import time
import bs4
import sys
import re
def output(content,file): 
    with open(file,'w') as f: 
        f.write(content)

session = requests.Session()

page = session.get('http://services.ecourts.gov.in/ecourtindia',)

soup = bs4.BeautifulSoup(page.content, 'html.parser')

select = soup.find("select", {"id": "sess_state_code"})

options = select.findAll('option')

data= {}

for option in options[1:]:
    state_code = option['value'].split('~')[0].strip()
    state = option.text.strip()
    print 'State:', state_code, state
    data[state]={}

    data1 = {
            '__csrf_magic': '',
            'action_code': 'fillDistrict',
            'appFlag': 'web',
            'lang_sel': 'E',
            'lstatelang': 'Regional Language',
            'state_code': state_code
    }


    page = session.post('http://services.ecourts.gov.in/ecourtindia/index_qry.php', data = data1)

    list1=re.split('#([0-9]+)~',page.content[:-1])

    for dist_code,district in zip(list1[1::2],list1[2::2]):
        dist_code = dist_code.strip()
        district = district.strip()
        print 'District:', dist_code,district

        data[state][district] = []

        payload ={
            'appFlag': 'web',
            'dist_cd': dist_code,
            'state_cd': state_code
        }

        page = session.get('http://services.ecourts.gov.in/ecourtindia/cases/ki_petres.php', params = payload)

        soup = bs4.BeautifulSoup(page.content, 'html.parser')

        select = soup.find("select", {"id": "court_complex_code"})

        options = select.findAll('option')

        for option in options[1:]:
            codeArr = option['value'].split('@')[1]
            court_complex = option.text.strip()
            court_complex_code = option['value'].strip()
            data[state][district].append(court_complex)
    output(json.dumps(data, indent = 4), 'data'+state_code+'.json')
output(json.dumps(data, indent = 4), 'data.json')
