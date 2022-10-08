package com.syntax.class18;

public class Cars{
    String model;
    String make;
    int year;
    String color;
    int topSpeed;
    static String car="Car";
    void printCarDetails(){
        System.out.println("Model "+model+" Make "+make+" Color "+color+" "+car);
    }
}
class BMW extends Cars{
    double engineCC;

}
class Tesla extends Cars{
}
class Toyota extends Cars {
    double engineCC;
}
class carTester {
    public static void main(String[] args) {

        BMW bmw = new BMW();
        bmw.make="BMW";
        bmw.color="Black";
        bmw.model="M5";
        bmw.printCarDetails();
    }
}
