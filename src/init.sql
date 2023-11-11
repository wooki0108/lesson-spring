-- init.sql

-- 데이터베이스 생성
CREATE DATABASE IF NOT EXISTS test;

-- 사용자 생성 및 권한 부여
CREATE USER IF NOT EXISTS 'user'@'%' IDENTIFIED BY 'hr';
GRANT ALL PRIVILEGES ON test.* TO 'user'@'%';
FLUSH PRIVILEGES;
