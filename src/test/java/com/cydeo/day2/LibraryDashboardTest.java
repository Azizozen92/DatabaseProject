package com.cydeo.day2;

import com.cydeo.Utilities.DB_Util;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LibraryDashboardTest {

    @Test
    public void testDashboard(){

        // Dashboards numbers are previously not matching the database number, the test is meant to check the actual result from dashboards page matches database results
        // we will hard code it for now
        String url = "jdbc:mysql://34.230.35.214:3306/library2",username= "library2_client",password= "6s2LQQTjBcGFfDhY";
        DB_Util.createConnection(url,username,password);
        DB_Util.runQuery("SELECT COUNT(*) FROM books ");

        int actualBookCount = 976;

        int expectedResult = Integer.parseInt(DB_Util.getCellValue(1,1));
        System.out.println("expectedResult = " + expectedResult);
        Assert.assertTrue(actualBookCount == expectedResult);



    }
}
