//package com.lesson.spring.config;
//
//
//import com.zaxxer.hikari.HikariConfig;
//import com.zaxxer.hikari.HikariDataSource;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//
//import javax.sql.DataSource;
//
//@Configuration
//public class DataSourceConfig {
//
//    @Primary
//    @Bean(name = "couponDatasource")
//    public DataSource couponDataSource() {
//        HikariConfig config = new HikariConfig();
//        config.setJdbcUrl("jdbc:mysql://localhost:3306/db1");
//        config.setUsername("user1");
//        config.setPassword("password1");
//        config.setDriverClassName("com.mysql.cj.jdbc.Driver");
//
//        return new HikariDataSource(config);
//    }
//
//    @Bean(name = "orderDataSource")
//    public DataSource orderDataSource() {
//        HikariConfig config = new HikariConfig();
//        config.setJdbcUrl("jdbc:mysql://localhost2:3306/db2");
//        config.setUsername("user2");
//        config.setPassword("password2");
//        config.setDriverClassName("com.mysql.cj.jdbc.Driver");
//
//        return new HikariDataSource(config);
//    }
//
//}
