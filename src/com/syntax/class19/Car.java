package com.syntax.class19;

class Vehicle{
    int noOfWheels;
    int topSpeed;
    public void topSpeed(){
        System.out.println(topSpeed);
    }
}

public class Car extends Vehicle{

    String model;
    String make;
    int year;
}

class Tesla extends Car{
    //System.out.println("I am a Electrical car");
}
class Toyota extends Car{
    //System.out.println("I am a combustion engine car");
}
/*class Customer extends Toyota,Tesla{}
    not allowed because of diamond problem
*/
class Tester{
    public static void main(String[] args) {
        Toyota toyota=new Toyota();

    }
}