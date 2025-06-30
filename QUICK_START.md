# 🚀 Quick Start Guide - New Workspace Structure

Chào mừng bạn đến với workspace CodeForces đã được tối ưu! Đây là hướng dẫn nhanh để bắt đầu sử dụng.

## ⚡ Immediate Actions (5 phút đầu)

### 1. Test C++ Template

```bash
# Mở VS Code tại workspace root
code .

# Navigate đến template
cd 01-CORE-LEARNING/code/cpp

# Test compile (already successful!)
g++ -std=c++17 -O2 -Wall -Wextra -DLOCAL template.cpp -o template
```

### 2. Setup Daily Practice Routine

```bash
# Tạo thư mục cho practice hôm nay
cd 01-CORE-LEARNING/practice/daily/morning-warmup
mkdir 2025-06-29
cd 2025-06-29

# Copy template cho bài đầu tiên
copy ../../../code/cpp/template.cpp problem1.cpp
```

### 3. Configure VS Code

-   ✅ VS Code tasks đã được setup
-   ✅ Settings đã được optimize cho CP
-   ✅ Build shortcuts: `Ctrl+Shift+P` → "Tasks: Run Task" → "C++: Build and Run"

## 🎯 First Week Plan

### Day 1-2: Familiarization

-   [ ] Explore new structure
-   [ ] Test VS Code tasks
-   [ ] Solve 2-3 easy problems using new template
-   [ ] Setup contest folder cho weekend contest

### Day 3-5: Practice Routine

-   [ ] Morning warmup: 1 easy problem (15 phút)
-   [ ] Evening challenge: 1 medium problem (45 phút)
-   [ ] Review và document solutions

### Day 6-7: Contest & Review

-   [ ] Participate in CF/AtCoder contest
-   [ ] Analyze performance
-   [ ] Plan next week topics

## 📁 Key Directories to Bookmark

### Daily Use (80% thời gian)

-   `01-CORE-LEARNING/code/cpp/template.cpp` - Template chính
-   `01-CORE-LEARNING/practice/daily/` - Daily practice
-   `01-CORE-LEARNING/practice/contests/codeforces/` - Contest solutions

### Learning (15% thời gian)

-   `01-CORE-LEARNING/theory/algorithms/` - Algorithm concepts
-   `01-CORE-LEARNING/theory/data-structures/` - DS concepts
-   `01-CORE-LEARNING/practice/by-topic/` - Topic-focused practice

### Utilities (5% thời gian)

-   `05-UTILITIES/ai-prompts/` - AI assistance
-   `05-UTILITIES/configs/` - Configuration files

## ⌨️ VS Code Shortcuts

### Tasks (Ctrl+Shift+P)

-   **"C++: Build and Run"** - Compile và run C++
-   **"C++: Build for Contest"** - Optimized build
-   **"Create New Contest Folder"** - Setup contest structure
-   **"Python: Run"** - Run Python files

### Custom Shortcuts (đã setup)

-   `Ctrl+B` - Build current file
-   `F5` - Debug mode
-   `Ctrl+`` - Open terminal

## 🏆 Contest Workflow

### Pre-Contest (5 phút trước)

1. Run VS Code task: "Create New Contest Folder"
2. Enter contest name (e.g., "cf-round-900")
3. Folder structure tự động tạo: A.cpp, B.cpp, C.cpp, D.cpp, E.cpp, F.cpp
4. Mở browser và VS Code side by side

### During Contest

1. Read problem A
2. Modify A.cpp từ template
3. Test với sample inputs
4. Submit khi confident
5. Repeat cho problems tiếp theo

### Post-Contest

1. Move solutions vào appropriate rating folder
2. Add editorial notes
3. Analyze performance metrics

## 📊 Progress Tracking

### Daily

-   Problems solved count
-   Time per problem
-   Success rate

### Weekly

-   Contest performance
-   Rating changes
-   Topic mastery progress

### Monthly

-   Overall skill assessment
-   Adjust learning focus
-   Update goals

## 🎯 Success Metrics (First Month)

### Technical Goals

-   [ ] Solve 50+ problems
-   [ ] Participate in 4+ contests
-   [ ] Master basic algorithms (sorting, searching, two pointers)
-   [ ] Achieve rating > 1200 (if starting from newbie)

### Workflow Goals

-   [ ] Comfortable với new structure
-   [ ] Efficient contest setup (< 2 phút)
-   [ ] Consistent daily practice routine
-   [ ] Using AI prompts effectively

## 🆘 Troubleshooting

### Template không compile

```bash
# Check compiler path
g++ --version

# Try simple compile
g++ template.cpp -o test
```

### VS Code tasks không hoạt động

1. Check `.vscode/tasks.json` exists
2. Reload VS Code window
3. Check compiler path trong settings

### Contest folder creation fails

1. Check PowerShell execution policy
2. Run PowerShell as admin if needed
3. Manual create: copy template manually

## 🎉 You're Ready!

Workspace đã được setup hoàn chỉnh và tối ưu cho competitive programming. Hãy bắt đầu với daily practice routine và enjoy the improved productivity!

**Remember**: Focus on `01-CORE-LEARNING` - đây là foundation cho everything else!

---

_Happy Coding! 🚀_
