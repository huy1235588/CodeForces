# 🔢 Mathematics for Competitive Programming

## Tổng quan
Toán học là nền tảng quan trọng trong lập trình thi đấu. Nhiều bài toán yêu cầu kiến thức toán học để tối ưu hóa thuật toán hoặc tìm ra công thức trực tiếp.

## 📚 Chủ đề chính

### 1. Number Theory (Lý thuyết số)

#### Basic Concepts
- **GCD (Greatest Common Divisor)**
  - Euclidean Algorithm: `gcd(a,b) = gcd(b, a%b)`
  - Extended Euclidean: `ax + by = gcd(a,b)`
  - Time complexity: O(log min(a,b))

- **LCM (Least Common Multiple)**
  - Formula: `lcm(a,b) = (a*b) / gcd(a,b)`

- **Prime Numbers**
  - Sieve of Eratosthenes: Find all primes ≤ n in O(n log log n)
  - Prime factorization: O(√n)
  - Primality testing: Miller-Rabin for large numbers

#### Modular Arithmetic
- **Properties**:
  - `(a + b) % m = (a % m + b % m) % m`
  - `(a * b) % m = (a % m * b % m) % m`
  - `(a - b) % m = (a % m - b % m + m) % m`

- **Modular Exponentiation**
  - Fast power: `a^b % m` in O(log b)
  - Fermat's Little Theorem: `a^(p-1) ≡ 1 (mod p)` nếu p là prime

- **Modular Inverse**
  - Extended Euclidean Algorithm
  - Fermat's Little Theorem: `a^(-1) ≡ a^(p-2) (mod p)`

#### Advanced Topics
- **Chinese Remainder Theorem**
- **Euler's Totient Function φ(n)**
- **Quadratic Residues**
- **Discrete Logarithm**

### 2. Combinatorics (Tổ hợp)

#### Basic Counting
- **Permutation**: P(n,r) = n!/(n-r)!
- **Combination**: C(n,r) = n!/(r!(n-r)!)
- **Pascal's Triangle**: C(n,r) = C(n-1,r-1) + C(n-1,r)

#### Advanced Counting
- **Stars and Bars**: Distribute n identical objects into k groups
- **Inclusion-Exclusion Principle**: |A∪B∪C| = |A| + |B| + |C| - |A∩B| - |A∩C| - |B∩C| + |A∩B∩C|
- **Derangements**: Count permutations with no fixed points
- **Catalan Numbers**: Binary trees, valid parentheses
- **Stirling Numbers**: Partition sets into subsets

#### Generating Functions
- **Ordinary Generating Functions**
- **Exponential Generating Functions**
- **Applications**: Fibonacci, partition problems

### 3. Geometry (Hình học)

#### 2D Geometry
- **Point và Vector Operations**
  - Distance: √((x₂-x₁)² + (y₂-y₁)²)
  - Dot product: a⃗·b⃗ = |a||b|cos(θ)
  - Cross product: a⃗×b⃗ = |a||b|sin(θ)

- **Line Operations**
  - Line equation: ax + by + c = 0
  - Point-to-line distance
  - Line intersection

- **Polygon Operations**
  - Area calculation: Shoelace formula
  - Point in polygon: Ray casting
  - Convex hull: Graham scan, Andrew's algorithm

#### 3D Geometry
- **3D Point và Vector**
- **Plane equations**
- **3D distance calculations**

#### Advanced Topics
- **Computational Geometry**
- **Closest Pair of Points**
- **Line Segment Intersection**
- **Voronoi Diagrams**

### 4. Probability & Statistics (Xác suất & Thống kê)

#### Basic Probability
- **Classical Definition**: P(A) = favorable outcomes / total outcomes
- **Conditional Probability**: P(A|B) = P(A∩B) / P(B)
- **Bayes' Theorem**: P(A|B) = P(B|A)P(A) / P(B)

#### Expected Value
- **Linearity**: E[X + Y] = E[X] + E[Y]
- **Expected value in games**
- **Random walks**

#### Distributions
- **Uniform Distribution**
- **Binomial Distribution**
- **Geometric Distribution**
- **Poisson Distribution**

## 🧮 Common Mathematical Tricks

### 1. Fast Computation
- **Binary Exponentiation**: a^n in O(log n)
- **Matrix Exponentiation**: For linear recurrences
- **Fast Multiplication**: Karatsuba algorithm

### 2. Optimization Techniques
- **Meet in the Middle**: Reduce O(2^n) to O(2^(n/2))
- **Square Root Decomposition**: Balance between O(1) và O(n)
- **Mathematical Insight**: Direct formula thay vì simulation

### 3. Useful Formulas
- **Arithmetic Series**: Σ(i=1 to n) i = n(n+1)/2
- **Geometric Series**: Σ(i=0 to n-1) r^i = (r^n - 1)/(r-1)
- **Sum of Squares**: Σ(i=1 to n) i² = n(n+1)(2n+1)/6
- **Fibonacci**: F(n) = (φ^n - ψ^n)/√5

## 🎯 Problem Types

### Number Theory Problems
- **GCD/LCM**: Finding patterns, optimization
- **Prime**: Factorization, prime counting
- **Modular**: Large number arithmetic, equations

### Combinatorial Problems
- **Counting**: Objects with constraints
- **Arrangement**: Permutations with restrictions
- **Selection**: Combinations with conditions

### Geometry Problems
- **Computational**: Closest points, convex hull
- **Coordinate**: Distance, area, intersection
- **Optimization**: Minimum enclosing circle

### Probability Problems
- **Games**: Expected score, optimal strategy
- **Random Process**: Markov chains, random walks
- **Statistics**: Mean, variance, distribution

## 📖 Study Plan

### Week 1-2: Number Theory Basics
- [ ] Implement GCD, LCM algorithms
- [ ] Sieve of Eratosthenes
- [ ] Basic modular arithmetic
- [ ] Fast exponentiation

### Week 3-4: Combinatorics Basics  
- [ ] Permutation và combination
- [ ] Pascal's triangle implementation
- [ ] Basic counting problems
- [ ] Stars and bars

### Week 5-6: Geometry Basics
- [ ] Point, line, vector operations
- [ ] Distance calculations
- [ ] Area calculations
- [ ] Basic intersection problems

### Week 7-8: Advanced Topics
- [ ] Advanced number theory
- [ ] Inclusion-exclusion principle
- [ ] Convex hull algorithms
- [ ] Probability calculations

## 💡 Tips for Mathematical Problems

### 1. Pattern Recognition
- Look for sequences: arithmetic, geometric, Fibonacci
- Check small cases manually
- Look for mathematical properties

### 2. Formula Derivation
- Try to find direct formula
- Use mathematical induction for proof
- Simplify complex expressions

### 3. Modular Arithmetic
- Always apply mod operations early
- Be careful with negative numbers
- Use modular inverse when needed

### 4. Precision Issues
- Use appropriate data types
- Be careful with floating point comparisons
- Consider using fractions instead of decimals

## 🔗 Resources

### Books
- "Concrete Mathematics" by Graham, Knuth, Patashnik
- "Introduction to Mathematical Thinking" by Keith Devlin
- "Art of Problem Solving" series

### Online Resources
- **OEIS**: Sequence database
- **Wolfram Alpha**: Mathematical computations
- **Khan Academy**: Basic mathematics review

### Practice Platforms
- **Project Euler**: Mathematical programming problems
- **SPOJ**: Mathematical contest problems
- **Codeforces**: Math tag problems
