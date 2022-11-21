package com.syntax.class23;

public class InterfaceTester {
    public static void main(String[] args) {
        IDataBase iDataBase=new IBM();
        iDataBase.readData();
        iDataBase.writeData();
        iDataBase.openDataBase();
    }
}
