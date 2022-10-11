package com.syntax.class19;

public class Furniture {

    String color="Green";

}
class Chair extends Furniture{
    String color="Red";
    void printColor(){
        String color="Black";
        System.out.println(this.color);
        System.out.println(super.color);
        System.out.println(color);
    }
}

class TestChair{

    public static void main(String[] args) {

        Chair chair=new Chair();
        chair.printColor();


    }
}