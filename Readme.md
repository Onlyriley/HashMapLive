# 🔑 HashMapLive

A lightweight Spring Boot-based **live key-value map API**. Designed for local development or self-hosted environments such as home automation hubs, configuration sync tools, IoT devices, and more.

> Built by Riley Simmons

---

## 💡 Features

- Simple REST API for setting and retrieving key-value pairs
- In-memory H2 database by default (optional to swap for PostgreSQL, MySQL, etc.)
- Fully self-hosted with no external dependencies
- Can be used with `curl`, `PowerShell`, Postman, Python, or any HTTP client
- Useful for:
  - 💡 Smart home control state
  - 🧪 Live config servers
  - 🔁 Local dev/test service communication

---

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/Onlyriley/HashMapLive.git
cd HashMapLive
```

### 2. Run with Maven

```bash
./mvnw spring-boot:run
```

> Make sure you have Java 17+ installed (or update the project to match your version).

---

## 🔌 API Endpoints

### ➕ `POST /api/map`

Create or update a key-value pair.

#### Example

```http
POST http://localhost:8080/api/map?key=lightsOn&value=true
```

---

### 🔍 `GET /api/map`

Retrieve the value associated with a key.

#### Example

```http
GET http://localhost:8080/api/map?key=lightsOn
```

#### Response

```
true
```

---

## 🧪 Testing Locally (PowerShell / Curl)

```powershell
Invoke-RestMethod -Method POST "http://localhost:8080/api/map?key=myDevice&value=online"
Invoke-RestMethod "http://localhost:8080/api/map?key=myDevice"
```

---

## 🔧 Configuration (optional)

You can switch the database engine by modifying `application.properties`:

```properties
# Use PostgreSQL instead of H2
spring.datasource.url=jdbc:postgresql://localhost:5432/hashmaplive
spring.datasource.username=postgres
spring.datasource.password=yourpass
spring.jpa.hibernate.ddl-auto=update
```

---

## 🖥️ H2 Console (debugging)

Access the in-memory DB in your browser:

```
http://localhost:8080/h2-console
```

- JDBC URL: `jdbc:h2:mem:testdb`
- Username: `sa`
- Password: (leave blank)

---

## 📁 Project Structure

```
src/
├── controller/      → REST API layer
├── model/           → JPA entity for key-value storage
├── repository/      → Spring Data repository
└── HashMapLiveApplication.java
```

---

## 📜 License

MIT License

---

## 🤝 Contributing

Pull requests are welcome! Ideas for additional features:
- TTL/expiring keys
- Redis backend support
- WebSocket broadcasting on update
- Admin UI dashboard

---

## ✨ Acknowledgements

- Built using Spring Boot + H2
- Inspired by minimal self-hosted tools like Etcd, Consul, and Home Assistant integrations
