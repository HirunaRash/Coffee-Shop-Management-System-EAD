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

-- System/admin Users (For Login)
CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) UNIQUE NOT NULL,
    password VARCHAR(50) NOT NULL,
    role ENUM('Admin', 'Employee') DEFAULT 'Admin'
);


-- Employee Details
CREATE TABLE employees (
    emp_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    position VARCHAR(50),
    salary DOUBLE,
    contact VARCHAR(20)
);

-- Inventory Items
CREATE TABLE inventory (
    item_id INT AUTO_INCREMENT PRIMARY KEY,
    item_name VARCHAR(100) NOT NULL,
    quantity INT DEFAULT 0,
    price DECIMAL(10, 2) NOT NULL,
    category VARCHAR(50),
    last_updated TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

CREATE TABLE payroll (
    payment_id INT AUTO_INCREMENT PRIMARY KEY,
    employee_id INT,
    employee_name VARCHAR(100),
    month_year VARCHAR(20),
    basic_salary DOUBLE,
    bonus DOUBLE,
    deductions DOUBLE,
    net_pay DOUBLE,
    payment_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

