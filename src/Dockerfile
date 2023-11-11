# 베이스 이미지로 MySQL 8.0 사용
FROM mysql:8.0

# 환경 변수 설정
ENV MYSQL_ROOT_PASSWORD=hr
ENV MYSQL_DATABASE=mydatabase
ENV MYSQL_USER=user
ENV MYSQL_PASSWORD=hr

# MySQL 포트 노출
EXPOSE 3306

# 초기 SQL 스크립트 실행
COPY init.sql /docker-entrypoint-initdb.d/
