package com.syntax.class26;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {

        //create an arraylist of drinks. If any drinks has letter "a" or "e" replace it with water

        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("Lemonade");
        drinks.add("Orange Juice");
        drinks.add("Tea");
        drinks.add("Milk");
        drinks.add("Soda");

        for (int i = 0; i <drinks.size(); i++) {
            if(drinks.get(i).contains("a")|| drinks.contains("e")){
                drinks.set(i,"water");

            }

        }
        System.out.println(drinks);


    }
}
