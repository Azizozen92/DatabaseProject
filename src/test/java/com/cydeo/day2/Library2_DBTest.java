package com.cydeo.day2;


import java.sql.*;

public class Library2_DBTest {

    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://34.230.35.214:3306/library2",username= "library2_client",password= "6s2LQQTjBcGFfDhY";
        Connection connection = DriverManager.getConnection(url,username,password);
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CLOSE_CURSORS_AT_COMMIT);
        ResultSet rs = statement.executeQuery("SELECT * FROM books");
        while (rs.next()){
            System.out.println("rs.getString(\"name\") = " + rs.getString("name"));
        }

        rs = statement.executeQuery("SELECT COUNT(*) AS BOOK_COUNT FROM books");
        rs.next();
        System.out.println("rs.getString(\"BOOK_COUNT\") = " + rs.getString("BOOK_COUNT"));

        ResultSet rs2 = statement.executeQuery("SELECT * FROM users");


    }
}
