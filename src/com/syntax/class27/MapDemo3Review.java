package com.syntax.class27;

import java.util.HashMap;

public class MapDemo3Review {
    public static void main(String[] args) {
        var fruits=new HashMap<>();
        fruits.put("Apple",1.99);
        fruits.put("Mango",2.99);
        fruits.put("Orange",4.99);
        fruits.put("Banana",10.10);
        fruits.put("Banana",12.10);
        System.out.println(fruits);

        var keySet=fruits.keySet();
        System.out.println(keySet);
        var values=fruits.values();
        System.out.println(values);
    }
}
