# 📁 Cấu trúc thư mục tài liệu thuật toán

## 🎯 Nguyên tắc tổ chức
- **Phân cấp theo độ khó**: Basic → Intermediate → Advanced
- **Mỗi thuật toán có thư mục riêng** với đầy đủ tài liệu
- **Cấu trúc thống nhất** cho mọi thuật toán
- **Tách biệt lý thuyết và thực hành**

## 📂 Cấu trúc đề xuất

```
algorithms/
├── README.md                           # Tổng quan và roadmap
├── FOLDER_STRUCTURE.md                 # File này - hướng dẫn tổ chức
├── TEMPLATE.md                         # Template cho tài liệu thuật toán
│
├── 01-basic/                          # Thuật toán cơ bản
│   ├── README.md                      # Tổng quan basic algorithms
│   ├── searching/
│   │   ├── README.md                  # Tổng quan tìm kiếm
│   │   ├── linear-search/
│   │   │   ├── README.md              # Lý thuyết + complexity
│   │   │   ├── implementation/
│   │   │   │   ├── python.py
│   │   │   │   ├── cpp.cpp
│   │   │   │   ├── java.java
│   │   │   │   └── javascript.js
│   │   │   ├── examples/
│   │   │   │   ├── basic-example.md
│   │   │   │   └── practical-use.md
│   │   │   ├── exercises/
│   │   │   │   ├── easy.md
│   │   │   │   └── solutions/
│   │   │   └── visualization/
│   │   │       └── step-by-step.md
│   │   ├── binary-search/
│   │   │   └── [cùng cấu trúc như linear-search]
│   │   ├── ternary-search/
│   │   └── exponential-search/
│   │
│   ├── sorting/
│   │   ├── README.md
│   │   ├── comparison-based/
│   │   │   ├── README.md
│   │   │   ├── bubble-sort/
│   │   │   ├── selection-sort/
│   │   │   ├── insertion-sort/
│   │   │   ├── merge-sort/
│   │   │   ├── quick-sort/
│   │   │   └── heap-sort/
│   │   └── non-comparison/
│   │       ├── README.md
│   │       ├── counting-sort/
│   │       ├── radix-sort/
│   │       └── bucket-sort/
│   │
│   ├── two-pointers/
│   │   ├── README.md
│   │   ├── basic-technique/
│   │   ├── opposite-direction/
│   │   └── same-direction/
│   │
│   ├── sliding-window/
│   │   ├── README.md
│   │   ├── fixed-size/
│   │   └── variable-size/
│   │
│   └── prefix-sum/
│       ├── README.md
│       ├── 1d-prefix/
│       └── 2d-prefix/
│
├── 02-intermediate/                   # Thuật toán trung cấp
│   ├── README.md
│   ├── graph-algorithms/
│   │   ├── README.md
│   │   ├── traversal/
│   │   │   ├── README.md
│   │   │   ├── dfs/
│   │   │   │   ├── README.md
│   │   │   │   ├── implementation/
│   │   │   │   ├── examples/
│   │   │   │   │   ├── connected-components.md
│   │   │   │   │   ├── cycle-detection.md
│   │   │   │   │   └── topological-sort.md
│   │   │   │   ├── exercises/
│   │   │   │   └── visualization/
│   │   │   └── bfs/
│   │   │       └── [cùng cấu trúc như dfs]
│   │   ├── shortest-path/
│   │   │   ├── README.md
│   │   │   ├── dijkstra/
│   │   │   ├── bellman-ford/
│   │   │   ├── floyd-warshall/
│   │   │   └── a-star/
│   │   ├── minimum-spanning-tree/
│   │   │   ├── README.md
│   │   │   ├── kruskal/
│   │   │   └── prim/
│   │   └── advanced-graph/
│   │       ├── strongly-connected-components/
│   │       ├── bipartite-matching/
│   │       └── network-flow/
│   │
│   ├── dynamic-programming/
│   │   ├── README.md
│   │   ├── fundamentals/
│   │   │   ├── README.md
│   │   │   ├── memoization-vs-tabulation.md
│   │   │   └── state-transition.md
│   │   ├── classical-problems/
│   │   │   ├── README.md
│   │   │   ├── fibonacci/
│   │   │   ├── lcs/              # Longest Common Subsequence
│   │   │   ├── lis/              # Longest Increasing Subsequence
│   │   │   ├── knapsack/
│   │   │   │   ├── 01-knapsack/
│   │   │   │   └── unbounded-knapsack/
│   │   │   └── edit-distance/
│   │   ├── dp-patterns/
│   │   │   ├── README.md
│   │   │   ├── linear-dp/
│   │   │   ├── interval-dp/
│   │   │   ├── tree-dp/
│   │   │   ├── digit-dp/
│   │   │   └── bitmask-dp/
│   │   └── optimization/
│   │       ├── space-optimization.md
│   │       └── convex-hull-trick.md
│   │
│   ├── greedy-algorithms/
│   │   ├── README.md
│   │   ├── fundamentals/
│   │   │   ├── README.md
│   │   │   └── greedy-choice-property.md
│   │   ├── classic-problems/
│   │   │   ├── activity-selection/
│   │   │   ├── fractional-knapsack/
│   │   │   ├── huffman-coding/
│   │   │   └── job-scheduling/
│   │   └── advanced/
│   │       ├── interval-scheduling/
│   │       └── matroids/
│   │
│   └── divide-and-conquer/
│       ├── README.md
│       ├── fundamentals/
│       ├── classic-problems/
│       │   ├── merge-sort/
│       │   ├── quick-sort/
│       │   ├── maximum-subarray/
│       │   └── closest-pair/
│       └── advanced/
│           ├── fft/               # Fast Fourier Transform
│           └── matrix-multiplication/
│
├── 03-advanced/                      # Thuật toán nâng cao
│   ├── README.md
│   ├── string-algorithms/
│   │   ├── README.md
│   │   ├── pattern-matching/
│   │   │   ├── README.md
│   │   │   ├── naive/
│   │   │   ├── kmp/
│   │   │   ├── rabin-karp/
│   │   │   ├── z-algorithm/
│   │   │   └── aho-corasick/
│   │   ├── string-processing/
│   │   │   ├── README.md
│   │   │   ├── manacher/         # Palindrome detection
│   │   │   ├── suffix-array/
│   │   │   ├── lcp-array/
│   │   │   └── suffix-tree/
│   │   └── advanced/
│   │       ├── string-hashing/
│   │       └── palindromic-tree/
│   │
│   ├── number-theory/
│   │   ├── README.md
│   │   ├── prime-numbers/
│   │   │   ├── sieve-of-eratosthenes/
│   │   │   └── miller-rabin/
│   │   ├── gcd-lcm/
│   │   ├── modular-arithmetic/
│   │   ├── chinese-remainder-theorem/
│   │   └── fast-exponentiation/
│   │
│   ├── computational-geometry/
│   │   ├── README.md
│   │   ├── basic-geometry/
│   │   ├── convex-hull/
│   │   ├── line-intersection/
│   │   └── closest-pair-of-points/
│   │
│   └── advanced-data-structures/
│       ├── README.md
│       ├── segment-tree/
│       ├── fenwick-tree/
│       ├── disjoint-set-union/
│       ├── trie/
│       └── heavy-light-decomposition/
│
├── 04-specialized/                   # Thuật toán chuyên biệt
│   ├── README.md
│   ├── competitive-programming/
│   │   ├── README.md
│   │   ├── input-output-optimization/
│   │   ├── template-code/
│   │   └── contest-strategies/
│   │
│   ├── approximation-algorithms/
│   │   ├── README.md
│   │   ├── vertex-cover/
│   │   └── traveling-salesman/
│   │
│   └── randomized-algorithms/
│       ├── README.md
│       ├── randomized-quicksort/
│       └── monte-carlo-methods/
│
├── 05-practical/                     # Ứng dụng thực tế
│   ├── README.md
│   ├── interview-preparation/
│   │   ├── README.md
│   │   ├── common-patterns/
│   │   ├── company-specific/
│   │   │   ├── google/
│   │   │   ├── facebook/
│   │   │   └── microsoft/
│   │   └── mock-interviews/
│   │
│   ├── real-world-applications/
│   │   ├── README.md
│   │   ├── web-development/
│   │   ├── machine-learning/
│   │   ├── game-development/
│   │   └── system-design/
│   │
│   └── optimization-techniques/
│       ├── README.md
│       ├── time-complexity-optimization/
│       ├── space-complexity-optimization/
│       └── cache-optimization/
│
└── 06-resources/                     # Tài nguyên bổ sung
    ├── README.md
    ├── cheat-sheets/
    │   ├── time-complexity.md
    │   ├── space-complexity.md
    │   └── algorithm-comparison.md
    ├── visualization-tools/
    │   ├── README.md
    │   └── links.md
    ├── practice-platforms/
    │   ├── README.md
    │   ├── codeforces.md
    │   ├── leetcode.md
    │   └── atcoder.md
    ├── books-and-courses/
    │   ├── README.md
    │   ├── recommended-books.md
    │   └── online-courses.md
    └── tools-and-utilities/
        ├── README.md
        ├── testing-frameworks/
        └── performance-analysis/
```

## 📋 Template cho mỗi thuật toán

Mỗi thư mục thuật toán sẽ có cấu trúc chuẩn:

```
algorithm-name/
├── README.md                  # Tài liệu chính
├── implementation/            # Code implementation
│   ├── python.py
│   ├── cpp.cpp
│   ├── java.java
│   └── javascript.js
├── examples/                  # Ví dụ minh họa
│   ├── basic-example.md
│   ├── advanced-example.md
│   └── edge-cases.md
├── exercises/                 # Bài tập thực hành
│   ├── easy.md
│   ├── medium.md
│   ├── hard.md
│   └── solutions/
│       ├── easy-solutions.md
│       ├── medium-solutions.md
│       └── hard-solutions.md
├── visualization/             # Mô phỏng trực quan
│   ├── step-by-step.md
│   ├── animations.md
│   └── diagrams/
├── analysis/                  # Phân tích chi tiết
│   ├── time-complexity.md
│   ├── space-complexity.md
│   └── comparison.md
└── applications/              # Ứng dụng thực tế
    ├── real-world-uses.md
    └── related-problems.md
```

## 🎯 Lợi ích của cấu trúc này

1. **Dễ điều hướng**: Phân cấp rõ ràng theo độ khó
2. **Thống nhất**: Mọi thuật toán đều có cấu trúc giống nhau
3. **Toàn diện**: Bao gồm lý thuyết, thực hành, và ứng dụng
4. **Mở rộng**: Dễ dàng thêm thuật toán mới
5. **Tìm kiếm**: Dễ tìm kiếm theo chủ đề hoặc độ khó
6. **Học tập**: Roadmap rõ ràng từ cơ bản đến nâng cao
