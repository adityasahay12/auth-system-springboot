# 🔐 Authentication System (SpringBoot)

A secure backend authentication system built with Spring Boot, Spring Security, JWT, OAuth2, and MySQL. It provides user registration, login, token-based authentication, refresh tokens, and OAuth2 login support.

---

## 🚀 Features

- User Registration
- User Login
- JWT Authentication
- Refresh Token Authentication
- Google OAuth2 Login
- GitHub OAuth2 Login
- Role-Based Authorization
- BCrypt Password Encryption
- RESTful APIs
- Swagger API Documentation

---

## 🛠️ Tech Stack

- Java 21
- Spring Boot 3
- Spring Security
- Spring Data JPA
- JWT
- OAuth2
- MySQL
- Maven
- Docker
- Swagger (OpenAPI)

---

## 📂 Project Structure

```
src
└── main
    ├── java
    │   └── com.substring.auth.app
    │       ├── auth
    │       │   ├── config
    │       │   ├── controllers
    │       │   ├── entities
    │       │   ├── helpers
    │       │   ├── payload
    │       │   ├── repositories
    │       │   └── services
    │       ├── config
    │       ├── dtos
    │       └── exceptions
    └── resources
```

---

## 🔗 Main API Endpoints

| Method | Endpoint |
|---------|----------|
| POST | /api/auth/register |
| POST | /api/auth/login |
| POST | /api/auth/refresh |
| GET | /api/users/me |

---

## 🔐 Security Features

- BCrypt Password Encryption
- JWT Access Token
- Refresh Token
- OAuth2 Authentication
- Role-Based Authorization
- Protected REST APIs

---

## 🗄️ Database

- MySQL
- Spring Data JPA
- Hibernate ORM

---

## ▶️ Run the Project

```bash
mvn clean install
mvn spring-boot:run
```

---

## 🚀 Future Improvements

- Email Verification
- Forgot Password
- Two-Factor Authentication (2FA)
- Docker Compose
- Unit & Integration Tests

---

## 👨‍💻 Author

Aditya
