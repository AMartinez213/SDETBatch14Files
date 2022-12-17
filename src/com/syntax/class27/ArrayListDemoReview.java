package com.syntax.class27;

import java.util.ArrayList;

public class ArrayListDemoReview {
    public static void main(String[] args) {
        var dogs=new ArrayList<>();
        dogs.add(new DogReview("Tommy","Brown","Blue"));
        dogs.add(new DogReview("Jony","White","German"));
        dogs.add(new DogReview("Peanut","White/Brown","Mix"));

        DogReview dog=new DogReview("Tyson","Brown","Pit");
        System.out.println(dog);
        System.out.println(dogs.get(0));
        System.out.println(dogs.get(1));
        System.out.println(dogs.get(2));

    }
}
