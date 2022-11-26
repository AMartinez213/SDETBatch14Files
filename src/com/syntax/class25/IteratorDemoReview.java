package com.syntax.class25;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemoReview {
    public static void main(String[] args) {

        ArrayList<String> beautyProducts = new ArrayList<>();
        beautyProducts.add("Blush");
        beautyProducts.add("Base");
        beautyProducts.add("Mascara");
        beautyProducts.add("Lipstick");
        beautyProducts.add("Dove Soap");
        beautyProducts.add("Conditioner");
        beautyProducts.add("Primer");
        beautyProducts.add("Shampoo");
        beautyProducts.add("Lotion");
        beautyProducts.add("Concealer");
        beautyProducts.add("Eyeliner");
//      get the iterator from the list
        Iterator<String> iterator=beautyProducts.iterator();
       /* System.out.println(iterator.hasNext());//we have one item
        System.out.println(iterator.next());//it gives us the item and also removoes the item from iterator
        System.out.println(iterator.hasNext());
        iterator.next();
        iterator.next();
        System.out.println(iterator.next());*/

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
