# 🔐 Authentication System (Spring Boot)

A secure and scalable backend authentication system built using **Spring Boot, Spring Security, JWT, OAuth2, and MySQL**.

This project implements modern authentication practices including **JWT-based security, refresh token management, OAuth2 social login, role-based authorization, and encrypted password storage**.

---

## 🚀 Features

✅ User Registration  
✅ User Login  
✅ JWT Access Token Authentication  
✅ Refresh Token Authentication  
✅ Google OAuth2 Login  
✅ GitHub OAuth2 Login  
✅ Role-Based Authorization  
✅ BCrypt Password Encryption  
✅ Protected REST APIs  
✅ Swagger API Documentation  
✅ Exception Handling  
✅ Database Integration with MySQL  

---

# 🛠️ Tech Stack

### Backend
- Java 21
- Spring Boot 3
- Spring Security
- Spring Data JPA
- Hibernate ORM

### Authentication & Security
- JWT (JSON Web Token)
- OAuth2
- BCrypt Password Encoder
- Role-Based Access Control

### Database
- MySQL

### Tools
- Maven
- Docker
- Swagger OpenAPI
- Git & GitHub

---

# 🏗️ Architecture Flow

```
Client
  |
  |
REST API Request
  |
  |
Spring Security Filter Chain
  |
  |
JWT Authentication Filter
  |
  |
Controller
  |
  |
Service Layer
  |
  |
Repository Layer
  |
  |
MySQL Database
```

---

# 📂 Project Structure

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
    │       │
    │       ├── config
    │       ├── dtos
    │       └── exceptions
    │
    └── resources
        ├── application.properties
        └── static
```

---

# 🔗 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/api/auth/register` | Register new user |
| POST | `/api/auth/login` | Login user |
| POST | `/api/auth/refresh` | Generate new access token |
| GET | `/api/users/me` | Get authenticated user details |

---

# 🔐 Security Implementation

### JWT Authentication

- User logs in with credentials
- Server validates user details
- Generates JWT access token
- Client sends token with every protected request

Example:

```
Authorization: Bearer <JWT_TOKEN>
```

---

### OAuth2 Login

Supported providers:

- Google
- GitHub

Users can authenticate using their existing social accounts securely.

---

# 🗄️ Database Design

Database: **MySQL**

Implemented using:

- Spring Data JPA
- Hibernate ORM
- Entity Relationships

Main entities:

```
User
 |
 ├── Roles
 |
 └── Refresh Token
```

---

# ⚙️ Configuration

Create `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/auth_system
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update

jwt.secret=your_secret_key
jwt.expiration=900000
```

For OAuth2:

```properties
spring.security.oauth2.client.registration.google.client-id=your_client_id
spring.security.oauth2.client.registration.google.client-secret=your_client_secret
```

---

# ▶️ Run The Project

### Clone Repository

```bash
git clone https://github.com/your-username/authentication-system.git
```

### Build Project

```bash
mvn clean install
```

### Run Application

```bash
mvn spring-boot:run
```

Application will start at:

```
http://localhost:8080
```

---

# 📖 API Documentation

Swagger UI:

```
http://localhost:8080/swagger-ui/index.html
```

---

# 🐳 Docker Support

Build Docker image:

```bash
docker build -t auth-system .
```

Run container:

```bash
docker run -p 8080:8080 auth-system
```

---

# 🚀 Future Improvements

- 📧 Email Verification
- 🔑 Forgot Password
- 🔒 Two Factor Authentication (2FA)
- 🐳 Docker Compose Setup
- 🧪 Unit & Integration Testing
- 📊 User Activity Tracking
- ☁️ Cloud Deployment

---

# 👨‍💻 Author

**Aditya**

Java Backend Developer | Spring Boot | REST APIs | Security
