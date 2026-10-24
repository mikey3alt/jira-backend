# Project Management Backend (Jira-inspired)

A robust, scalable backend built for a project management application, designed with a completely free tech stack and zero-cost cloud infrastructure.

## 🚀 Tech Stack & Architecture

* **Framework:** Spring Boot (v4.1.2)
* **Language:** Java 27
* **Build Tool:** Maven
* **Database:** PostgreSQL (Hosted on Neon Cloud)
* **ORM & Persistence:** Spring Data JPA / Hibernate
* **Security:** Spring Security (configured for stateless REST APIs)
* **Validation & Utilities:** Spring Boot Validation, Project Lombok
* **Containerization & Deployment:** Docker & Render

---

## 📂 Project Structure

```text
jira-backend/
├── .github/workflows/         # CI/CD pipelines (if applicable)
├── src/
│   ├── main/
│   │   ├── java/com/harsh/jira_backend/
│   │   │   ├── config/        # Security & application configurations
│   │   │   ├── controller/    # REST controllers & endpoints
│   │   │   ├── model/         # Entity & DTO models
│   │   │   ├── repository/    # Spring Data JPA interfaces
│   │   │   ├── service/       # Business logic layer
│   │   │   └── JiraBackendApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/                  # Unit and integration tests
├── .env                       # Local environment variables (ignored in Git)
├── .env.example               # Template for environment variables
├── .gitignore
├── Dockerfile                 # Multi-stage Docker configuration
├── pom.xml                    # Maven configuration and dependencies
└── mvnw / mvnw.cmd            # Maven Wrapper
```

---

## ⚙️ Getting Started Locally

### Prerequisites
* **Java Development Kit (JDK) 27** installed on your machine.
* A PostgreSQL database instance (local or cloud-based like Neon).

### 1. Clone the Repository
```bash
git clone https://github.com/mikey3alt/jira-backend.git
cd jira-backend
```

### 2. Configure Environment Variables
Create a `.env` file in the root directory (referencing `.env.example`) and add your database credentials:
```env
DB_URL=jdbc:postgresql://your-database-host/neondb?sslmode=require
DB_USER=your_db_user
DB_PASSWORD=your_db_password
```

### 3. Run the Application
Using the Maven wrapper, start the Spring Boot application:

* **On Linux / macOS / Git Bash / PowerShell:**
  ```bash
  ./mvnw spring-boot:run
  ```
* **On Windows Command Prompt (CMD):**
  ```cmd
  mvnw spring-boot:run
  ```

The server will start up on `http://localhost:8080`.

---

## 🐳 Docker Deployment

To build and run the application locally using Docker:

1. **Build the Docker image:**
   ```bash
   docker build -t jira-backend .
   ```
2. **Run the container:**
   ```bash
   docker run -p 8080:8080 --env-file .env jira-backend
   ```

---

## ☁️ Cloud Deployment (Render)

This project is configured for seamless deployment on **Render** using a custom `Dockerfile`:
1. Connect your GitHub repository (`mikey3alt/jira-backend`) to Render as a **Web Service**.
2. Set the runtime environment to **Docker**.
3. Add your production environment variables (`DB_URL`, `DB_USER`, `DB_PASSWORD`) in the Render dashboard settings.
4. Deploy!
