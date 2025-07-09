# 🧩 Problem Solving Assistance Prompts

## 1. Problem Analysis

```
Act as an expert competitive programming coach. Help me analyze this problem systematically.

**Problem Statement:**
{PROBLEM_STATEMENT}

**Constraints:**
{CONSTRAINTS}

**Sample Input/Output:**
{SAMPLE_IO}

Please provide comprehensive analysis:

1. **Problem Understanding**:
   - Restate the problem trong your own words
   - Identify what we're asked to find/compute
   - Clarify any ambiguous parts
   - Edge cases to consider

2. **Constraint Analysis**:
   - What do the constraints tell us about expected complexity?
   - Are there special cases based on constraints?
   - Memory limitations
   - Time complexity requirements

3. **Pattern Recognition**:
   - What type of problem is this? (DP, Graph, Greedy, etc.)
   - Have you seen similar problems before?
   - Standard techniques that might apply
   - Red flags for common pitfalls

4. **Approach Brainstorming**:
   - List 2-3 possible approaches
   - Rough complexity estimate for each
   - Pros và cons of each approach
   - Which seems most promising và why

5. **Solution Outline**:
   - Step-by-step approach for best method
   - Key insights needed
   - Data structures required
   - Algorithm flow

My current skill level: {SKILL_LEVEL}
Preferred language: {LANGUAGE}
```

## 2. Approach Selection

```
I've identified multiple approaches for this problem và need help choosing the best one.

**Problem Context:**
- Problem type: {PROBLEM_TYPE}
- Constraints: {KEY_CONSTRAINTS}
- Time limit: {TIME_LIMIT}
- My skill level: {SKILL_LEVEL}

**Possible Approaches:**
1. {APPROACH_1}: {BRIEF_DESCRIPTION_1}
2. {APPROACH_2}: {BRIEF_DESCRIPTION_2}
3. {APPROACH_3}: {BRIEF_DESCRIPTION_3}

Please help me evaluate each approach on:

1. **Correctness**:
   - Does it handle all cases correctly?
   - Edge case coverage
   - Logical soundness

2. **Complexity**:
   - Time complexity analysis
   - Space complexity analysis
   - Meets constraint requirements?

3. **Implementation Difficulty**:
   - How complex to code?
   - Likelihood of bugs
   - Time to implement correctly

4. **Contest Suitability**:
   - Reliability under pressure
   - Code length
   - Debug-ability

5. **Learning Value**:
   - Teaches important concepts?
   - Reusable technique?
   - Good for skill development?

**Recommendation:**
- Which approach to choose và why?
- Implementation order if multiple approaches
- Fallback strategy if first approach fails

Provide specific reasoning và practical advice for contest scenario.
```

## 3. Solution Optimization

```
I have a working solution but need to optimize it for better performance hoặc cleaner code.

**Current Solution:**
```{LANGUAGE}
{CURRENT_CODE}
```

**Current Performance:**
- Time complexity: {CURRENT_TIME_COMPLEXITY}
- Space complexity: {CURRENT_SPACE_COMPLEXITY}
- Runtime result: {RUNTIME_STATUS} (TLE/AC/MLE)

**Optimization Goals:**
{OPTIMIZATION_GOALS} (speed/memory/code clarity/etc.)

Please provide optimization analysis:

1. **Performance Bottlenecks**:
   - Identify slow parts của code
   - Complexity analysis của each section
   - Memory usage patterns

2. **Algorithmic Optimizations**:
   - Better algorithm choices
   - Data structure improvements
   - Mathematical optimizations

3. **Implementation Optimizations**:
   - Code-level improvements
   - Compiler optimizations
   - Language-specific tricks

4. **Alternative Approaches**:
   - Different algorithms that might be faster
   - Trade-offs in implementation complexity
   - When to consider each alternative

5. **Optimized Solution**:
   - Provide improved code
   - Explain key changes
   - New complexity analysis

Include before/after comparison và explain the reasoning behind each optimization.
```

## 4. Debug Assistance

```
My solution isn't working correctly. Help me debug systematically.

**Problem Description:**
{PROBLEM_DESCRIPTION}

**My Solution:**
```{LANGUAGE}
{BUGGY_CODE}
```

**Error Information:**
- Expected output: {EXPECTED_OUTPUT}
- Actual output: {ACTUAL_OUTPUT}
- Error message (if any): {ERROR_MESSAGE}
- Test case that fails: {FAILING_TEST_CASE}

**What I've tried:**
{DEBUGGING_ATTEMPTS}

Please help with systematic debugging:

1. **Error Classification**:
   - Type of error (logic, implementation, edge case, etc.)
   - Likely location trong code
   - Severity assessment

2. **Code Analysis**:
   - Line-by-line review
   - Logic flow verification
   - Variable state tracking

3. **Test Case Analysis**:
   - Manual walkthrough của failing case
   - Intermediate results checking
   - Expected vs actual at each step

4. **Common Bug Patterns**:
   - Off-by-one errors
   - Integer overflow
   - Array bounds
   - Initialization issues

5. **Debugging Strategy**:
   - How to isolate the problem
   - Debug print statements to add
   - Test cases to try

6. **Fixed Solution**:
   - Corrected code
   - Explanation của fixes
   - How to avoid similar bugs

Provide step-by-step debugging guidance và teaching moments.
```

## 5. Code Review và Improvement

```
Please review my accepted solution và suggest improvements for better competitive programming practices.

**Problem:** {PROBLEM_NAME}
**Platform:** {PLATFORM}
**Difficulty:** {DIFFICULTY_RATING}

**My Solution:**
```{LANGUAGE}
{SOLUTION_CODE}
```

**Performance:**
- Time: {EXECUTION_TIME}
- Memory: {MEMORY_USAGE}
- Submission status: {STATUS}

Review focusing on:

1. **Code Quality**:
   - Readability và structure
   - Variable naming
   - Code organization
   - Comments (if any)

2. **Algorithmic Efficiency**:
   - Is this the optimal approach?
   - Any unnecessary operations?
   - Better data structures possible?

3. **Contest Best Practices**:
   - Code length optimization
   - Template usage
   - Error-prone patterns
   - Speed of implementation

4. **Learning Opportunities**:
   - Alternative solutions to consider
   - Techniques demonstrated
   - Concepts reinforced

5. **Improvement Suggestions**:
   - Specific code improvements
   - Style recommendations
   - Performance enhancements
   - Generalization opportunities

6. **Similar Problems**:
   - Related problems to practice
   - Variations of this technique
   - Next level challenges

Provide both praise for good practices và constructive suggestions for improvement.
```

## 6. Contest Strategy

```
I'm participating trong a {CONTEST_TYPE} contest. Help me develop a strategy.

**Contest Details:**
- Platform: {PLATFORM}
- Duration: {DURATION}
- Number of problems: {PROBLEM_COUNT}
- My rating: {CURRENT_RATING}
- Target performance: {TARGET_GOAL}

**My Strengths:**
{STRENGTH_AREAS}

**My Weaknesses:**
{WEAKNESS_AREAS}

**Time Management:**
{TIME_CONCERNS}

Develop a contest strategy covering:

1. **Pre-Contest Preparation**:
   - Code templates to prepare
   - Common algorithms to review
   - Mental preparation techniques

2. **Problem Reading Strategy**:
   - Order to read problems
   - Time allocation for reading
   - What to look for initially

3. **Problem Selection Order**:
   - Which problems to attempt first
   - How to prioritize based on my strengths
   - When to skip a problem

4. **Time Management**:
   - Time allocation per problem
   - When to move on
   - Buffer time for debugging

5. **Implementation Strategy**:
   - Speed vs accuracy trade-offs
   - When to code carefully vs quickly
   - Testing strategy

6. **Endgame Strategy**:
   - Last 30 minutes approach
   - Submission timing
   - Review priorities

7. **Backup Plans**:
   - What if I get stuck?
   - How to recover from mistakes?
   - Alternative approaches to try

Customize advice based on my skill level và contest format.
```

## Usage Examples

### Example 1: Analyzing a DP Problem
```
Act as an expert competitive programming coach. Help me analyze this problem systematically.

**Problem Statement:**
Given an array of integers, find the maximum sum of a subsequence với no two elements adjacent.

**Constraints:**
- 1 ≤ n ≤ 10^5
- -10^4 ≤ arr[i] ≤ 10^4

**Sample Input/Output:**
Input: [2, 1, 4, 9]
Output: 11 (2 + 9)

My current skill level: intermediate
Preferred language: C++
```

### Example 2: Optimizing TLE Solution
```
I have a working solution but need to optimize it for better performance.

**Current Solution:**
```cpp
// O(n^2) solution that gets TLE
for(int i = 0; i < n; i++) {
    for(int j = i+1; j < n; j++) {
        // some computation
    }
}
```

**Current Performance:**
- Time complexity: O(n^2)
- Space complexity: O(1)
- Runtime result: TLE on large inputs

**Optimization Goals:**
Reduce time complexity to pass all test cases
```

### Example 3: Debug Wrong Answer
```
My solution isn't working correctly. Help me debug systematically.

**Problem Description:**
Two Sum problem - find pair of numbers that add to target

**My Solution:**
```cpp
vector<int> twoSum(vector<int>& nums, int target) {
    for(int i = 0; i < nums.size(); i++) {
        for(int j = i; j < nums.size(); j++) {
            if(nums[i] + nums[j] == target) {
                return {i, j};
            }
        }
    }
    return {};
}
```

**Error Information:**
- Expected output: [0, 1]
- Actual output: [0, 0]
- Test case: nums = [2, 7, 11, 15], target = 9
```
