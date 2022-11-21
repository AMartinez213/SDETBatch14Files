package com.syntax.class28;

import java.util.HashMap;

public class MapDemo5 {
    public static void main(String[] args) {


        HashMap<String, Double> items = new HashMap<>();
        items.put("iPhone 14", 1000.);
        items.put("eggs", 2.4);
        items.put("Apples", 5.0);
        items.put("Keyboard", 100.0);
        items.put("Flower", 1.0);

        var entrySet=items.entrySet().iterator();
        System.out.println(items);

    }
}
