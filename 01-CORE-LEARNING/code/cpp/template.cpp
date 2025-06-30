#include <bits/stdc++.h>
using namespace std;

// ==================== FAST I/O ====================
#define fastio                        \
    ios_base::sync_with_stdio(false); \
    cin.tie(NULL);                    \
    cout.tie(NULL)

// ==================== SHORTCUTS ====================
#define ll long long
#define ull unsigned long long
#define pii pair<int, int>
#define pll pair<ll, ll>
#define vi vector<int>
#define vll vector<ll>
#define vpii vector<pii>
#define vpll vector<pll>
#define vvi vector<vi>
#define vvll vector<vll>

// ==================== COMMON OPERATIONS ====================
#define pb push_back
#define mp make_pair
#define fi first
#define se second
#define all(x) (x).begin(), (x).end()
#define rall(x) (x).rbegin(), (x).rend()
#define sz(x) (int)(x).size()

// ==================== LOOPS ====================
#define FOR(i, a, b) for (int i = (a); i < (b); i++)
#define FORE(i, a, b) for (int i = (a); i <= (b); i++)
#define FORR(i, a, b) for (int i = (a); i >= (b); i--)
#define rep(i, n) FOR(i, 0, n)
#define repe(i, n) FORE(i, 1, n)

// ==================== CONSTANTS ====================
const int MOD = 1e9 + 7;
const int INF = 1e9;
const ll LINF = 1e18;
const double EPS = 1e-9;
const int MAXN = 2e5 + 5;

// ==================== UTILITY FUNCTIONS ====================
template <typename T>
T gcd(T a, T b) {
    return b ? gcd(b, a % b) : a;
}

template <typename T>
T lcm(T a, T b) {
    return a / gcd(a, b) * b;
}

template <typename T>
T power(T a, T b, T mod = MOD) {
    T res = 1;
    a %= mod;
    while (b > 0) {
        if (b & 1) res = (res * a) % mod;
        a = (a * a) % mod;
        b >>= 1;
    }
    return res;
}

template <typename T>
T mod_inverse(T a, T mod = MOD) {
    return power(a, mod - 2, mod);
}

// ==================== DEBUG ====================
#ifdef LOCAL
#define debug(x) cerr << #x << " = " << x << endl
#define debug2(x, y) cerr << #x << " = " << x << ", " << #y << " = " << y << endl
#define debug3(x, y, z) \
    cerr << #x << " = " << x << ", " << #y << " = " << y << ", " << #z << " = " << z << endl
#define debugv(v)                          \
    {                                      \
        cerr << #v << " = ";               \
        for (auto x : v) cerr << x << " "; \
        cerr << endl;                      \
    }
#else
#define debug(x)
#define debug2(x, y)
#define debug3(x, y, z)
#define debugv(v)
#endif

// ==================== SOLUTION ====================
void solve() {
    // Your solution goes here
}

// ==================== MAIN ====================
int main() {
    fastio;

    int t = 1;
    cin >> t;  // Comment this line if single test case

    while (t--) {
        solve();
    }

    return 0;
}

/*
==================== NOTES ====================
* Check for integer overflow (use ll when necessary)
* Check array bounds and edge cases
* Think about the time complexity
* Consider corner cases (n=1, empty arrays, etc.)
* Read the problem statement carefully
* Don't forget to handle multiple test cases

==================== COMMON PATTERNS ====================

1. Two Pointers:
   int left = 0, right = n - 1;
   while (left < right) { ... }

2. Binary Search:
   int left = 0, right = n - 1, ans = -1;
   while (left <= right) {
       int mid = left + (right - left) / 2;
       if (check(mid)) { ans = mid; right = mid - 1; }
       else { left = mid + 1; }
   }

3. Prefix Sum:
   vi prefix(n + 1, 0);
   rep(i, n) prefix[i + 1] = prefix[i] + arr[i];

4. DFS Template:
   void dfs(int u, vector<vi>& adj, vi& visited) {
       visited[u] = true;
       for (int v : adj[u]) {
           if (!visited[v]) dfs(v, adj, visited);
       }
   }

5. BFS Template:
   queue<int> q; q.push(start); visited[start] = true;
   while (!q.empty()) {
       int u = q.front(); q.pop();
       for (int v : adj[u]) {
           if (!visited[v]) { visited[v] = true; q.push(v); }
       }
   }

==================== TIME COMPLEXITY GUIDE ====================
* O(1): ~10^8 operations
* O(log n): ~10^7 for n = 10^6
* O(n): ~10^6 for n = 10^6
* O(n log n): ~10^5 for n = 10^5
* O(n^2): ~10^4 for n = 10^4
* O(n^3): ~10^3 for n = 10^3

Always estimate: operations = constraints * complexity
*/
