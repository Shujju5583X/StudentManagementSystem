# Student Management System[cite: 1]

> **🚧 Status: Work in Progress** 
> This project is currently under active development. Features and documentation are subject to change.

## Overview
The Student Management System is a Java-based web application built to manage student records and handle user authentication[cite: 1]. 

## Tech Stack
Based on the current project directory, the application utilizes the following technologies[cite: 1]:
* **Backend:** Java, Java Servlets (`Student.java`)[cite: 1]
* **Database:** MySQL, accessed via JDBC (`mysql-connector-j-26.7.0.jar`)[cite: 1]
* **Frontend:** HTML (`Login.html`), JSP (`success.jsp`)[cite: 1]
* **Environment:** Eclipse IDE (indicated by `.classpath`, `.project`, and `.settings` configurations)[cite: 1]

## Project Structure
The core application logic is divided into the following key components[cite: 1]:

* **Database Connection (`src/main/java/JDBCconnection/DBConnection.java`):** Handles the configuration and connection establishment with the MySQL database[cite: 1].
* **Record Management (`src/main/java/JDBCconnection/Records.java`):** Contains the logic for processing and interacting with database records[cite: 1].
* **Servlets (`src/main/java/StudentServlet/Student.java`):** The primary controller handling HTTP requests and routing logic for student data[cite: 1].
* **Web Views (`src/main/webapp/Files/`):** Contains the frontend interface, currently featuring a `Login.html` page and a `success.jsp` landing page[cite: 1].
* **Configuration (`src/main/webapp/WEB-INF/web.xml`):** The standard deployment descriptor mapping the servlets for the web server[cite: 1].
