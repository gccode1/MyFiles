filetype on
filetype plugin on
filetype indent on
autocmd BufNewFile *.cpp -r ~/.template.cpp
set expandtab
set cindent
set autoindent
set pastetoggle=<F2>
set shiftwidth=4
set softtabstop=4
autocmd Filetype ruby setlocal expandtab tabstop=2 shiftwidth=2 softtabstop=2
