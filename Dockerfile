# 베이스 이미지로 MySQL 8.0 사용
FROM mysql:8.0

# 환경 변수 설정
ENV MYSQL_ROOT_PASSWORD=hr
ENV MYSQL_DATABASE=test

# MySQL 포트 노출
EXPOSE 3306