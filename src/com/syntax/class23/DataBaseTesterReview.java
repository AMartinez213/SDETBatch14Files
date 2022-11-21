package com.syntax.class23;

public class DataBaseTesterReview {
    public static void main(String[] args) {

        DataBaseReview dataBase=new MicrosoftDataBaseReview();
        dataBase.writeData();
        dataBase.readData();
        dataBase.closeDatabase();
        dataBase.openDatabase();
    }
}
