package com.syntax.class18;

public class Dog extends Animal{

    String color;
    double height;

    public Dog(String name, String breed, String color, int age, int weight) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }
    public Dog(String name, String breed, String color, int age, int weight, double height) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weight = weight;
        this.height=height;
    }

}
