package com.lesson.spring.jdbc;

import java.sql.*;

public class ConnectDatabase {

    private static final String url = "jdbc:h2:mem:db";
    private static final String username = "root";
    private static final String password = "hr";

    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(url, username, password);

            statement = connection.createStatement();
            String sql = "select * from hotel";

            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
               String name = resultSet.getString("name");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
