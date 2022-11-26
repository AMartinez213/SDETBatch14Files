package com.syntax.class25;

import java.util.ArrayList;

public class IteratorDemo3Review {
    public class IteratorDemo3 {

        public static void main(String[] args) {
            ArrayList<String> beautyProducts = new ArrayList<>();
            beautyProducts.add("Blush");
            beautyProducts.add("Base");
            beautyProducts.add("Mascara");
            beautyProducts.add("lipstick");
            beautyProducts.add("Dove Soap");

            beautyProducts.removeIf(item -> item.startsWith("B") || item.endsWith("a"));
            System.out.println(beautyProducts);
        }
    }

}
