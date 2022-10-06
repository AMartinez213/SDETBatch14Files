package com.syntax.class17;

public class Dog {

    String name;
    String breed;
    String color;
    int age;
    double weight;

    void printInfo(){
        System.out.println("name "+name+" "+"breed"+" age "+age);
    }

    public static void main(String[] args) {

        Dog dog=new Dog();
        dog.name="Tomy";
        dog.breed="Huskey";
        dog.color="Pink";
        dog.age=10;
        dog.weight=30;
        dog.printInfo();

      //Dog dog2=new Dog();
      //dog2.name="Cmi";
      //dog2.breed="German";
      //dog2.color="Green";
      //dog2.age=12;
      //dog2.weight=30;
      //dog2.printInfo();

        Dog dog2=new Dog();

    }


}
