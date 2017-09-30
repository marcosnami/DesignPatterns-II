package com.alura.designpatterns2.chapter1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by MarcosNami on 9/29/2017.
 */
public class ConnectionFactory {

    public Connection getConnection() {

        try {
            Connection connection;

            String dbType = System.getenv("dbtype");

            if ("mysql".equals(dbType)) {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "usuario", "senha");
            } else {
                connection = DriverManager.getConnection("jdbc:postgres://localhost:3253/banco", "usuario", "senha");
            }

            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
