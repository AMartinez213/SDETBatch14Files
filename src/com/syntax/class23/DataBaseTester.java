package com.syntax.class23;

public class DataBaseTester {
    public static void main(String[] args) {
        DataBase database=new Oracle();
        database.openDataBase();
        database.readData();
        database.writeDate();
        database.closeDataBase();

    }
}
