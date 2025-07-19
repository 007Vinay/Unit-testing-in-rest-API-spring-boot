# Cloud Vendor REST API with Unit Testing

A Spring Boot 3.3 RESTful web service to manage Cloud Vendor data, built with Java 17 and tested using **JUnit 5**, **Mockito**, and **AssertJ**. The project follows a layered architecture and demonstrates **test-driven development (TDD)** with clean and maintainable code.

---

## 📚 Overview

This project exposes a REST API for managing cloud vendors. It supports all basic CRUD operations and demonstrates the use of:

- Unit testing (controller, service, repository)
- Exception handling
- Custom response structures
- Database integration (MySQL for runtime, H2 optional for testing)

---

## 🚀 Technologies Used

| Technology      | Purpose                           |
| --------------- | --------------------------------- |
| Java 17         | Programming language              |
| Spring Boot 3.3 | Backend framework                 |
| Spring Web      | RESTful web service               |
| Spring Data JPA | ORM and DB operations             |
| MySQL           | Primary relational database       |
| Maven           | Build & dependency management     |
| Postman         | Manual API testing                |
| JUnit 5         | Unit testing framework            |
| Mockito         | Mocking dependencies in tests     |
| AssertJ         | Fluent and expressive assertions  |
| H2 (optional)   | In-memory DB for isolated testing |

---

## 🧾 API Endpoints

| Method | Endpoint            | Description            |
| ------ | ------------------- | ---------------------- |
| GET    | `/cloudvendor`      | Get all cloud vendors  |
| GET    | `/cloudvendor/{id}` | Get cloud vendor by ID |
| POST   | `/cloudvendor`      | Add a new vendor       |
| PUT    | `/cloudvendor/{id}` | Update vendor details  |
| DELETE | `/cloudvendor/{id}` | Delete a vendor        |

Test these endpoints using **Postman** or any HTTP client.

---

## 📁 Project Structure

```
rest-demo/
├── src/
│   ├── main/
│   │   ├── java/com.thinkconstructive.restdemo/
│   │   │   ├── controller/         → API endpoints
│   │   │   ├── exception/          → Custom error handling
│   │   │   ├── model/              → JPA entity (CloudVendor)
│   │   │   ├── repository/         → JPA interface
│   │   │   ├── response/           → Response wrapper
│   │   │   ├── service/impl/       → Business logic
│   │   │   └── RestDemoApplication.java
│   │   └── resources/
│   │       └── application.properties
│
│   ├── test/
│   │   ├── java/com.thinkconstructive.restdemo/
│   │   │   ├── controller/         → `CloudVendorControllerTest`
│   │   │   ├── service/impl/       → `CloudVendorServiceImplTest`
│   │   │   ├── repository/         → `CloudVendorRepositoryTest`
│   │   │   └── RestDemoApplicationTests
│   │   └── resources/
│   │       └── application.yaml
---


---

## ✅ How to Run

### 💻 Prerequisites

- Java 17+
- Maven 3+
- MySQL running on port 3306

### 🔧 Build & Run

```bash
# Clone the repo
git clone https://github.com/007Vinay/Unit-testing-in-rest-API-spring-boot.git
cd rest-demo

# Build the app
mvn clean install

# Run the app
mvn spring-boot:run
```

---

## 🧪 Running Tests

```bash
# Run all tests
mvn test

# Run a specific test
mvn -Dtest=CloudVendorServiceImplTest test
```

Sample test:

```java
@Test
void testFindById_ReturnsCorrectVendor() {
    CloudVendor vendor = new CloudVendor("1", "Azure", "Bangalore", "123456789");
    when(cloudVendorRepository.findById("1")).thenReturn(Optional.of(vendor));

    CloudVendor result = cloudVendorService.getCloudVendorById("1");

    assertThat(result.getVendorName()).isEqualTo("Azure");
    verify(cloudVendorRepository, times(1)).findById("1");
}
```

---

## 💡 Features

- ✅ RESTful architecture
- ✅ DTO-free direct entity handling (simple for demo)
- ✅ Unit tested (controller, service, repository)
- ✅ MySQL integration
- ✅ Centralized error handling
- ✅ Clean code practices and readable assertions

---

## 🧠 Learning Outcomes

- How to use **Mockito** and **JUnit 5** for mocking and testing services
- How to write **fluent assertions** using AssertJ
- Writing **layered test cases** for repository, service, and controller
- How to structure a real-world **Spring Boot** project for testability

---


## 🙋 Author

**Vinay**  
💼 Spring Boot Developer  
🔗 [https://github.com/007Vinay/Unit-testing-in-rest-API-spring-boot]

---

## 📬 Feedback & Contributions

Found a bug or want to contribute?  
Open an [issue](https://github.com/007Vinay/Unit-testing-in-rest-API-spring-boot) or submit a pull request!
