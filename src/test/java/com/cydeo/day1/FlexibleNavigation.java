package com.cydeo.day1;

import java.sql.*;

public class FlexibleNavigation {

    public static void main(String[] args) throws SQLException {

        String url = "jdbc:oracle:thin:@54.243.18.141:1521:XE", username = "hr",password = "hr";
        Connection connection = DriverManager.getConnection(url,username,password);
        //creating statement this way will only allow to get ResultSet that forward only when we execute theory
        //in order to move through any row in the result set with the help of ResultSet navigation method
        //we need to create Statement object in below way
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet resultSet = statement.executeQuery("SELECT * FROM REGIONS");




        resultSet.next();
        System.out.println("resultSet.getString(2) = " + resultSet.getString(2));
        System.out.println(resultSet.getString("REGION_ID") + " " + resultSet.getString("REGION_NAME"));

        resultSet.last();
        System.out.println(resultSet.getString("REGION_ID") + " " + resultSet.getString("REGION_NAME"));

        resultSet.first();
        System.out.println(resultSet.getString("REGION_ID") + " " + resultSet.getString("REGION_NAME"));

        resultSet.absolute(3);
        System.out.println(resultSet.getString("REGION_ID") + " " + resultSet.getString("REGION_NAME"));

        resultSet.previous();
        System.out.println(resultSet.getString("REGION_ID") + " " + resultSet.getString("REGION_NAME"));

        resultSet.beforeFirst();
        resultSet.next();
        System.out.println(resultSet.getString("REGION_ID") + " " + resultSet.getString("REGION_NAME"));

        resultSet.afterLast();
        resultSet.previous();
        System.out.println(resultSet.getString("REGION_ID") + " " + resultSet.getString("REGION_NAME"));


    }
}
