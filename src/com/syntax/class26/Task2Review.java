package com.syntax.class26;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2Review {

    public static void main(String[] args) {
     /*
        create an arraylist of drinks.if any drink has letter "a" or "e" replace it with water.
         */

        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("Tea");
        drinks.add("fresh Juice");
        drinks.add("Iced Tea");
        drinks.add("Soda");
        drinks.add("canned Juice");
        drinks.add("Milk");
        drinks.add("Chocolate Milk");

        for (int i = 0; i < drinks.size(); i++) {
            if(drinks.get(i).endsWith("e")||drinks.get(i).endsWith("a")){
                drinks.set(i,"Water");//replace
            }
        }
        System.out.println(drinks);

        Iterator<String> iterator=drinks.iterator();
        while (iterator.hasNext()){
            String drink=iterator.next();
            if(drink.contains("e")||drink.contains("a")){

            }
        }
        System.out.println(drinks);
    }
}

