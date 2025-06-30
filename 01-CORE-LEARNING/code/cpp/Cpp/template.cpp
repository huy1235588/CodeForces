#include <bits/stdc++.h>
using namespace std;

// Macros for competitive programming
#define ll long long
#define ull unsigned long long
#define ld long double
#define pb push_back
#define mp make_pair
#define fi first
#define se second
#define all(x) (x).begin(), (x).end()
#define sz(x) (int)(x).size()

// Constants
const int MOD = 1e9 + 7;
const int INF = 1e9;
const ll LINF = 1e18;
const ld EPS = 1e-9;

// Fast I/O
void fastIO() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
}

// Utility functions
template<typename T>
void print_vector(const vector<T>& v) {
    for (int i = 0; i < sz(v); i++) {
        cout << v[i];
        if (i < sz(v) - 1) cout << " ";
    }
    cout << "\n";
}

// GCD and LCM
ll gcd(ll a, ll b) {
    return b == 0 ? a : gcd(b, a % b);
}

ll lcm(ll a, ll b) {
    return a / gcd(a, b) * b;
}

// Power function with modulo
ll power(ll base, ll exp, ll mod = MOD) {
    ll result = 1;
    while (exp > 0) {
        if (exp % 2 == 1) {
            result = (result * base) % mod;
        }
        base = (base * base) % mod;
        exp /= 2;
    }
    return result;
}

// Main function
int main() {
    fastIO();
    
    // Your code here
    int n;
    cin >> n;
    
    // Example: Read array
    vector<int> a(n);
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }
    
    // Your algorithm implementation
    
    // Output result
    cout << "Result: " << endl;
    
    return 0;
}
