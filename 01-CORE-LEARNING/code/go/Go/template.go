package main

import (
	"bufio"
	"fmt"
	"math"
	"os"
	"sort"
	"strconv"
	"strings"
)

// Constants
const (
	MOD = 1e9 + 7
	INF = math.MaxInt64
	EPS = 1e-9
)

// Fast I/O
var (
	scanner = bufio.NewScanner(os.Stdin)
	writer  = bufio.NewWriter(os.Stdout)
)

func init() {
	scanner.Split(bufio.ScanWords)
}

func nextInt() int {
	scanner.Scan()
	num, _ := strconv.Atoi(scanner.Text())
	return num
}

func nextInt64() int64 {
	scanner.Scan()
	num, _ := strconv.ParseInt(scanner.Text(), 10, 64)
	return num
}

func nextFloat64() float64 {
	scanner.Scan()
	num, _ := strconv.ParseFloat(scanner.Text(), 64)
	return num
}

func nextString() string {
	scanner.Scan()
	return scanner.Text()
}

func nextLine() string {
	scanner := bufio.NewScanner(os.Stdin)
	scanner.Scan()
	return scanner.Text()
}

func readInts(n int) []int {
	arr := make([]int, n)
	for i := 0; i < n; i++ {
		arr[i] = nextInt()
	}
	return arr
}

func readInt64s(n int) []int64 {
	arr := make([]int64, n)
	for i := 0; i < n; i++ {
		arr[i] = nextInt64()
	}
	return arr
}

// Utility functions
func gcd(a, b int64) int64 {
	for b != 0 {
		a, b = b, a%b
	}
	return a
}

func lcm(a, b int64) int64 {
	return a / gcd(a, b) * b
}

func power(base, exp, mod int64) int64 {
	result := int64(1)
	base = base % mod
	for exp > 0 {
		if exp%2 == 1 {
			result = (result * base) % mod
		}
		exp = exp >> 1
		base = (base * base) % mod
	}
	return result
}

func abs(x int) int {
	if x < 0 {
		return -x
	}
	return x
}

func absInt64(x int64) int64 {
	if x < 0 {
		return -x
	}
	return x
}

func min(a, b int) int {
	if a < b {
		return a
	}
	return b
}

func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}

func minInt64(a, b int64) int64 {
	if a < b {
		return a
	}
	return b
}

func maxInt64(a, b int64) int64 {
	if a > b {
		return a
	}
	return b
}

func isPrime(n int) bool {
	if n <= 1 {
		return false
	}
	if n <= 3 {
		return true
	}
	if n%2 == 0 || n%3 == 0 {
		return false
	}
	
	for i := 5; i*i <= n; i += 6 {
		if n%i == 0 || n%(i+2) == 0 {
			return false
		}
	}
	return true
}

func sieve(n int) []int {
	isPrime := make([]bool, n+1)
	for i := range isPrime {
		isPrime[i] = true
	}
	isPrime[0], isPrime[1] = false, false
	
	for i := 2; i*i <= n; i++ {
		if isPrime[i] {
			for j := i * i; j <= n; j += i {
				isPrime[j] = false
			}
		}
	}
	
	var primes []int
	for i := 2; i <= n; i++ {
		if isPrime[i] {
			primes = append(primes, i)
		}
	}
	return primes
}

func binarySearch(arr []int, target int) int {
	left, right := 0, len(arr)-1
	for left <= right {
		mid := left + (right-left)/2
		if arr[mid] == target {
			return mid
		} else if arr[mid] < target {
			left = mid + 1
		} else {
			right = mid - 1
		}
	}
	return -1
}

// Graph algorithms
func dfs(graph [][]int, start int, visited []bool, result *[]int) {
	visited[start] = true
	*result = append(*result, start)
	
	for _, neighbor := range graph[start] {
		if !visited[neighbor] {
			dfs(graph, neighbor, visited, result)
		}
	}
}

func bfs(graph [][]int, start int) []int {
	visited := make([]bool, len(graph))
	queue := []int{start}
	var result []int
	
	for len(queue) > 0 {
		node := queue[0]
		queue = queue[1:]
		
		if !visited[node] {
			visited[node] = true
			result = append(result, node)
			
			for _, neighbor := range graph[node] {
				if !visited[neighbor] {
					queue = append(queue, neighbor)
				}
			}
		}
	}
	return result
}

// Array utility functions
func sumInts(arr []int) int {
	sum := 0
	for _, v := range arr {
		sum += v
	}
	return sum
}

func sumInt64s(arr []int64) int64 {
	sum := int64(0)
	for _, v := range arr {
		sum += v
	}
	return sum
}

func unique(arr []int) []int {
	sort.Ints(arr)
	if len(arr) == 0 {
		return arr
	}
	
	result := []int{arr[0]}
	for i := 1; i < len(arr); i++ {
		if arr[i] != arr[i-1] {
			result = append(result, arr[i])
		}
	}
	return result
}

// Solve function
func solve() {
	// Read input
	n := nextInt()
	
	// Example: Read array
	arr := readInts(n)
	
	// Your algorithm implementation here
	
	// Output result
	fmt.Fprintln(writer, "Result:")
}

func main() {
	defer writer.Flush()
	
	// For single test case
	solve()
	
	// For multiple test cases:
	// t := nextInt()
	// for i := 0; i < t; i++ {
	//     solve()
	// }
}
