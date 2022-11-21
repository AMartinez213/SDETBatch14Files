package com.syntax.class25;

import java.util.ArrayList;

    public class IteratorDemo3 {

        public static void main(String[] args) {
            ArrayList<String> beautyProducts = new ArrayList<>();
            beautyProducts.add("Blush");
            beautyProducts.add("Base");
            beautyProducts.add("Mascara");
            beautyProducts.add("lipstick");
            beautyProducts.add("Dove Soap");

            var iterator = beautyProducts.iterator();

            while (iterator.hasNext()) {
                var item = iterator.next();
                if (item.startsWith("B") || item.endsWith("a")) {
                    iterator.remove();
                }
            }
            System.out.println(beautyProducts);
        }
    }