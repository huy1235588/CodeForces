# Go Template for Competitive Programming

## Compilation and Execution

### Run:
```bash
go run template.go
```

### Build and run:
```bash
go build template.go
./template
```

### With input file:
```bash
./template < input.txt
```

## Features

- Fast I/O with bufio.Scanner and bufio.Writer
- Utility functions: GCD, LCM, Power, Prime checking
- Sieve of Eratosthenes
- Binary search implementation
- Graph algorithms: DFS, BFS
- Array utility functions

## Usage

1. Copy the template
2. Implement your algorithm in the solve() function
3. Don't forget `defer writer.Flush()` in main()

## Tips

- Use `nextInt()` for single integer input
- Use `readInts(n)` for reading n integers
- For multiple test cases, uncomment the loop in main()
- Use slices instead of arrays for dynamic sizing
