CREATE DATABASE upskill_kotlin_db DEFAULT CHARACTER SET utf8;
CREATE USER 'kotlin-user'@'localhost' IDENTIFIED BY 'qwert123';
GRANT ALL PRIVILEGES ON upskill_kotlin_db.* TO 'kotlin-user'@'localhost';
FLUSH PRIVILEGES;