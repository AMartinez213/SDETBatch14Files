package com.syntax.class27;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Tomy", "Black", "German"));
        dogs.add(new Dog("Jony", "White", "Bulldog"));
        dogs.add(new Dog("Kimi", "Brown", "Poodle"));

        Dog dog = new Dog("Tomy", "Black", "German");

        System.out.println(dogs.toString());

    }
}