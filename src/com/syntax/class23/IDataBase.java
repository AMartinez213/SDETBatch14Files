package com.syntax.class23;

public interface IDataBase {

    int age=10;
    void openDataBase();
    void readData();
    void writeData();
}
class IBM implements IDataBase{

    @Override
    public void openDataBase() {
        System.out.println("Opening the IBM database");
    }

    @Override
    public void readData() {
        System.out.println("Reading the IBM database");
    }

    @Override
    public void writeData() {
        System.out.println("Writing the IBM database");
    }
}
