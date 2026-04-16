# 🔥 DevSecOps Vulnerable Lab

This project is an intentionally vulnerable Spring Boot application used for learning DevSecOps.

## 🚨 WARNING
This app is **intentionally insecure**. Do NOT deploy in production.

---

## 🧱 Features (Vulnerabilities)

- SQL Injection (/login)
- Broken Access Control (/user/{id})
- Command Injection (/ping)
- Path Traversal (/file)
- Open Admin Access (/admin)
- Secrets Exposure (/secrets)

---

## ▶️ Run Locally

### Step 1: Build
mvn clean package

### Step 2: Run
docker-compose up --build

---

## 🌐 Access

- App: http://localhost:8080

---

## 💀 Attack Examples

### SQL Injection
curl -X POST http://localhost:8080/login \
-d "username=admin' OR '1'='1&password=test"

### IDOR
curl http://localhost:8080/user/1

### Command Injection
http://localhost:8080/ping?host=google.com;ls

---

## 🛡️ Next Step
Secure this app using DevSecOps tools like:
- SonarQube
- Trivy
- OWASP Dependency Check
