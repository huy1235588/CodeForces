# Clean Code Principles

## SOLID Principles

### 1. Single Responsibility Principle (SRP)
- Một class chỉ nên có một lý do để thay đổi
- Mỗi class chỉ nên có một trách nhiệm

```python
# Bad
class User:
    def save_to_database(self):
        pass
    def send_email(self):
        pass

# Good
class User:
    pass

class UserRepository:
    def save(self, user):
        pass

class EmailService:
    def send_email(self, user):
        pass
```

### 2. Open/Closed Principle (OCP)
- Open for extension, closed for modification

### 3. Liskov Substitution Principle (LSP)
- Derived classes phải có thể thay thế base classes

### 4. Interface Segregation Principle (ISP)
- Clients không nên phụ thuộc vào interfaces họ không sử dụng

### 5. Dependency Inversion Principle (DIP)
- Depend on abstractions, not concretions

## Clean Code Rules

### Naming
- Use meaningful names
- Avoid mental mapping
- Use searchable names
- Avoid Hungarian notation

### Functions
- Small functions (< 20 lines)
- Do one thing
- One level of abstraction
- Minimize arguments

### Comments
- Explain "why", not "what"
- Avoid redundant comments
- Keep comments up-to-date

### Error Handling
- Use exceptions rather than return codes
- Don't return null
- Don't pass null
