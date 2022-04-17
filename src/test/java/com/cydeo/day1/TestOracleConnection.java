package com.cydeo.day1;

import java.sql.*;

public class TestOracleConnection {

    public static void main(String[] args) throws SQLException {

        System.out.println("Hello World");
        //step1 is to create a connection
    String url = "jdbc:oracle:thin:@54.243.18.141:1521:XE";
    String username = "hr",password = "hr";

        Connection connection = DriverManager.getConnection(url,username,password);
        System.out.println("Successfully connected");

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("SELECT * FROM REGIONS");
        //BY DEFAULT THE CURSOR OF THE RESULT SET OBJECT IS AT A LOCATION KNOWN AS 'BEFORE FIRST'
        //IN ORDER TO GET TO THE NEXT ROW YOU HAVE TO CALL THE NEXT METHOD
        resultSet.next();
        //the resulting data has 2 columns region id and region name
        //in order to access the cell value we can use getX method that only accepts 1 parameter
        //either using column name or using 1 based index
        System.out.println("resultSet.getString(\"REGION_ID\") = " + resultSet.getString("REGION_ID"));
        System.out.println("resultSet.getString(\"REGION_NAME\") = " + resultSet.getString("REGION_NAME"));
        //you can also use column index
        System.out.println("resultSet.getString(1) = " + resultSet.getString(1));
        System.out.println("resultSet.getString(1) = " + resultSet.getString(2));

        resultSet.next();
        System.out.println("resultSet.getString(\"REGION_ID\") = " + resultSet.getString("REGION_ID"));
        System.out.println("resultSet.getString(\"REGION_NAME\") = " + resultSet.getString("REGION_NAME"));
        System.out.println("resultSet.getString(1) = " + resultSet.getString(1));
        System.out.println("resultSet.getString(1) = " + resultSet.getString(2));

        resultSet.next();
        System.out.println("resultSet.getString(\"REGION_ID\") = " + resultSet.getString("REGION_ID"));
        System.out.println("resultSet.getString(\"REGION_NAME\") = " + resultSet.getString("REGION_NAME"));
        System.out.println("resultSet.getString(1) = " + resultSet.getString(1));
        System.out.println("resultSet.getString(1) = " + resultSet.getString(2));

        resultSet.next();
        System.out.println("resultSet.getString(\"REGION_ID\") = " + resultSet.getString("REGION_ID"));
        System.out.println("resultSet.getString(\"REGION_NAME\") = " + resultSet.getString("REGION_NAME"));
        System.out.println("resultSet.getString(1) = " + resultSet.getString(1));
        System.out.println("resultSet.getString(1) = " + resultSet.getString(2));

        System.out.println("resultSet.next() = " + resultSet.next());

    }
}
