# 💻 Code Templates & Solutions

Templates được tối ưu cho competitive programming và solutions cho các problems đã giải.

## 📁 Ngôn ngữ lập trình

### 🔥 `cpp/` - C++ (Ngôn ngữ chính)

Template C++ được tối ưu cho CP với:

-   Fast I/O
-   Common headers và macros
-   Utility functions thường dùng
-   Debug helpers

### 🐍 `python/` - Python

Template Python cho:

-   Quick prototyping
-   Math-heavy problems
-   String processing
-   Backup language cho contests

### ☕ `java/` - Java

Template Java cho:

-   Contest environments chỉ support Java
-   Big integer problems
-   OOP-heavy problems

### 🟨 `javascript/` - JavaScript

Template JS cho:

-   Web development projects
-   Node.js competitive programming
-   Quick scripting

### 🐹 `go/` - Go

Template Go cho:

-   Systems programming
-   Concurrent problems
-   Performance-critical applications

### 🏗️ `kotlin/` - Kotlin

Template Kotlin cho:

-   Android development
-   JVM competitive programming
-   Modern syntax preference

## 🎯 Template Features

### Standard Template Contents

-   **Fast I/O**: Optimized input/output
-   **Common Headers**: All frequently used libraries
-   **Macros**: Shorthand for common operations
-   **Utility Functions**: GCD, LCM, power, etc.
-   **Debug Helpers**: Debug prints and assertions
-   **Contest Structure**: Main function setup

### Language-Specific Optimizations

-   **C++**: `ios_base::sync_with_stdio(false)`, `cin.tie(NULL)`
-   **Python**: `sys.stdin.readline`, `input = sys.stdin.readline`
-   **Java**: `BufferedReader`, `PrintWriter` for fast I/O
-   **Go**: `bufio.Scanner` for efficient input
-   **Kotlin**: Extension functions for common operations

## 🚀 Usage

1. **Copy template** cho ngôn ngữ bạn chọn
2. **Rename file** theo contest/problem naming convention
3. **Implement solution** trong `solve()` function
4. **Test** với sample inputs
5. **Submit** khi confident

## 📊 Performance Tips

### C++ Optimizations

```cpp
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("avx2,bmi,bmi2,lzcnt,popcnt")
```

### Python Optimizations

```python
import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)
```

### Java Optimizations

```java
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
PrintWriter pw = new PrintWriter(System.out);
```

---

_💡 Tip: Customize templates based on your coding style và most common patterns_
