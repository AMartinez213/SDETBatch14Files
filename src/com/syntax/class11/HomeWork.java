package com.syntax.class11;

public class HomeWork {

    String make;
    String model;
    int storage;
    String color;
    double size;

    void calling() {
        System.out.println("I am calling you from my " + make + " " + model);
    }
    void charging() {
        System.out.println("I am charging my " + make + " " + model);
    }

    public static void main(String[] args) {


    HomeWork iPhone=new HomeWork();

        iPhone.make = "Apple";
        iPhone.model = "iPhone 14 PRO Max";
        iPhone.storage = 256;
        iPhone.color ="Purple";
        iPhone.charging();
        System.out.println("I just bought an "+iPhone.make+" "+iPhone.model+" it has "+iPhone.storage+" GB of storage and the color is "+iPhone.color);

        HomeWork samsung = new HomeWork();

        samsung.make = "Samsung";
        samsung.model = "S22 Ultra";
        samsung.color = "Black";
        samsung.storage = 256;
        System.out.println("My"+samsung.make+" "+samsung.model+" only has "+samsung.storage+" of storage and it's color is "+samsung.color);
        samsung.calling();

    }
}
