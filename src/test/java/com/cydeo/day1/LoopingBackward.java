package com.cydeo.day1;

import java.sql.*;

public class LoopingBackward {

    public static void main(String[] args) throws SQLException {


        String url = "jdbc:oracle:thin:@54.243.18.141:1521:XE", username = "hr",password = "hr";
        Connection connection = DriverManager.getConnection(url,username,password);
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet resultSet = statement.executeQuery("SELECT * FROM EMPLOYEES");

        resultSet.afterLast();

        while (resultSet.previous()){
            System.out.println(resultSet.getString("EMPLOYEE_ID") + " " + resultSet.getString("FIRST_NAME"));
        }
    }
}
