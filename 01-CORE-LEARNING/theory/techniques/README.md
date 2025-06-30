# 🧠 Problem Solving (Giải quyết vấn đề)

## Tổng quan
Kỹ năng giải quyết vấn đề là yếu tố quyết định thành công trong lập trình thi đấu. Phần này tập trung vào các kỹ thuật, pattern và chiến lược để tiếp cận và giải quyết bài toán hiệu quả.

## 🎯 Quy trình giải bài (Problem Solving Framework)

### 1. Đọc và hiểu đề bài (Understanding)
- [ ] Đọc kỹ đề bài, chú ý constraints
- [ ] Xác định input/output format
- [ ] Hiểu rõ yêu cầu và edge cases
- [ ] Làm ví dụ bằng tay để hiểu logic

### 2. Phân tích bài toán (Analysis)
- [ ] Xác định loại bài toán (DP, Graph, Greedy...)
- [ ] Ước tính độ phức tạp cần thiết từ constraints
- [ ] Xác định cấu trúc dữ liệu phù hợp
- [ ] Tìm pattern hoặc reduction về bài quen

### 3. Thiết kế giải pháp (Design)
- [ ] Brainstorm multiple approaches
- [ ] Chọn approach tối ưu nhất
- [ ] Break down thành sub-problems
- [ ] Xác định base cases và transitions

### 4. Implementation (Cài đặt)
- [ ] Code clean và modular
- [ ] Handle edge cases
- [ ] Optimize for time/space nếu cần
- [ ] Add comments cho logic phức tạp

### 5. Testing và Debug
- [ ] Test với examples cho sẵn
- [ ] Test edge cases
- [ ] Check overflow/underflow
- [ ] Verify time complexity

## 🔧 Kỹ thuật giải bài (Problem Solving Techniques)

### 1. Brute Force
- **Khi nào dùng**: Constraints nhỏ, hoặc để verify approach
- **Complexity**: Thường O(n!) hoặc O(2^n)
- **Example**: Generate all permutations/combinations

### 2. Two Pointers
- **Pattern**: Two indices moving through array
- **Use cases**: 
  - Sorted array problems
  - Palindrome checking
  - Target sum problems
- **Complexity**: O(n)

### 3. Sliding Window
- **Pattern**: Fixed/variable size window
- **Use cases**:
  - Subarray sum problems
  - String pattern matching
  - Maximum/minimum in subarrays
- **Complexity**: O(n)

### 4. Divide and Conquer
- **Pattern**: Break problem into smaller subproblems
- **Use cases**:
  - Sorting algorithms
  - Binary search variations
  - Tree problems
- **Complexity**: Often O(n log n)

### 5. Binary Search
- **Pattern**: Search in sorted space
- **Use cases**:
  - Find element in sorted array
  - Binary search on answer
  - Lower/upper bound finding
- **Complexity**: O(log n)

### 6. Greedy
- **Pattern**: Make locally optimal choice
- **Use cases**:
  - Activity selection
  - Interval problems
  - Minimum/maximum problems
- **Key**: Prove greedy choice is optimal

### 7. Dynamic Programming
- **Pattern**: Optimal substructure + overlapping subproblems
- **Use cases**:
  - Optimization problems
  - Counting problems
  - Decision problems
- **Types**: Top-down (memoization), Bottom-up (tabulation)

## 📋 Problem Patterns (Các pattern thường gặp)

### 1. Array/String Patterns
- **Subarray Sum**: Prefix sum, sliding window
- **Two Sum**: Hash map, two pointers
- **Longest Subarray**: Sliding window, DP
- **Pattern Matching**: KMP, Z-algorithm

### 2. Tree Patterns  
- **Tree Traversal**: DFS, BFS variations
- **Path Problems**: Root-to-leaf, any-to-any
- **LCA**: Binary lifting, Euler tour
- **Tree DP**: Sum/max over subtrees

### 3. Graph Patterns
- **Shortest Path**: Dijkstra, Bellman-Ford, Floyd-Warshall
- **Connectivity**: DFS, BFS, Union-Find
- **Cycle Detection**: DFS coloring, topological sort
- **Bipartite**: 2-coloring with DFS/BFS

### 4. DP Patterns
- **Linear DP**: 1D array, transition from previous states
- **2D DP**: Grid problems, string matching
- **Interval DP**: Matrix chain, palindrome
- **Tree DP**: Root/reroot, subtree optimization
- **Bitmask DP**: Subset enumeration, TSP

### 5. Mathematical Patterns
- **Number Theory**: GCD, Prime, Modular arithmetic
- **Combinatorics**: Permutation, combination, inclusion-exclusion
- **Geometry**: Coordinate geometry, convex hull
- **Game Theory**: Nim, minimax, optimal strategy

## ⏱️ Time Management trong Contest

### Phase 1: Reading (5-10 minutes)
- Đọc tất cả bài trong contest
- Rank bài theo độ khó (dự đoán)
- Chọn order giải bài

### Phase 2: Solving (Main time)
- Bắt đầu với bài dễ nhất
- Aim for AC trong 15-30 phút/bài
- Nếu stuck > 45 phút, chuyển sang bài khác

### Phase 3: Checking (Last 15 minutes)
- Review code cho edge cases
- Submit pending solutions
- Debug nếu có WA

## 🐛 Common Mistakes và Debugging

### Implementation Mistakes
- **Array indexing**: 0-based vs 1-based
- **Loop bounds**: off-by-one errors
- **Integer overflow**: Use long long khi cần
- **Uninitialized variables**: Initialize arrays/variables

### Logic Mistakes  
- **Wrong base case**: DP/recursion base cases
- **Missing edge cases**: Empty input, single element
- **Wrong complexity**: TLE due to inefficient algorithm
- **Precision errors**: Float comparison, integer division

### Debugging Strategies
1. **Print debug**: Add debug prints for intermediate values
2. **Test small cases**: Start with minimal examples
3. **Trace execution**: Follow algorithm step-by-step
4. **Compare with brute force**: Verify with simpler solution

## 📈 Skill Development Path

### Beginner (Rating 0-1200)
- [ ] Master basic implementation
- [ ] Learn common STL functions
- [ ] Practice ad-hoc problems
- [ ] Build speed in coding

### Intermediate (Rating 1200-1600)  
- [ ] Master basic algorithms
- [ ] Learn common problem patterns
- [ ] Practice DP and graph problems
- [ ] Improve problem analysis skills

### Advanced (Rating 1600-2000)
- [ ] Master advanced data structures
- [ ] Learn optimization techniques
- [ ] Practice mathematical problems
- [ ] Develop contest strategies

### Expert (Rating 2000+)
- [ ] Master complex algorithms
- [ ] Learn problem-setting techniques
- [ ] Practice very hard problems
- [ ] Mentor others

## 🔗 Practice Resources

### Online Judges
- **Beginner**: AtCoder Beginner Contest
- **Intermediate**: Codeforces Div 2
- **Advanced**: Codeforces Div 1, TopCoder

### Problem Categories
- **Implementation**: Ad-hoc, simulation
- **Mathematics**: Number theory, combinatorics
- **Algorithms**: DP, graph, string
- **Data Structures**: Segment tree, persistent DS

### Books
- "Competitive Programming" by Steven & Felix Halim
- "Guide to Competitive Programming" by Antti Laaksonen
- "Programming Pearls" by Jon Bentley
