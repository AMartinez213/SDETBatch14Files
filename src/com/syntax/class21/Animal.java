package com.syntax.class21;

public class Animal {
    String name;
    String color;
    String breed;

    void Sleep(){
        System.out.println("Animals usually sleep for 6 hours");
    }
    void eat(){
        System.out.println("Grass and Meat");
    }
}

class Cat extends Animal{

    @Override
    void Sleep() {
        System.out.println("I like to sleep for 20 hours");
    }
    void eat(){
        System.out.println("I only like fish");
    }
}
class Dog extends Animal {

    @Override
    void Sleep() {
        System.out.println("I like to sleep for 10 hours");
    }

    void eat() {
        System.out.println("Dogs like meat");
    }
}




