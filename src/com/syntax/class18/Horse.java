package com.syntax.class18;

public class Horse extends Animal {


    public Horse(String name,String breed, int age, double weight){
        this.name=name;
        this.breed=breed;
        this.age=age;
        this.weight=weight;
    }

    public static void main(String[] args) {
        Horse horseObject=new Horse("Spirit","Mustang",20,200);
        horseObject.printInfo();


    }




}
