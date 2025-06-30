# Kotlin Template for Competitive Programming

## Compilation and Execution

### Compile:
```bash
kotlinc template.kt -include-runtime -d template.jar
```

### Run:
```bash
java -jar template.jar
```

### Or compile and run directly:
```bash
kotlinc template.kt && kotlin TemplateKt
```

### With input file:
```bash
kotlin TemplateKt < input.txt
```

## Features

- FastScanner and FastPrinter classes for efficient I/O
- Utility functions: GCD, LCM, Power, Prime checking
- Sieve of Eratosthenes
- Binary search implementation
- Graph algorithms: DFS, BFS
- Extension functions for arrays

## Usage

1. Copy the template
2. Implement your algorithm in the solve() function
3. Don't forget to close the FastPrinter

## Tips

- Use `nextInt()` for single integer input
- Use `nextInts(n)` for reading n integers
- For multiple test cases, use `repeat(t)` loop
- Use extension functions for cleaner code
