package com.cydeo.day2;

import com.cydeo.Utilities.DB_Util;

public class DB_UtilPractice {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@54.243.18.141:1521:XE", username = "hr",password = "hr";
        DB_Util.createConnection(url,username,password);
        DB_Util.runQuery("SELECT * FROM COUNTRIES");
        DB_Util.displayAllData();

        System.out.println("DB_Util.getCellValue(2,2) = " + DB_Util.getCellValue(2, 2));
        System.out.println("DB_Util.getCellValue(2,\"COUNTRY_NAME\") = " + DB_Util.getCellValue(2, "COUNTRY_NAME"));
        //DB_Util.runQuery("SELECT * FROM REGIONS");

        System.out.println("DB_Util.getRowCount() = " + DB_Util.getRowCount());
        System.out.println("DB_Util.getColumnCount() = " + DB_Util.getColumnCount());
        System.out.println("DB_Util.getAllColumnNamesAsList() = " + DB_Util.getAllColumnNamesAsList());
        System.out.println("DB_Util.getRowDataAsList(3) = " + DB_Util.getRowDataAsList(3));
        System.out.println("DB_Util.getColumnDataAsList(2) = " + DB_Util.getColumnDataAsList(2));
        System.out.println("DB_Util.getRowMap(2) = " + DB_Util.getRowMap(2));
        System.out.println("DB_Util.getAllRowAsListOfMap() = " + DB_Util.getAllRowAsListOfMap());
        DB_Util.runQuery("SELECT COUNT(*) FROM EMPLOYEES");
        System.out.println("DB_Util.getFirstRowFirstColumn() = " + DB_Util.getFirstRowFirstColumn());
    }
}
