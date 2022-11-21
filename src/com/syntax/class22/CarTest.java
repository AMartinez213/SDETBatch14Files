package com.syntax.class22;

public class CarTest {
    public static void main(String[] args) {
        BMW bmw=new BMW();
        bmw.start();
        bmw.stop();
        System.out.println("========================");
        Toyota toyota=new Toyota();
        toyota.start();
        toyota.stop();
        System.out.println("========================");
        Tesla tesla=new Tesla();
        tesla.park();
        tesla.start();
        tesla.stop();
    }
}
