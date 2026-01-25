# Coffee Shop Management System

A desktop application built with **Java Swing** for managing daily coffee shop operations. This system includes user authentication, employee management with full CRUD functionality, and reporting features.

## 🚀 Features
* **Secure Login**: Authentication system for Administrators.
* **Admin Dashboard**: Centralized navigation to different modules.
* **Employee Management**: 
    * Add new employees with ID, Name, Position, Salary, and Contact.
    * Update existing employee details.
    * Delete employee records with confirmation.
    * Live-updating data table.
* **Reporting**: Generate professional PDF reports using **JasperReports**.

## 🛠️ Tech Stack
* **Language**: Java (JDK 8 or higher)
* **IDE**: NetBeans / IntelliJ
* **GUI Framework**: Java Swing
* **Database**: MySQL
* **Reporting Tool**: JasperReports 6.x

## 📋 Database Setup
To run this project, create a database named `coffee_shop_db` and execute the following SQL:

```sql
CREATE TABLE employees (
    emp_id INT PRIMARY KEY,
    name VARCHAR(100),
    position VARCHAR(50),
    salary DOUBLE,
    contact VARCHAR(15)
);
