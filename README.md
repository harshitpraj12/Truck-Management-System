# 🚚 Truck Management System (JDBC Console Application)

A **console-based Truck Management System** developed in **Java** using **JDBC** and **MySQL**.  
This project performs complete **CRUD operations** and follows a clean, layered architecture.

---

## 📌 Features

- ➕ Add new truck details
- ✏️ Update existing truck information
- 🔍 Fetch truck details by ID
- 📄 View all trucks
- ❌ Delete truck by ID
- 📟 Menu-driven console interface
- 🔐 Secure database access using JDBC `PreparedStatement`

---

## 🛠️ Technologies Used

- **Java (Core Java)**
- **JDBC**
- **MySQL**
- **Console Application**

---

## 🧱 Project Structure

```structure
src/
└── com/
    └── harshit/
        ├── app/
        │   └── App.java
        │
        ├── model/
        │   └── Truck.java
        │
        ├── service/
        │   └── TruckServices.java
        │
        └── util/
            └── ConnectionDetail.java
```
---

## 🗄️ Database Schema

```sql
CREATE DATABASE TruckMngt;

USE TruckMngt;

CREATE TABLE truck (
    id INT PRIMARY KEY AUTO_INCREMENT,
    company VARCHAR(50),
    model VARCHAR(50),
    T_num INT,
    driver VARCHAR(50)
);
```

---

## 🔥 Sample console menu

```console
Which operation do you want to perform?
1: Insertion
2: Update
3: Get Truck By ID
4: Get All Truck
5: Delete by ID
6: Exit
```

