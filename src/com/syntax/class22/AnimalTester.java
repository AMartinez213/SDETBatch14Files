package com.syntax.class22;

public class AnimalTester {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sleep();
        cat.eat();

        Animal animal=new Panda();//Up-casting
        //Panda panda=new Animal();//Down-Casting (Not allowed)
        Animal animal1=new Cat();
        Animal[] animals={new Cat(),new Panda()};

    }
}