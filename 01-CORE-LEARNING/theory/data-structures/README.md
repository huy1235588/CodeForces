# 🏗️ Data Structures (Cấu trúc dữ liệu)

## Tổng quan
Cấu trúc dữ liệu là nền tảng quan trọng trong lập trình. Hiểu rõ các cấu trúc dữ liệu giúp bạn chọn giải pháp tối ưu cho từng bài toán.

## 📚 Danh sách cấu trúc dữ liệu

### 1. Basic Data Structures (Cơ bản)
- **Array**: Mảng tĩnh và động
- **String**: Xử lý chuỗi ký tự  
- **Matrix**: Mảng 2 chiều
- **Vector**: Dynamic array (C++)

### 2. Linear Data Structures (Tuyến tính)
- **Stack**: Last In First Out (LIFO)
  - Applications: Expression evaluation, Backtracking
- **Queue**: First In First Out (FIFO)
  - Applications: BFS, Process scheduling
- **Deque**: Double-ended queue
- **Linked List**: 
  - Singly Linked List
  - Doubly Linked List
  - Circular Linked List

### 3. Tree Data Structures (Cây)
- **Binary Tree**: Cây nhị phân
- **Binary Search Tree (BST)**: Cây tìm kiếm nhị phân
- **AVL Tree**: Self-balancing BST
- **Red-Black Tree**: Self-balancing BST
- **Heap**: Min-heap và Max-heap
  - Priority Queue implementation
- **Trie**: Prefix tree cho string
- **B-Tree**: Multi-way tree

### 4. Advanced Data Structures (Nâng cao)
- **Segment Tree**: Truy vấn range và update
  - Point update, Range query
  - Range update với Lazy propagation
- **Fenwick Tree (BIT)**: Binary Indexed Tree
  - Prefix sum queries
- **Union Find (DSU)**: Disjoint Set Union
  - Path compression
  - Union by rank
- **Hash Table**: Bảng băm
- **Bloom Filter**: Probabilistic data structure

## 📊 So sánh độ phức tạp

| Data Structure | Access | Search | Insertion | Deletion | Space |
|---------------|--------|--------|-----------|----------|--------|
| Array | O(1) | O(n) | O(n) | O(n) | O(n) |
| Stack | O(n) | O(n) | O(1) | O(1) | O(n) |
| Queue | O(n) | O(n) | O(1) | O(1) | O(n) |
| Linked List | O(n) | O(n) | O(1) | O(1) | O(n) |
| BST | O(log n) | O(log n) | O(log n) | O(log n) | O(n) |
| Heap | O(log n) | O(n) | O(log n) | O(log n) | O(n) |
| Hash Table | N/A | O(1) | O(1) | O(1) | O(n) |

## 🎯 Lộ trình học tập

### Week 1-2: Basic
- [ ] Array operations và techniques
- [ ] String manipulation
- [ ] Matrix traversal patterns

### Week 3-4: Linear
- [ ] Stack implementation và applications
- [ ] Queue implementation và BFS
- [ ] Linked List operations

### Week 5-8: Trees
- [ ] Binary Tree traversal (Inorder, Preorder, Postorder)
- [ ] BST operations
- [ ] Heap implementation và Priority Queue
- [ ] Trie cho string problems

### Week 9-12: Advanced
- [ ] Segment Tree cho range queries
- [ ] Fenwick Tree cho prefix sum
- [ ] Union Find cho connectivity
- [ ] Hash Table và collision handling

## 💡 Tips và Tricks

### Array
- **Two Pointers**: Giải quyết problems trong O(n)
- **Sliding Window**: Tối ưu cho subarray problems
- **Prefix Sum**: Tính tổng range trong O(1)

### Tree
- **DFS**: Recursion cho tree traversal
- **Level Order**: BFS cho từng level
- **Parent Tracking**: Lưu parent để reconstruct path

### Advanced
- **Segment Tree**: 
  - Build: O(n), Query: O(log n), Update: O(log n)
  - Lazy propagation cho range updates
- **Union Find**:
  - Path compression: Tối ưu find operation
  - Union by rank: Tối ưu union operation

## 🔍 Khi nào sử dụng?

### Stack
- Expression evaluation và parsing
- Backtracking algorithms
- Function call management
- Undo operations

### Queue
- BFS traversal
- Process scheduling
- Buffer cho data streams

### Heap
- Priority Queue operations
- Heap Sort algorithm
- K-th largest/smallest elements
- Median maintenance

### Segment Tree
- Range sum/min/max queries
- Range updates
- Counting problems với ranges

### Union Find
- Connected components
- Kruskal's MST algorithm
- Network connectivity

## 📖 Tài liệu tham khảo
- **Visualization**: [Data Structure Visualizations](https://www.cs.usfca.edu/~galles/visualization/Algorithms.html)
- **Practice**: 
  - LeetCode Data Structure tag
  - HackerRank Data Structures
  - CSES Problem Set
- **Books**: 
  - Data Structures and Algorithms in C++ (Goodrich)
  - Introduction to Algorithms (CLRS)
