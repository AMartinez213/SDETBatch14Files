package com.syntax.class23;

public class InterfaceTesterReview {
    public static void main(String[] args) {
        IDataBaseReview iDataBase = new IBMReview();

        iDataBase.readData();
        iDataBase.writeData();
        iDataBase.openDatabase();
        System.out.println("The child age is "+iDataBase.childAge());
    }
}
