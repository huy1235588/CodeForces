# CI/CD Fundamentals

## Continuous Integration (CI)

### Core Principles
- Integrate code changes frequently (daily)
- Automated build and test pipeline
- Fast feedback on code quality
- Early detection of integration issues

### CI Pipeline Steps
1. **Code Commit**: Developer pushes code
2. **Trigger Build**: Automatic pipeline trigger
3. **Build**: Compile and package application
4. **Test**: Run automated tests
5. **Quality Check**: Static code analysis
6. **Artifact**: Store build artifacts
7. **Notification**: Send results to team

### CI Best Practices
- Keep builds fast (< 10 minutes)
- Make builds self-testing
- Test in production-like environment
- Fix broken builds immediately
- Make build results visible

## Continuous Deployment (CD)

### Deployment Strategies

#### Blue-Green Deployment
```
Production Traffic → Blue Environment (Current)
                  → Green Environment (New) → Switch when ready
```

#### Canary Deployment
```
90% Traffic → Stable Version
10% Traffic → New Version → Gradually increase
```

#### Rolling Deployment
```
Update instances one by one:
Instance 1 → Update → Test → Instance 2 → Update → Test
```

### CD Pipeline Steps
1. **Build Artifact**: From CI pipeline
2. **Deploy to Staging**: Automated deployment
3. **Integration Tests**: End-to-end testing
4. **Security Scan**: Vulnerability assessment
5. **Deploy to Production**: Automated or manual approval
6. **Health Check**: Monitor deployment
7. **Rollback**: If issues detected

## Popular CI/CD Tools

### Cloud-based
- **GitHub Actions**: GitHub-native CI/CD
- **GitLab CI**: Built into GitLab
- **Azure DevOps**: Microsoft's solution
- **AWS CodePipeline**: Amazon's service

### Self-hosted
- **Jenkins**: Open-source automation server
- **TeamCity**: JetBrains CI/CD server
- **Bamboo**: Atlassian's solution

## Pipeline Configuration Examples

### GitHub Actions
```yaml
name: CI/CD Pipeline
on: [push, pull_request]
jobs:
  test:
    runs-on: ubuntu-latest
    steps:
    - uses: actions/checkout@v2
    - name: Setup Node.js
      uses: actions/setup-node@v2
      with:
        node-version: '16'
    - run: npm ci
    - run: npm test
```

### GitLab CI
```yaml
stages:
  - build
  - test
  - deploy

build:
  stage: build
  script:
    - npm ci
    - npm run build

test:
  stage: test
  script:
    - npm test

deploy:
  stage: deploy
  script:
    - npm run deploy
  only:
    - main
```
