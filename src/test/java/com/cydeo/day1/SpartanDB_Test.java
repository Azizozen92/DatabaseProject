package com.cydeo.day1;

import java.sql.*;

public class SpartanDB_Test {

    public static void main(String[] args) throws SQLException {


        String url = "jdbc:oracle:thin:@54.243.18.141:1521:XE", username = "SP",password = "SP";
        Connection connection = DriverManager.getConnection(url,username,password);
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = statement.executeQuery("SELECT * FROM SPARTANS");
            rs.afterLast();

        while(rs.previous()){
        System.out.println("rs.getString(\"NAME\") = " + rs.getString("NAME")+" "+rs.getString("SPARTAN_ID"));

    }
}
}
