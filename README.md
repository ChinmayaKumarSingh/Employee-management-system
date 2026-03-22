# 👨‍💼 Employee Management System API

![Java](https://img.shields.io/badge/Java-17-orange)
![SpringBoot](https://img.shields.io/badge/SpringBoot-Backend-green)
![REST API](https://img.shields.io/badge/API-REST-blue)
![License](https://img.shields.io/badge/License-MIT-yellow)

An **Employee Management System REST API** built using **Java and Spring Boot** that allows organizations to manage employee records efficiently.

This backend system demonstrates **CRUD operations, REST API development, and enterprise backend architecture**.

---

# 🌐 Live API

Test the deployed API here:

https://employee-management-api-service.onrender.com/employees

Use Postman or Curl to interact with the API endpoints.

```

# ✨ Features

✔ Add new employees
✔ View all employees
✔ Get employee details by ID
✔ Update employee information
✔ Delete employee records
✔ RESTful API design
✔ Controller-Service architecture

```

# 🛠 Tech Stack

| Technology      | Usage                 |
| --------------- | --------------------- |
| Java 17         | Programming Language  |
| Spring Boot     | Backend Framework     |
| Spring Data JPA | ORM                   |
| Maven           | Build Tool            |
| REST API        | Backend Communication |

---

# 📂 Project Structure

```id="y1q3nt"
employee-management-system
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.employee
│   │   │        ├── controller
│   │   │        ├── service
│   │   │        ├── repository
│   │   │        ├── model
│   │   │        └── EmployeeManagementApplication.java
│   │   │
│   │   └── resources
│   │        └── application.properties
│
├── pom.xml
└── README.md
```

---

# 🏗 System Architecture

```id="agf3a8"
Client / Web Application
        |
        | HTTP Request
        v
Spring Boot Controller
(EmployeeController)
        |
        v
Service Layer
(EmployeeService)
        |
        v
Repository Layer
(Spring Data JPA)
        |
        v
Database
        |
        v
API Response
```

---

# 🔄 Request Flow

```id="ux5sos"
Client Request
      |
      v
Controller Layer
      |
      v
Service Layer
      |
      v
Process Employee Data
      |
      v
Database Operation
      |
      v
Return API Response
```

---

# 🌐 API Endpoints

| Method | Endpoint        | Description          |
| ------ | --------------- | -------------------- |
| GET    | /employees      | Get all employees    |
| GET    | /employees/{id} | Get employee details |
| POST   | /employees      | Add new employee     |
| PUT    | /employees/{id} | Update employee      |
| DELETE | /employees/{id} | Delete employee      |

---

# 📦 Example Request

### Create Employee

POST /employees

```json id="2foj3p"
{
 "name": "Rahul Sharma",
 "email": "rahul@example.com",
 "department": "Engineering",
 "salary": 60000
}
```

---

# 📦 Example Response

### Success Response

```id="fy6a9y"
Employee created successfully
```

### Error Response

```id="6pn4u2"
Employee not found
```

---

# ▶ Run Locally

### Clone repository

```id="g2txdd"
git clone https://github.com/ChinmayaKumarSingh/Employee-management-system.git
```

### Navigate to project

```id="bfb3je"
cd Employee-management-system
```

### Run application

```id="40p6l1"
mvn spring-boot:run
```

---

# 🧪 Test API using Curl

### Get all employees

```id="uql22b"
curl https://employee-management-api-service.onrender.com/employees
```

### Create employee

```id="3f6u3e"
curl -X POST https://employee-management-api-service.onrender.com/employees \
-H "Content-Type: application/json" \
-d '{"name":"John Doe","email":"john@example.com","department":"IT","salary":50000}'
```

---

# 📈 Future Improvements

• Authentication using JWT
• Role-based access control
• Pagination and filtering
• Swagger API documentation
• Docker containerization

---

# 👨‍💻 Author

**Chinmaya Singh**

