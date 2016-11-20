#include <bits/stdc++.h>
 
using namespace std;
 
typedef long long ll;
typedef pair<int, int> pii;
typedef pair<ll, int> pli;
typedef pair<int, ll> pil;
typedef pair<ll, ll> pll;
typedef vector<int> vi;
typedef vector<ll> vl;
 
#define PB push_back
#define MP make_pair
#define LB lower_bound
#define UB upper_bound
#define B begin()
#define E end()
#define F first
#define S second
#define px(x) printf("%s = %d\n", #x, x)
#define px2(x, y) printf("%s %d %s %d\n", #x, x, #y, y)
#define px3(x, y, z) printf("%s %d %s %d %s %d\n", #x, x, #y, y, #z, z)
#define pxl(x) printf("%s = %lld\n", #x, x)
#define gc getchar
#define pc putchar
const ll mod = 1000000007;
 
template < class T > void readpos(T &x) { register int c; while(c = gc(), c <= 32);  x = c&15; while(c = gc(), c > 32) x = (x<<3)+(x<<1) + (c&15); }
template < class T > void read(T &x) { register int c, mi = 0; while(c = gc(), c <= 32); if(c == '-') mi = 1, x = 0; else x = c&15; while(c = gc(), c > 32) x = (x<<3)+(x<<1) + (c&15); if(mi == 1) x = -x; }
template < class T > void read(T &x, T &y) { read(x); read(y); }
template < class T > void read(T &x, T &y, T &z) { read(x, y); read(z); }
template < class T > void reada(T *a, int n) { for(int i = 0; i < n; ++i) read(a[i]); }
template < class T > void reada1(T *a, int n) { for(int i = 1; i <= n; ++i) read(a[i]); }
template < class T > void printpos(T x) { static char s[20]; register int pt = 0;while(!pt || x > 0) { s[++pt] = (char)(x % 10 + '0'); x /= 10; } while(pt > 0) pc(s[pt--]); }
template < class T > void print(T x) { static char s[20]; register int pt = 0, mi = (x < 0); if(mi == 1) x = -x; while(!pt || x > 0) { s[++pt] = (char)(x % 10 + '0'); x /= 10; } if(mi == 1) pc('-'); while(pt > 0) pc(s[pt--]); }
template < class T > void print(T x, T y) { print(x); pc(' '); print(y); }
template < class T > void print(T x, T y, T z) { print(x, y); pc(' '); print(z); }
template < class T > void println(T x) { print(x); puts(""); }
template < class T > void printa(T a, int n) { for(int i = 0; i < n; ++i) { print(a[i]); pc(i + 1 == n ? '\n' : ' '); } }
template < class T > void printa1(T a, int n) { for(int i = 1; i <= n; ++i) { print(a[i]); pc(i == n ? '\n' : ' '); } }
template < class T > T gcd(T a, T b) { return b ? gcd(b, a % b) : a; }
template < class T > T lcm(T a, T b) { return a / gcd(a, b) * b; }
template < class T > T power(T a, T b) { T r = 1; while(b > 0) { if(b & 1) r = (r * a) % mod; a = (a * a) % mod; b >>= 1; } return r; }
 
//template ends here
 
#define MAXN 100005
#define LOCAL
 
 
int main(){
    #ifdef LOCAL
        freopen("input.txt","r",stdin);
        clock_t start1=clock();
    #endif
    int i, t, n, a[MAXN];
    read(t);
    //t = 1;
    while(t--){
        read(n);
        reada(a, n);
        printa(a, n);
    }
    #ifdef LOCAL
        printf("%.3lf seconds\n",(double)(clock()-start1)/CLOCKS_PER_SEC);
    #endif
    return 0;
}
