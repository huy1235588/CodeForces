import java.io.*
import java.util.*
import kotlin.math.*

// Fast I/O
class FastScanner(stream: InputStream) {
    private val br = BufferedReader(InputStreamReader(stream))
    private var st: StringTokenizer? = null
    
    fun next(): String {
        while (st == null || !st!!.hasMoreTokens()) {
            st = StringTokenizer(br.readLine())
        }
        return st!!.nextToken()
    }
    
    fun nextInt() = next().toInt()
    fun nextLong() = next().toLong()
    fun nextDouble() = next().toDouble()
    fun nextLine() = br.readLine()!!
    
    fun nextInts(n: Int) = IntArray(n) { nextInt() }
    fun nextLongs(n: Int) = LongArray(n) { nextLong() }
    fun nextDoubles(n: Int) = DoubleArray(n) { nextDouble() }
}

class FastPrinter(stream: OutputStream) {
    private val pw = PrintWriter(stream)
    
    fun print(x: Any) = pw.print(x)
    fun println(x: Any) = pw.println(x)
    fun println() = pw.println()
    fun close() = pw.close()
    fun flush() = pw.flush()
}

// Constants
const val MOD = 1000000007L
const val INF = Long.MAX_VALUE
const val EPS = 1e-9

// Utility functions
fun gcd(a: Long, b: Long): Long = if (b == 0L) a else gcd(b, a % b)
fun lcm(a: Long, b: Long): Long = a / gcd(a, b) * b

fun power(base: Long, exp: Long, mod: Long = MOD): Long {
    var result = 1L
    var b = base % mod
    var e = exp
    while (e > 0) {
        if (e % 2 == 1L) {
            result = (result * b) % mod
        }
        e = e shr 1
        b = (b * b) % mod
    }
    return result
}

fun isPrime(n: Int): Boolean {
    if (n <= 1) return false
    if (n <= 3) return true
    if (n % 2 == 0 || n % 3 == 0) return false
    
    var i = 5
    while (i * i <= n) {
        if (n % i == 0 || n % (i + 2) == 0) {
            return false
        }
        i += 6
    }
    return true
}

fun sieve(n: Int): List<Int> {
    val isPrime = BooleanArray(n + 1) { true }
    isPrime[0] = false
    isPrime[1] = false
    
    for (i in 2..sqrt(n.toDouble()).toInt()) {
        if (isPrime[i]) {
            for (j in i * i..n step i) {
                isPrime[j] = false
            }
        }
    }
    
    return (2..n).filter { isPrime[it] }
}

fun binarySearch(arr: IntArray, target: Int): Int {
    var left = 0
    var right = arr.size - 1
    while (left <= right) {
        val mid = left + (right - left) / 2
        when {
            arr[mid] == target -> return mid
            arr[mid] < target -> left = mid + 1
            else -> right = mid - 1
        }
    }
    return -1
}

// Graph algorithms
fun dfs(graph: Array<MutableList<Int>>, start: Int, visited: BooleanArray, result: MutableList<Int>) {
    visited[start] = true
    result.add(start)
    
    for (neighbor in graph[start]) {
        if (!visited[neighbor]) {
            dfs(graph, neighbor, visited, result)
        }
    }
}

fun bfs(graph: Array<MutableList<Int>>, start: Int): List<Int> {
    val visited = BooleanArray(graph.size)
    val queue = ArrayDeque<Int>()
    val result = mutableListOf<Int>()
    
    queue.offer(start)
    visited[start] = true
    
    while (queue.isNotEmpty()) {
        val node = queue.poll()
        result.add(node)
        
        for (neighbor in graph[node]) {
            if (!visited[neighbor]) {
                visited[neighbor] = true
                queue.offer(neighbor)
            }
        }
    }
    return result
}

// Extension functions
fun IntArray.sum() = this.fold(0) { acc, x -> acc + x }
fun LongArray.sum() = this.fold(0L) { acc, x -> acc + x }
fun IntArray.product() = this.fold(1) { acc, x -> acc * x }
fun LongArray.product() = this.fold(1L) { acc, x -> acc * x }

fun <T> Array<T>.swap(i: Int, j: Int) {
    val temp = this[i]
    this[i] = this[j]
    this[j] = temp
}

fun IntArray.swap(i: Int, j: Int) {
    val temp = this[i]
    this[i] = this[j]
    this[j] = temp
}

// Solve function
fun solve(sc: FastScanner, out: FastPrinter) {
    // Read input
    val n = sc.nextInt()
    
    // Example: Read array
    val arr = sc.nextInts(n)
    
    // Your algorithm implementation here
    
    // Output result
    out.println("Result:")
}

fun main() {
    val sc = FastScanner(System.`in`)
    val out = FastPrinter(System.out)
    
    // For single test case
    solve(sc, out)
    
    // For multiple test cases:
    // val t = sc.nextInt()
    // repeat(t) {
    //     solve(sc, out)
    // }
    
    out.close()
}
