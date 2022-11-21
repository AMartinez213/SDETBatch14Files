package com.syntax.class23;

public abstract class Animal {
    abstract void eat();
    abstract void sleep();
    void walk(){
        System.out.println("Animal is walking");
    }
}
class Cat extends Animal{
    @Override
    void eat(){
        System.out.println("Cats like fish");
    }
    @Override
    void sleep(){
        System.out.println("Cats like to sleep for 12 hours");
    }
    void showAttitude(){
        System.out.println("hmm hmm hmm");
    }
}
class Dog extends Animal{
    @Override
    void eat(){
        System.out.println("Dogs like watermelon");
    }
    @Override
    void sleep(){
        System.out.println("Dogs like to sleep 10 hours");
    }
    @Override
    void walk() {
        System.out.println("Dogs like to walk");
        super.walk();
    }
}