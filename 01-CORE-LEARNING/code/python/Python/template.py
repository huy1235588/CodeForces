#!/usr/bin/env python3
"""
Competitive Programming Template for Python
Author: Your Name
"""

import sys
import math
import bisect
from collections import defaultdict, deque, Counter
from heapq import heappush, heappop
from itertools import permutations, combinations, product
from functools import lru_cache

# Fast input
def fast_input():
    return sys.stdin.readline().strip()

def fast_int():
    return int(fast_input())

def fast_ints():
    return list(map(int, fast_input().split()))

def fast_float():
    return float(fast_input())

def fast_floats():
    return list(map(float, fast_input().split()))

# Constants
MOD = 10**9 + 7
INF = float('inf')
EPS = 1e-9

# Utility functions
def gcd(a, b):
    while b:
        a, b = b, a % b
    return a

def lcm(a, b):
    return a * b // gcd(a, b)

def power(base, exp, mod=MOD):
    """Fast exponentiation with modulo"""
    result = 1
    base = base % mod
    while exp > 0:
        if exp % 2 == 1:
            result = (result * base) % mod
        exp = exp >> 1
        base = (base * base) % mod
    return result

def is_prime(n):
    """Check if number is prime"""
    if n < 2:
        return False
    if n == 2:
        return True
    if n % 2 == 0:
        return False
    for i in range(3, int(math.sqrt(n)) + 1, 2):
        if n % i == 0:
            return False
    return True

def sieve(n):
    """Sieve of Eratosthenes"""
    is_prime = [True] * (n + 1)
    is_prime[0] = is_prime[1] = False
    for i in range(2, int(math.sqrt(n)) + 1):
        if is_prime[i]:
            for j in range(i * i, n + 1, i):
                is_prime[j] = False
    return [i for i in range(n + 1) if is_prime[i]]

def binary_search(arr, target):
    """Binary search implementation"""
    left, right = 0, len(arr) - 1
    while left <= right:
        mid = (left + right) // 2
        if arr[mid] == target:
            return mid
        elif arr[mid] < target:
            left = mid + 1
        else:
            right = mid - 1
    return -1

# Graph algorithms
def dfs(graph, start, visited=None):
    """Depth-First Search"""
    if visited is None:
        visited = set()
    visited.add(start)
    result = [start]
    for neighbor in graph[start]:
        if neighbor not in visited:
            result.extend(dfs(graph, neighbor, visited))
    return result

def bfs(graph, start):
    """Breadth-First Search"""
    visited = set()
    queue = deque([start])
    result = []
    
    while queue:
        vertex = queue.popleft()
        if vertex not in visited:
            visited.add(vertex)
            result.append(vertex)
            queue.extend(graph[vertex] - visited)
    return result

# Main function
def solve():
    """Main solving function"""
    # Read input
    n = fast_int()
    
    # Example: Read array
    arr = fast_ints()
    
    # Your algorithm implementation here
    
    # Output result
    print("Result:")

def main():
    """Main function for multiple test cases"""
    # For single test case, call solve() directly
    solve()
    
    # For multiple test cases:
    # t = fast_int()
    # for _ in range(t):
    #     solve()

if __name__ == "__main__":
    main()
