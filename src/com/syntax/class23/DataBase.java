package com.syntax.class23;

public abstract class DataBase {
    abstract void openDataBase();
    abstract void readData();
    abstract void writeDate();
    abstract void closeDataBase();
}
class MicrosoftDataBase extends DataBase{

    @Override
    void openDataBase() {
        System.out.println("Opening the microsoft database");

    }

    @Override
    void readData() {
        System.out.println("Reading the date from MSDatabase");
    }

    @Override
    void writeDate() {
        System.out.println("wrinting the data to MSDatabase");
    }

    @Override
    void closeDataBase() {
        System.out.println("Closing the MSDatabase");
    }
}
 class Oracle extends DataBase{


     @Override
     void openDataBase() {
         System.out.println("Opening the Oracle database");
     }

     @Override
     void readData() {
         System.out.println("Reading the data from Oracle database");

     }

     @Override
     void writeDate() {
         System.out.println("Writing the date from Oracle database");
     }

     @Override
     void closeDataBase() {
         System.out.println("Closing the Oracle database");
     }
 }
