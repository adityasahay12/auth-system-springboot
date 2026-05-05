# 🔐 Authentication System (Spring Boot)

## 🚀 Overview
A backend authentication system built using Spring Boot and Spring Security.  
It provides secure user registration and login functionality with password encryption and JWT-based authentication (in progress).

---

## 🔥 Features
- User Registration API
- User Login API (structure implemented)
- Password Encryption using BCrypt
- RESTful API design
- Layered backend architecture

---

## 🛠️ Tech Stack
- Java
- Spring Boot
- Spring Security
- JWT (in progress)
- MySQL
- Spring Data JPA

---

## 🔗 API Endpoints
| Method | Endpoint | Description |
|-------|--------|------------|
| POST | /api/auth/register | Register new user |
| POST | /api/auth/login | Login user |
| GET  | /api/auth/test | Test protected API |

---

## 📂 Project Structure

src/
├── controller
├── service
├── repository
├── model
├── config
└── security


---

## 🏗️ Architecture
- **Controller Layer** → Handles HTTP requests  
- **Service Layer** → Business logic  
- **Repository Layer** → Database operations  
- **Model Layer** → Entity classes  

---

## 🗄️ Database
- MySQL database integration  
- Spring Data JPA for ORM  
- User data stored securely  

---

## 🔐 Security Features
- Password encryption using BCrypt  
- Structured authentication flow  
- JWT authentication (in progress)  

---

## 📌 Current Progress
- Project structure implemented ✔  
- User entity and repository ✔  
- Registration API ✔  
- Password encryption ✔  
- JWT integration 🚧  

---

## 📌 Future Improvements
- Complete JWT authentication flow  
- Role-based authorization (Admin/User)  
- Input validation and exception handling  
- Frontend integration (React)  

---

## 📸 Screenshots
(To be added after API testing)

---

## 📌 Status
🚧 Actively under development
