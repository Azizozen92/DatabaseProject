package com.cydeo.day2;

import com.cydeo.Utilities.DB_Util;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDashboardUserCount {

    @Test
    public void testDashboardUserCount(){

        String url = "jdbc:mysql://34.230.35.214:3306/library2",username= "library2_client",password= "6s2LQQTjBcGFfDhY";
        DB_Util.createConnection(url,username,password);

        DB_Util.runQuery("SELECT COUNT(*) FROM users");
        int actualUserCount = 141;
        int expectedUserCount = Integer.parseInt(DB_Util.getFirstRowFirstColumn());
        System.out.println("expectedUserCount = " + expectedUserCount);
        Assert.assertEquals(actualUserCount,expectedUserCount);
    }
}
