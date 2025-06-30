import java.util.*;
import java.io.*;

public class Solution {
    // Constants
    static final int MOD = 1000000007;
    static final int INF = Integer.MAX_VALUE;
    static final long LINF = Long.MAX_VALUE;
    static final double EPS = 1e-9;
    
    // Fast I/O
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        
        public FastScanner(InputStream stream) {
            br = new BufferedReader(new InputStreamReader(stream));
        }
        
        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        
        int nextInt() {
            return Integer.parseInt(next());
        }
        
        long nextLong() {
            return Long.parseLong(next());
        }
        
        double nextDouble() {
            return Double.parseDouble(next());
        }
        
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    
    static class FastPrinter {
        PrintWriter pw;
        
        public FastPrinter(OutputStream stream) {
            pw = new PrintWriter(stream);
        }
        
        void print(Object o) {
            pw.print(o);
        }
        
        void println(Object o) {
            pw.println(o);
        }
        
        void close() {
            pw.close();
        }
        
        void flush() {
            pw.flush();
        }
    }
    
    // Utility functions
    static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    
    static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }
    
    static long power(long base, long exp, long mod) {
        long result = 1;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp /= 2;
        }
        return result;
    }
    
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    
    static List<Integer> sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        return primes;
    }
    
    static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    
    // Graph algorithms
    static void dfs(List<List<Integer>> graph, int node, boolean[] visited, List<Integer> result) {
        visited[node] = true;
        result.add(node);
        
        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs(graph, neighbor, visited, result);
            }
        }
    }
    
    static List<Integer> bfs(List<List<Integer>> graph, int start) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[graph.size()];
        List<Integer> result = new ArrayList<>();
        
        queue.offer(start);
        visited[start] = true;
        
        while (!queue.isEmpty()) {
            int node = queue.poll();
            result.add(node);
            
            for (int neighbor : graph.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
        return result;
    }
    
    // Solve function
    static void solve(FastScanner sc, FastPrinter out) {
        // Read input
        int n = sc.nextInt();
        
        // Example: Read array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Your algorithm implementation here
        
        // Output result
        out.println("Result:");
    }
    
    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        FastPrinter out = new FastPrinter(System.out);
        
        // For single test case
        solve(sc, out);
        
        // For multiple test cases:
        // int t = sc.nextInt();
        // while (t-- > 0) {
        //     solve(sc, out);
        // }
        
        out.close();
    }
}
