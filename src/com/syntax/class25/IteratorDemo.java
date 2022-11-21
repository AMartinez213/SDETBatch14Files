package com.syntax.class25;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

    public static void main(String[] args) {

        ArrayList<String> beautyProducts=new ArrayList<>();
        beautyProducts.add("Blush");
        beautyProducts.add("Base");
        beautyProducts.add("Mascara");
        beautyProducts.add("Lip Stick");
        beautyProducts.add("Dove Soap");
        beautyProducts.add("Conditioner");
        beautyProducts.add("Primer");
        beautyProducts.add("Shampoo");
        beautyProducts.add("Lotion");
        beautyProducts.add("Concealer");

        Iterator<String> iterator=beautyProducts.iterator();
        /*System.out.println(iterator.hasNext());//we have one item
        System.out.println(iterator.next());//it gives us the item and also removes the item from the iterator list
        System.out.println(iterator.hasNext());

        iterator.next();
        iterator.next();
        System.out.println(iterator.next());
        System.out.println(beautyProducts);*/

        while(iterator.hasNext()){
            System.out.println(iterator.next());
            System.out.println(iterator.next());
        }
            System.out.println(beautyProducts);
    }
}
