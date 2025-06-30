// Competitive Programming Template for JavaScript (Node.js)

// Fast I/O for Node.js
const fs = require('fs');
const input = fs.readFileSync(process.platform === 'linux' ? '/dev/stdin' : 'input.txt', 'utf8').trim().split('\n');
let inputIndex = 0;

function readLine() {
    return input[inputIndex++];
}

function readInt() {
    return parseInt(readLine());
}

function readInts() {
    return readLine().split(' ').map(Number);
}

function readFloat() {
    return parseFloat(readLine());
}

function readFloats() {
    return readLine().split(' ').map(parseFloat);
}

// Constants
const MOD = 1e9 + 7;
const INF = Number.MAX_SAFE_INTEGER;
const EPS = 1e-9;

// Utility functions
function gcd(a, b) {
    while (b !== 0) {
        [a, b] = [b, a % b];
    }
    return a;
}

function lcm(a, b) {
    return Math.floor(a * b / gcd(a, b));
}

function power(base, exp, mod = MOD) {
    let result = 1;
    base = base % mod;
    while (exp > 0) {
        if (exp % 2 === 1) {
            result = (result * base) % mod;
        }
        exp = Math.floor(exp / 2);
        base = (base * base) % mod;
    }
    return result;
}

function isPrime(n) {
    if (n <= 1) return false;
    if (n <= 3) return true;
    if (n % 2 === 0 || n % 3 === 0) return false;
    
    for (let i = 5; i * i <= n; i += 6) {
        if (n % i === 0 || n % (i + 2) === 0) {
            return false;
        }
    }
    return true;
}

function sieve(n) {
    const isPrime = new Array(n + 1).fill(true);
    isPrime[0] = isPrime[1] = false;
    
    for (let i = 2; i * i <= n; i++) {
        if (isPrime[i]) {
            for (let j = i * i; j <= n; j += i) {
                isPrime[j] = false;
            }
        }
    }
    
    const primes = [];
    for (let i = 2; i <= n; i++) {
        if (isPrime[i]) {
            primes.push(i);
        }
    }
    return primes;
}

function binarySearch(arr, target) {
    let left = 0, right = arr.length - 1;
    while (left <= right) {
        const mid = Math.floor((left + right) / 2);
        if (arr[mid] === target) {
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
function dfs(graph, start, visited = new Set()) {
    visited.add(start);
    const result = [start];
    
    for (const neighbor of graph[start] || []) {
        if (!visited.has(neighbor)) {
            result.push(...dfs(graph, neighbor, visited));
        }
    }
    return result;
}

function bfs(graph, start) {
    const visited = new Set();
    const queue = [start];
    const result = [];
    
    while (queue.length > 0) {
        const node = queue.shift();
        if (!visited.has(node)) {
            visited.add(node);
            result.push(node);
            
            for (const neighbor of graph[node] || []) {
                if (!visited.has(neighbor)) {
                    queue.push(neighbor);
                }
            }
        }
    }
    return result;
}

// Array utility functions
function sum(arr) {
    return arr.reduce((a, b) => a + b, 0);
}

function max(arr) {
    return Math.max(...arr);
}

function min(arr) {
    return Math.min(...arr);
}

function unique(arr) {
    return [...new Set(arr)];
}

function count(arr, element) {
    return arr.filter(x => x === element).length;
}

// Solve function
function solve() {
    // Read input
    const n = readInt();
    
    // Example: Read array
    const arr = readInts();
    
    // Your algorithm implementation here
    
    // Output result
    console.log("Result:");
}

// Main function
function main() {
    // For single test case
    solve();
    
    // For multiple test cases:
    // const t = readInt();
    // for (let i = 0; i < t; i++) {
    //     solve();
    // }
}

main();
