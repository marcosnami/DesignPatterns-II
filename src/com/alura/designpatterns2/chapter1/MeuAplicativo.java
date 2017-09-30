package com.alura.designpatterns2.chapter1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by MarcosNami on 9/29/2017.
 */
public class MeuAplicativo {

    public static void main(String[] args) throws SQLException {

        Connection connection = new ConnectionFactory().getConnection();

        PreparedStatement preparedStatement = connection.prepareStatement("Select * from dual");
    }
}
