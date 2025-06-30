# 🔬 Code Analysis Prompts

## 1. Comprehensive Code Review

```
Act as a senior competitive programming expert. Please conduct a thorough code review của my solution.

**Problem Context:**
- Problem: {PROBLEM_NAME}
- Platform: {PLATFORM}
- Difficulty: {DIFFICULTY_LEVEL}
- Time limit: {TIME_LIMIT}
- Memory limit: {MEMORY_LIMIT}

**My Solution:**
```{LANGUAGE}
{CODE_TO_REVIEW}
```

**Performance Results:**
- Status: {SUBMISSION_STATUS}
- Runtime: {EXECUTION_TIME}
- Memory usage: {MEMORY_USAGE}
- Test cases passed: {PASSED_CASES}/{TOTAL_CASES}

Please review across these dimensions:

1. **Correctness Analysis**:
   - Algorithm correctness verification
   - Edge case handling
   - Boundary condition checks
   - Input validation

2. **Efficiency Assessment**:
   - Time complexity analysis
   - Space complexity analysis
   - Bottleneck identification
   - Optimization opportunities

3. **Code Quality**:
   - Readability và maintainability
   - Variable naming conventions
   - Code structure và organization
   - Documentation quality

4. **Competitive Programming Best Practices**:
   - Template usage effectiveness
   - Contest-friendly patterns
   - Common CP optimizations
   - Error-prone constructs

5. **Robustness**:
   - Error handling
   - Integer overflow considerations
   - Memory management
   - Defensive programming

6. **Alternative Approaches**:
   - Different algorithmic approaches
   - Trade-offs analysis
   - When each approach is preferred

Provide specific, actionable feedback với code examples where helpful.
```

## 2. Complexity Analysis Deep Dive

```
I need detailed complexity analysis của my solution to understand its performance characteristics.

**Code for Analysis:**
```{LANGUAGE}
{CODE_TO_ANALYZE}
```

**Problem Constraints:**
{CONSTRAINT_DETAILS}

Please provide comprehensive complexity analysis:

1. **Time Complexity Analysis**:
   - Line-by-line complexity breakdown
   - Loop analysis và nesting levels
   - Recursive call analysis (if any)
   - Overall worst-case complexity
   - Average-case complexity (if different)
   - Best-case complexity

2. **Space Complexity Analysis**:
   - Memory usage breakdown
   - Auxiliary space requirements
   - Stack space for recursion
   - Input space considerations
   - Overall space complexity

3. **Practical Performance**:
   - Expected runtime for given constraints
   - Memory usage estimates
   - Scalability analysis
   - Performance bottlenecks

4. **Comparison với Optimal**:
   - Is this the best possible complexity?
   - Known lower bounds for this problem
   - Gap analysis if suboptimal

5. **Optimization Potential**:
   - Where improvements are possible
   - Trade-offs in optimization
   - Alternative data structures
   - Algorithm modifications

6. **Real-world Performance**:
   - Constant factors consideration
   - Cache efficiency
   - Compiler optimizations
   - Platform-specific considerations

Include mathematical reasoning và practical implications for competitive programming.
```

## 3. Bug Detection và Prevention

```
Analyze my code for potential bugs, including subtle ones that might not appear trong basic testing.

**Code to Analyze:**
```{LANGUAGE}
{POTENTIALLY_BUGGY_CODE}
```

**Problem Description:**
{PROBLEM_DESCRIPTION}

**Testing Results:**
- Passes sample tests: {SAMPLE_RESULT}
- Issues encountered: {ISSUE_DESCRIPTION}

Conduct systematic bug analysis:

1. **Logic Errors**:
   - Algorithm implementation correctness
   - Condition checking accuracy
   - Loop logic verification
   - State management issues

2. **Implementation Bugs**:
   - Off-by-one errors
   - Array bounds violations
   - Null pointer/reference issues
   - Uninitialized variables

3. **Data Type Issues**:
   - Integer overflow possibilities
   - Precision loss trong floating point
   - Signed/unsigned mismatches
   - Type conversion problems

4. **Edge Case Vulnerabilities**:
   - Empty input handling
   - Single element cases
   - Maximum constraint values
   - Special input patterns

5. **Concurrency Issues** (if applicable):
   - Race conditions
   - Deadlock potential
   - Thread safety

6. **Platform-Specific Bugs**:
   - Compiler-dependent behavior
   - Operating system differences
   - Architecture-specific issues

7. **Prevention Strategies**:
   - Coding patterns to avoid these bugs
   - Testing strategies
   - Defensive programming techniques
   - Code review checklists

For each potential bug, provide:
- Exact location trong code
- Conditions under which it occurs
- Impact assessment
- Fix recommendations
- Prevention advice
```

## 4. Performance Optimization Analysis

```
Analyze my code for performance optimization opportunities trong competitive programming context.

**Current Implementation:**
```{LANGUAGE}
{CODE_TO_OPTIMIZE}
```

**Performance Context:**
- Current runtime: {CURRENT_RUNTIME}
- Time limit: {TIME_LIMIT}
- Memory usage: {CURRENT_MEMORY}
- Memory limit: {MEMORY_LIMIT}
- Constraint size: {PROBLEM_CONSTRAINTS}

Identify optimization opportunities:

1. **Algorithmic Optimizations**:
   - More efficient algorithms
   - Better data structure choices
   - Mathematical optimizations
   - Precomputation opportunities

2. **Implementation Optimizations**:
   - Loop optimizations
   - Function call overhead reduction
   - Memory access patterns
   - Cache-friendly modifications

3. **Language-Specific Optimizations**:
   - Compiler optimization hints
   - STL usage improvements
   - Language-specific tricks
   - Built-in function utilization

4. **I/O Optimizations**:
   - Fast input/output methods
   - Buffering strategies
   - Parsing optimizations

5. **Memory Optimizations**:
   - Memory layout improvements
   - Redundant storage elimination
   - Memory reuse strategies
   - Space-time trade-offs

6. **Micro-optimizations**:
   - Bit manipulation tricks
   - Arithmetic optimizations
   - Branching improvements
   - Loop unrolling potential

7. **Profiling Insights**:
   - Where time is actually spent
   - Memory allocation patterns
   - Cache miss analysis

For each optimization, provide:
- Expected performance improvement
- Implementation difficulty
- Code readability impact
- Risk assessment
- Alternative approaches
```

## 5. Code Comparison và Best Practices

```
Compare multiple implementations of the same solution và identify best practices.

**Problem:** {PROBLEM_NAME}

**Implementation A:**
```{LANGUAGE}
{IMPLEMENTATION_A}
```

**Implementation B:**
```{LANGUAGE}
{IMPLEMENTATION_B}
```

**Implementation C (if applicable):**
```{LANGUAGE}
{IMPLEMENTATION_C}
```

Compare implementations across:

1. **Correctness**:
   - Which implementations are correct?
   - Edge case handling comparison
   - Robustness assessment

2. **Performance**:
   - Time complexity comparison
   - Space complexity comparison
   - Practical performance differences
   - Scalability characteristics

3. **Readability**:
   - Code clarity và understandability
   - Maintainability assessment
   - Documentation quality
   - Variable naming

4. **Contest Suitability**:
   - Implementation speed
   - Error probability
   - Debugging ease
   - Memory efficiency

5. **Best Practices Demonstration**:
   - Which follows CP best practices?
   - Template usage effectiveness
   - Common pattern utilization
   - Style consistency

6. **Learning Value**:
   - Which teaches better techniques?
   - Reusability của approaches
   - Skill development benefits

7. **Recommendation**:
   - Best implementation for different scenarios
   - When to use each approach
   - Hybrid possibilities

8. **Improvement Suggestions**:
   - How to combine best aspects
   - Common improvements applicable
   - Future learning directions

Provide detailed comparison matrix và specific recommendations.
```

## 6. Security và Robustness Analysis

```
Analyze my competitive programming code for robustness và potential security issues (even though security isn't typically a CP concern, robustness is important).

**Code for Analysis:**
```{LANGUAGE}
{CODE_TO_ANALYZE}
```

**Analysis Focus:**

1. **Input Validation**:
   - Handling of malformed input
   - Buffer overflow prevention
   - Integer overflow protection
   - Range checking

2. **Error Handling**:
   - Graceful failure modes
   - Resource cleanup
   - Exception safety
   - Assertion usage

3. **Resource Management**:
   - Memory leak prevention
   - Resource acquisition/release
   - Stack overflow prevention
   - Infinite loop protection

4. **Numerical Stability**:
   - Floating point precision issues
   - Integer arithmetic overflow
   - Division by zero handling
   - Modular arithmetic correctness

5. **Robustness Patterns**:
   - Defensive programming techniques
   - Fail-fast principles
   - Redundancy và verification
   - Graceful degradation

6. **Contest-Specific Robustness**:
   - Time limit considerations
   - Memory limit handling
   - Judge system compatibility
   - Platform portability

7. **Best Practices**:
   - Coding standards adherence
   - Common pitfall avoidance
   - Maintainable error handling
   - Testing strategies

Provide recommendations for improving code robustness while maintaining competitive programming efficiency.
```

## Usage Examples

### Example 1: Review DP Solution
```
Act as a senior competitive programming expert. Please conduct a thorough code review của my solution.

**Problem Context:**
- Problem: Longest Increasing Subsequence
- Platform: Codeforces
- Difficulty: 1600
- Time limit: 2 seconds
- Memory limit: 256 MB

**My Solution:**
```cpp
#include<bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int> a(n);
    for(int i = 0; i < n; i++) cin >> a[i];
    
    vector<int> dp(n, 1);
    for(int i = 1; i < n; i++) {
        for(int j = 0; j < i; j++) {
            if(a[j] < a[i]) {
                dp[i] = max(dp[i], dp[j] + 1);
            }
        }
    }
    
    cout << *max_element(dp.begin(), dp.end()) << endl;
    return 0;
}
```

**Performance Results:**
- Status: Accepted
- Runtime: 1.2 seconds
- Memory usage: 45 MB
- Test cases passed: 50/50
```

### Example 2: Complexity Analysis
```
I need detailed complexity analysis của my solution to understand its performance characteristics.

**Code for Analysis:**
```cpp
void solve() {
    int n = read();
    vector<vector<int>> adj(n);
    
    for(int i = 0; i < n-1; i++) {
        int u = read(), v = read();
        adj[u].push_back(v);
        adj[v].push_back(u);
    }
    
    function<int(int, int)> dfs = [&](int u, int parent) -> int {
        int result = 1;
        for(int v : adj[u]) {
            if(v != parent) {
                result += dfs(v, u);
            }
        }
        return result;
    };
    
    cout << dfs(0, -1) << "\n";
}
```

**Problem Constraints:**
- 1 ≤ n ≤ 10^5
- Tree structure guaranteed
```
