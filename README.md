
# Employee Management System

A backend REST API built using Spring Boot for managing employee records.  
This project demonstrates a layered architecture using Controller, Service, and Repository layers.

---

## 🚀 Features

- Add Employee
- Get All Employees
- Delete Employee
- RESTful API Design
- Layered Backend Architecture

---

## 🛠 Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven

---

## 📂 Project Structure

```
src
 └── main
     └── java
         └── com.example.ems
             ├── controller
             │    └── EmployeeController.java
             ├── model
             │    └── Employee.java
             ├── repository
             │    └── EmployeeRepository.java
             ├── service
             │    └── EmployeeService.java
             └── EmployeeManagementApplication.java
```

---

## 🔗 API Endpoints
## 📸 API Testing (Postman)

### Get Employees API

![Get Employees](screenshots/api-get-employees.png)

### Add Employee API

![Add Employee](screenshots/api-add-employee.png)
### Get All Employees

```
GET /employees
```

### Add Employee

```
POST /employees
```

Example Request Body

```
{
 "name": "John Doe",
 "email": "john@email.com",
 "department": "IT"
}
```

### Delete Employee

```
DELETE /employees/{id}
```

---

## 📌 Future Improvements

- Update Employee API
- Employee Search API
- Pagination Support
- JWT Authentication
- Role Based Access Control

---

## 👨‍💻 Author
## API Testing

### Get Employees API

![Get Employees](screenshots/api-get-employees.png)

Java Backend Developer
