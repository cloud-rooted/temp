// IN Labs if Mysql is installed, you can directly move to step 5

Step 1: 
Download mysql complete from https://dev.mysql.com/downloads/installer/
the one with 558.3M dowloads 



Step 2: 
Run the setup clicking the downloaded material and get a complete installation...



Step 3:
Set the root password something u remember and strong '' during the installation process.



Step 4: 
Open the MYSQL terminal and paste this, you will get a new user with password jdbc123
```
CREATE USER 'jdbcuser'@'localhost'
IDENTIFIED WITH mysql_native_password
BY 'jdbc123';
```
and grant this user permissions to read and write the database
```
GRANT ALL PRIVILEGES ON testdb.* TO 'jdbcuser'@'localhost';
FLUSH PRIVILEGES;
```



Step 5:
Create a test database in your local Server with this command
```
CREATE DATABASE testdb;
```
use this DB
```
use testdb;
```
Create a table in this DB 
```
CREATE TABLE student (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    marks INT
);
```