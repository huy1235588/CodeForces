# 🚀 Hướng dẫn tạo cấu trúc thư mục

## 🛠️ Các bước thực hiện

### Bước 1: Tạo cấu trúc thư mục cơ bản
Chạy script PowerShell để tạo toàn bộ cấu trúc:

```powershell
# Tạo script tự động
$scriptContent = @'
# Script tạo cấu trúc thư mục algorithms

$basePath = "d:\Project\CodeForces\01-CORE-LEARNING\theory\algorithms"

# Basic algorithms
$basicDirs = @(
    "01-basic\searching\linear-search\implementation",
    "01-basic\searching\linear-search\examples", 
    "01-basic\searching\linear-search\exercises\solutions",
    "01-basic\searching\linear-search\visualization",
    "01-basic\searching\binary-search\implementation",
    "01-basic\searching\binary-search\examples",
    "01-basic\searching\binary-search\exercises\solutions", 
    "01-basic\searching\binary-search\visualization",
    "01-basic\searching\ternary-search\implementation",
    "01-basic\searching\ternary-search\examples",
    "01-basic\searching\ternary-search\exercises\solutions",
    "01-basic\searching\ternary-search\visualization",
    "01-basic\sorting\comparison-based\bubble-sort\implementation",
    "01-basic\sorting\comparison-based\bubble-sort\examples",
    "01-basic\sorting\comparison-based\bubble-sort\exercises\solutions",
    "01-basic\sorting\comparison-based\selection-sort\implementation",
    "01-basic\sorting\comparison-based\insertion-sort\implementation",
    "01-basic\sorting\comparison-based\merge-sort\implementation",
    "01-basic\sorting\comparison-based\quick-sort\implementation",
    "01-basic\sorting\comparison-based\heap-sort\implementation",
    "01-basic\sorting\non-comparison\counting-sort\implementation",
    "01-basic\sorting\non-comparison\radix-sort\implementation",
    "01-basic\sorting\non-comparison\bucket-sort\implementation",
    "01-basic\two-pointers\basic-technique\implementation",
    "01-basic\two-pointers\opposite-direction\implementation",
    "01-basic\two-pointers\same-direction\implementation",
    "01-basic\sliding-window\fixed-size\implementation",
    "01-basic\sliding-window\variable-size\implementation",
    "01-basic\prefix-sum\1d-prefix\implementation",
    "01-basic\prefix-sum\2d-prefix\implementation"
)

# Intermediate algorithms  
$intermediateDirs = @(
    "02-intermediate\graph-algorithms\traversal\dfs\implementation",
    "02-intermediate\graph-algorithms\traversal\dfs\examples",
    "02-intermediate\graph-algorithms\traversal\dfs\exercises\solutions",
    "02-intermediate\graph-algorithms\traversal\dfs\visualization",
    "02-intermediate\graph-algorithms\traversal\bfs\implementation",
    "02-intermediate\graph-algorithms\traversal\bfs\examples", 
    "02-intermediate\graph-algorithms\traversal\bfs\exercises\solutions",
    "02-intermediate\graph-algorithms\traversal\bfs\visualization",
    "02-intermediate\graph-algorithms\shortest-path\dijkstra\implementation",
    "02-intermediate\graph-algorithms\shortest-path\bellman-ford\implementation",
    "02-intermediate\graph-algorithms\shortest-path\floyd-warshall\implementation",
    "02-intermediate\graph-algorithms\minimum-spanning-tree\kruskal\implementation",
    "02-intermediate\graph-algorithms\minimum-spanning-tree\prim\implementation",
    "02-intermediate\dynamic-programming\fundamentals",
    "02-intermediate\dynamic-programming\classical-problems\fibonacci\implementation",
    "02-intermediate\dynamic-programming\classical-problems\lcs\implementation",
    "02-intermediate\dynamic-programming\classical-problems\lis\implementation",
    "02-intermediate\dynamic-programming\classical-problems\knapsack\01-knapsack\implementation",
    "02-intermediate\dynamic-programming\classical-problems\knapsack\unbounded-knapsack\implementation",
    "02-intermediate\dynamic-programming\classical-problems\edit-distance\implementation",
    "02-intermediate\dynamic-programming\dp-patterns\linear-dp\implementation",
    "02-intermediate\dynamic-programming\dp-patterns\interval-dp\implementation",
    "02-intermediate\dynamic-programming\dp-patterns\tree-dp\implementation",
    "02-intermediate\dynamic-programming\dp-patterns\digit-dp\implementation",
    "02-intermediate\dynamic-programming\dp-patterns\bitmask-dp\implementation",
    "02-intermediate\greedy-algorithms\fundamentals",
    "02-intermediate\greedy-algorithms\classic-problems\activity-selection\implementation",
    "02-intermediate\greedy-algorithms\classic-problems\fractional-knapsack\implementation",
    "02-intermediate\divide-and-conquer\fundamentals",
    "02-intermediate\divide-and-conquer\classic-problems\merge-sort\implementation",
    "02-intermediate\divide-and-conquer\classic-problems\quick-sort\implementation"
)

# Advanced algorithms
$advancedDirs = @(
    "03-advanced\string-algorithms\pattern-matching\naive\implementation",
    "03-advanced\string-algorithms\pattern-matching\kmp\implementation", 
    "03-advanced\string-algorithms\pattern-matching\rabin-karp\implementation",
    "03-advanced\string-algorithms\pattern-matching\z-algorithm\implementation",
    "03-advanced\string-algorithms\string-processing\manacher\implementation",
    "03-advanced\string-algorithms\string-processing\suffix-array\implementation",
    "03-advanced\number-theory\prime-numbers\sieve-of-eratosthenes\implementation",
    "03-advanced\number-theory\gcd-lcm\implementation",
    "03-advanced\computational-geometry\basic-geometry\implementation",
    "03-advanced\advanced-data-structures\segment-tree\implementation",
    "03-advanced\advanced-data-structures\fenwick-tree\implementation"
)

# Specialized
$specializedDirs = @(
    "04-specialized\competitive-programming\input-output-optimization",
    "04-specialized\competitive-programming\template-code",
    "04-specialized\approximation-algorithms\vertex-cover\implementation",
    "04-specialized\randomized-algorithms\randomized-quicksort\implementation"
)

# Practical
$practicalDirs = @(
    "05-practical\interview-preparation\common-patterns",
    "05-practical\interview-preparation\company-specific\google",
    "05-practical\interview-preparation\company-specific\facebook", 
    "05-practical\interview-preparation\company-specific\microsoft",
    "05-practical\real-world-applications\web-development",
    "05-practical\real-world-applications\machine-learning",
    "05-practical\optimization-techniques\time-complexity-optimization",
    "05-practical\optimization-techniques\space-complexity-optimization"
)

# Resources
$resourceDirs = @(
    "06-resources\cheat-sheets",
    "06-resources\visualization-tools", 
    "06-resources\practice-platforms",
    "06-resources\books-and-courses",
    "06-resources\tools-and-utilities\testing-frameworks",
    "06-resources\tools-and-utilities\performance-analysis"
)

# Combine all directories
$allDirs = $basicDirs + $intermediateDirs + $advancedDirs + $specializedDirs + $practicalDirs + $resourceDirs

# Create directories
foreach ($dir in $allDirs) {
    $fullPath = Join-Path $basePath $dir
    if (-not (Test-Path $fullPath)) {
        New-Item -ItemType Directory -Path $fullPath -Force
        Write-Host "Created: $fullPath" -ForegroundColor Green
    } else {
        Write-Host "Exists: $fullPath" -ForegroundColor Yellow
    }
}

Write-Host "✅ Cấu trúc thư mục đã được tạo thành công!" -ForegroundColor Green
'@

# Save script to file
$scriptContent | Out-File -FilePath "create_algorithm_structure.ps1" -Encoding UTF8

Write-Host "✅ Script đã được tạo: create_algorithm_structure.ps1"
Write-Host "📌 Chạy lệnh sau để tạo cấu trúc: .\create_algorithm_structure.ps1"
```

### Bước 2: Tạo README files cơ bản
```powershell
# Script tạo README files cho các thư mục chính

$basePath = "d:\Project\CodeForces\01-CORE-LEARNING\theory\algorithms"

# Tạo README cho các thư mục cấp cao
$readmeFiles = @{
    "01-basic\README.md" = "# 🏁 Basic Algorithms`n`nThuật toán cơ bản - nền tảng cho mọi lập trình viên."
    "01-basic\searching\README.md" = "# 🔍 Searching Algorithms`n`nCác thuật toán tìm kiếm từ cơ bản đến nâng cao."
    "01-basic\sorting\README.md" = "# 📊 Sorting Algorithms`n`nCác thuật toán sắp xếp quan trọng."
    "02-intermediate\README.md" = "# 🎯 Intermediate Algorithms`n`nThuật toán trung cấp cho competitive programming."
    "02-intermediate\graph-algorithms\README.md" = "# 🕸️ Graph Algorithms`n`nThuật toán đồ thị từ cơ bản đến nâng cao."
    "02-intermediate\dynamic-programming\README.md" = "# 🧩 Dynamic Programming`n`nQuy hoạch động - kỹ thuật quan trọng nhất."
    "03-advanced\README.md" = "# 🚀 Advanced Algorithms`n`nThuật toán nâng cao cho expert level."
    "04-specialized\README.md" = "# 🎖️ Specialized Algorithms`n`nThuật toán chuyên biệt cho từng lĩnh vực."
    "05-practical\README.md" = "# 💼 Practical Applications`n`nỨng dụng thực tế của các thuật toán."
    "06-resources\README.md" = "# 📚 Resources`n`nTài nguyên học tập và công cụ hỗ trợ."
}

foreach ($file in $readmeFiles.Keys) {
    $fullPath = Join-Path $basePath $file
    $content = $readmeFiles[$file]
    
    if (-not (Test-Path $fullPath)) {
        $content | Out-File -FilePath $fullPath -Encoding UTF8
        Write-Host "Created README: $fullPath" -ForegroundColor Green
    }
}

Write-Host "✅ README files đã được tạo!" -ForegroundColor Green
```

### Bước 3: Validation script
```powershell
# Script kiểm tra cấu trúc thư mục

function Test-AlgorithmStructure {
    param($BasePath)
    
    $requiredDirs = @(
        "01-basic\searching\linear-search",
        "01-basic\searching\binary-search", 
        "01-basic\sorting\comparison-based",
        "02-intermediate\graph-algorithms",
        "02-intermediate\dynamic-programming", 
        "03-advanced\string-algorithms",
        "04-specialized\competitive-programming",
        "05-practical\interview-preparation",
        "06-resources\cheat-sheets"
    )
    
    $missing = @()
    $existing = @()
    
    foreach ($dir in $requiredDirs) {
        $fullPath = Join-Path $BasePath $dir
        if (Test-Path $fullPath) {
            $existing += $dir
        } else {
            $missing += $dir
        }
    }
    
    Write-Host "✅ Existing directories: $($existing.Count)" -ForegroundColor Green
    Write-Host "❌ Missing directories: $($missing.Count)" -ForegroundColor Red
    
    if ($missing.Count -gt 0) {
        Write-Host "`nMissing directories:" -ForegroundColor Red
        foreach ($dir in $missing) {
            Write-Host "  - $dir" -ForegroundColor Red
        }
    }
    
    return $missing.Count -eq 0
}

# Chạy validation
$isValid = Test-AlgorithmStructure "d:\Project\CodeForces\01-CORE-LEARNING\theory\algorithms"

if ($isValid) {
    Write-Host "`n🎉 Cấu trúc thư mục hoàn hảo!" -ForegroundColor Green
} else {
    Write-Host "`n⚠️ Cần tạo thêm một số thư mục." -ForegroundColor Yellow
}
```

## 📋 Checklist thực hiện

- [ ] Chạy script tạo cấu trúc thư mục
- [ ] Tạo README files cho các thư mục chính  
- [ ] Copy template vào các thư mục thuật toán
- [ ] Validation cấu trúc
- [ ] Bắt đầu viết tài liệu cho thuật toán đầu tiên

## 🎯 Bước tiếp theo

1. Chọn thuật toán đầu tiên để viết tài liệu (recommend: Linear Search)
2. Sử dụng TEMPLATE.md để tạo README cho thuật toán đó
3. Implement code cho nhiều ngôn ngữ
4. Tạo examples và exercises
5. Lặp lại cho các thuật toán khác

Bạn có muốn tôi chạy script tạo cấu trúc ngay bây giờ không?
