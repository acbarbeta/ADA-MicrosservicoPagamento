# Microsserviço - Pagamento

## 💻 Prerequisites

Before getting started, make sure you have the following requirements installed in your development environment:

- [Java](https://www.java.com/) - JDK 17 or higher
- [DBeaver](https://dbeaver.io/) or [PgAdmin](https://www.pgadmin.org/) - For database management
- [PostgreSQL](https://www.postgresql.org/) or [Docker](https://www.docker.com/) - For running the database
- [Postman](https://www.postman.com/) - For queries testing
- Ensure that you have a Windows, Linux, or macOS machine;
- Ensure that you have read the project documentation before running

## 💻 Technologies and Libraries used
- Java
- Maven
- Spring Boot
- PostgreSQL
- Docker
- Spring Data JPA
- Spring devtools
- Spring Web
- Lombok
- Postman
- Swagger
- JUnit
- Mockito

## ⚙️ Environment Setup

1. **Application Configuration:**
- Clone this repository:

```bash
 git clone https://github.com/acbarbeta/ADA-MicrosservicoPagamento.git
```

- Open the project in your preferred IDE.

- Configure the database properties in the `application.yml` file:

```properties
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/postgres
    username: your_username
    password: your_password
    driver-class-name: org.postgresql.Driver           
```

2. **Database:**
- You can choose to install PostgreSQL directly or use Docker.

    - To use Docker, first you have to open the terminal, enter in `docker` folder and run the following command:

```bash
docker-compose up -d db
```

Make sure to adjust the password as needed.

3. **Running the Application:**
    - Run the application from the `PaymentApplication` main class.

## 📚 Concepts learned

## 📁 Entities

The project has the following entities:

## 💡📝 Contribution

Feel free to contribute to this project.
Open an issue to discuss new features or submit a pull request to fix existing issues.

##  🙋🏽‍♀️️ The Authores
Feel free to reach us on LinkedIn or GitHub!
- Ana Clara Barbeta Vicente - [LinkedIn](https://www.linkedin.com/in/anaclara-barbeta/) profile and [Github](https://github.com/acbarbeta) page
- Ariane Padilha Oishi - [LinkedIn](https://www.linkedin.com/in/ariane-padilha-oishi/) profile and [Github](https://github.com/apoishi) page
- Elisa Maria Costa de Souza - [LinkedIn](https://www.linkedin.com/in/elisa-souzaa/) profile and [Github](https://github.com/ElisaSouzaaa) page
- Maynara Ellen Nachbar - [LinkedIn](https://www.linkedin.com/in/maynara-nachbar/) profile and [Github](https://github.com/MayNachbar) page
- Milena Lara Reis - [LinkedIn](https://www.linkedin.com/in/milenalarareis/) profile and [Github](https://github.com/milenalara) page