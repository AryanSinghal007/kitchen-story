# Maven target directory
/target/

# IntelliJ IDEA files
*.iml
.idea/
*.ipr
*.iws

# VS Code settings
.vscode/

# OS generated files
.DS_Store
Thumbs.db

# Logs
*.log

# Environment files
.env

# Compiled class files
*.class

# Backup files
*~

# Node modules (if any frontend uses npm)# Kitchen Story

## Project Overview
Kitchen Story is a modern Spring Boot web application for managing a food ordering platform.  
It allows users to search for food items, view details, and place orders.  
Admins can log in to manage inventory, add new items, and view analytics via a visually appealing dashboard.

---

## Features
- **User Side**
  - Search and browse available food items
  - View item details and prices
  - Place orders and view order summaries
- **Admin Side**
  - Secure admin login
  - Add, view, and delete food items
  - Dashboard with charts and statistics

---

## Project Structure
```
kitchen-story
├── pom.xml
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── kitchenstory/
│       │           ├── KitchenStoryApplication.java
│       │           ├── controller/
│       │           ├── model/
│       │           ├── repository/
│       │           └── service/
│       └── resources/
│           ├── static/
│           │   ├── css/
│           │   └── js/
│           ├── templates/
│           └── application.properties
└── README.md
```

---

## Sprint Plan

| Sprint | Goals                                                                 | Timeline         |
|--------|-----------------------------------------------------------------------|------------------|
| 1      | Project setup, basic entities, user home page, search functionality   | 13-17 July 2025  |
| 2      | Admin login, add/delete items, admin dashboard UI                     | 18-22 July 2025  |
| 3      | Chart integration, order flow, payment & confirmation pages           | 23-27 July 2025  |
| 4      | Testing, bug fixes, documentation, deployment                         | 28-31 July 2025  |

---

## Developer

- Aryan Singhal

---

## Getting Started

1. **Clone the repository:**
   ```sh
   git clone https://github.com/yourusername/kitchen-story.git
   cd kitchen-story
   ```
2. **Build the project:**
   ```sh
   mvn clean install
   ```
3. **Run the application:**
   ```sh
   mvn spring-boot:run
   ```
4. **Access the app:**
   - User: [http://localhost:8080/](http://localhost:8080/)
   - Admin: [http://localhost:8080/admin](http://localhost:8080/admin)

---

## Dependencies

- Spring Boot
- Spring Data JPA
- Thymeleaf
- H2/MySQL (choose your DB)
- Chart.js (for dashboard charts)

Add dependencies in `pom.xml` as needed.

---

## License

This project is licensed under the MIT License.