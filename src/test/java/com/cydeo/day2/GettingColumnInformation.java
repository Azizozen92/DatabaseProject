package com.cydeo.day2;

import com.cydeo.Utilities.DB_Util;

import java.sql.*;

public class GettingColumnInformation {

    public static void main(String[] args) throws SQLException {

        //MetaData is data about the data
        //ResultSetMEtaData holds information about the ResultObject

        String url = "jdbc:oracle:thin:@54.243.18.141:1521:XE", username = "hr",password = "hr";
        Connection connection = DriverManager.getConnection(url,username,password);
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = statement.executeQuery("SELECT * FROM COUNTRIES");

        ResultSetMetaData rsmd = rs.getMetaData();
        System.out.println("rsmd.getColumnCount() = " + rsmd.getColumnCount());
        System.out.println("rsmd.getColumnName() = " + rsmd.getColumnName(2));


        int totalColumnCount = rsmd.getColumnCount();
        for (int columnIndex = 1; columnIndex <= totalColumnCount; columnIndex++) {
            System.out.println("rsmd.getColumnName("+columnIndex+") = " + rsmd.getColumnName(columnIndex));
        }
        System.out.println("DB_Util.getAllRowAsListOfMap() = " + DB_Util.getAllRowAsListOfMap());

    }
    }

