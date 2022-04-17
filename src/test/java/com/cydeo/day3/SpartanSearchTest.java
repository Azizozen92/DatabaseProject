package com.cydeo.day3;

import com.cydeo.Utilities.DB_Util;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SpartanSearchTest {

    @BeforeClass
    public void setup(){
        String url = "jdbc:oracle:thin:@54.243.18.141:1521:XE", username = "SP",password = "SP";
        DB_Util.createConnection(url,username,password);
    }
    @AfterClass
    public void tearDown(){
        DB_Util.destroy();
    }

    @Test
    public void testSearchByGender(){


        DB_Util.runQuery("SElECT COUNT(*) FROM SPARTANS WHERE GENDER = 'Male'");
        int actualResultMale = 53;
        int expectedMaleResult = Integer.parseInt(DB_Util.getFirstRowFirstColumn());
        Assert.assertEquals(actualResultMale, expectedMaleResult);

        DB_Util.runQuery("SElECT COUNT(*) FROM SPARTANS WHERE GENDER = 'Female'");
        int actualResultFemale = 47;
        int expectedFemaleResult = Integer.parseInt(DB_Util.getFirstRowFirstColumn());
        Assert.assertEquals(actualResultFemale,expectedFemaleResult);

        DB_Util.runQuery("SElECT COUNT(*) FROM SPARTANS WHERE NAME LIKE '%a%'");
        int actualResulta = 57;
        int expectedResulta = Integer.parseInt(DB_Util.getFirstRowFirstColumn());
        Assert.assertEquals(actualResulta, expectedResulta);

        }



    }


