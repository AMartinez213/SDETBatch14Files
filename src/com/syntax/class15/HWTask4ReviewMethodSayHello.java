package com.syntax.class15;

public class HWTask4ReviewMethodSayHello {

    void sayHello(String country) {

        switch (country) {
            case "USA":
                System.out.println("Hello");
                break;
            case "India":
                System.out.println("Namaste");
                break;
            case "Turkiye":
                System.out.println("Merhaba");
                break;
            case "Pakistan":
                System.out.println("AOA");
                break;
            case "Japan":
                System.out.println("Nihau");
                break;
            default:
                System.out.println("Invalid Country");
        }
    }

    public static void main(String[] args) {

       HWTask4ReviewMethodSayHello task4=new HWTask4ReviewMethodSayHello();

       task4.sayHello("Japan");
       task4.sayHello("Pakistan");


    }


}
