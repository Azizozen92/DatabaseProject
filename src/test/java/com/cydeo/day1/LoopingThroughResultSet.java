package com.cydeo.day1;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LoopingThroughResultSet {

    public static void main(String[] args)  {

        String url = "jdbc:oracle:thin:@54.243.18.141:1521:XE", username = "hr",password = "hr";
        try {
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM REGIONS");

            while (resultSet.next()){
                System.out.println("resultSet.getString(\"REGION_NAME\") = " + resultSet.getString("REGION_NAME"));

                resultSet.previous();
            }
        } catch (SQLException e) {
            System.out.println("Exception Occurred "+e.getMessage());
        }




    }
}
