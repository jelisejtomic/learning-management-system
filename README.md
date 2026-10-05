# Learning Management System (LMS - TIM1)

A robust, enterprise-grade **Learning Management System** developed as a team project using a modern microservices architecture. The platform leverages **Spring Boot** for backend services, **Angular** (standalone components & signal-driven design) for the web client, **Keycloak** for Identity & Access Management (IAM), **Netflix Eureka** for service discovery, and **NGINX** as a high-performance reverse proxy and API Gateway.

> This project was forked from the primary repository. For full version control history, commit logs, and active issue tracking, please visit the original repository:  
> 🔗 **[https://gitlab.com/natasa.cvijanovic.20/lms-tim1](https://gitlab.com/natasa.cvijanovic.20/lms-tim1)**

---

## Individual Contributions

As a core developer on this fork of our team project, my contributions spanned system modeling, backend microservices architecture, Keycloak IAM integration, containerized deployment, and full-stack implementation of business features:

### System Analysis & Domain Modeling

- **Static Structure Modeling**: Modeled the core domain architecture for the Study System (_Studiranje_).
- **Requirements & Use Cases**: Authored use case descriptions and requirement models for Students and Student Services (_Studentska služba_), defining actor hierarchies and interaction flows.

### Backend Microservices Architecture & Security

- **Generic Microservice Architecture**: Designed and implemented reusable, generic backend foundation classes (Base Controller, Base Service, Base Repository, Mapper interfaces, and generic DTOs).
- **Security & IAM Service**:
    - Integrated Keycloak authentication within Spring Security.
    - Developed endpoints, controllers, services, repositories, and DTOs for system roles.
    - Implemented user retrieval workflows.
- **Exam Microservice**: Built the exam microservice from the ground up matching the core architecture.
- **Database & Environment Configuration**: Configured external property files to streamline database connections and established container configuration files for seamless multi-container orchestration.

### Frontend Architecture & Integration

- **Domain Models & Services**: Built TypeScript models and a generic service providing standardized CRUD operations for all feature services.
- **Keycloak Setup & Auth State**:
    - Established openid authentication initialization and defined environment configuration variables across environments.
    - Implemented a declarative route guard to enforce role-based route access controls (RBAC) and manage unauthorized redirection.
    - Managed single sign-on (SSO), login/logout workflows, and direct Keycloak-to-database user fetching.
- **Layouts & Navigation Components**: Built dynamic system-wide navigation layouts tailored to user-assigned roles, alongside shared public pages (Home, Contact, Faculty, and Employee overviews).

### Business Features & Academic Logic

- **User Registration**: Implemented full user registration flows.
- **Grade Entry System**: Developed faculty functionality for assigning student grades based on knowledge evaluations, exam registrations, and exam attempts, including validation boundaries and role-based access restrictions.
- **Student Academic History**: Implemented automatic calculation of overall average grades and total aggregated ECTS/ESPB credits.
- **Enrollment & Study Years**: Implemented student enrollment workflows into academic years, study year visualization, and role-filtering rules for staff.
- **Course & Faculty Overview**: Developed active teaching engagement views, course details, exam application portals, and course notifications.

### Containerization & Deployment Setup

- **Docker/Podman Orchestration**: Created `Containerfile` definitions for all backend microservices.
- **Multi-Service Docker Compose**: Configured `container-compose.yml` to orchestrate microservices, NGINX proxy, and imported Keycloak realm data.
