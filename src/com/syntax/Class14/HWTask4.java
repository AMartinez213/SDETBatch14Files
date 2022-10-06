package com.syntax.Class14;

public class HWTask4 {

    //Create a method that will say Hello in different language based on the country that will passed when method is executed

    void printHello(String country) {

        if (country.equalsIgnoreCase("Guatemala")) {
            System.out.println("Hola");
        } else if (country.equalsIgnoreCase("France")) {
            System.out.println("Bon Jour");
        } else if(country.equalsIgnoreCase("Japan")){
            System.out.println("Kon'nichiwa");
        } else if (country.equalsIgnoreCase("Vietnam")){
            System.out.println("xin chào");
        } else {
            System.out.println("Enter valid country");
        }
    }

    public static void main(String[] args) {

        HWTask4 hello=new HWTask4();

        hello.printHello("Japan");

    }
}
