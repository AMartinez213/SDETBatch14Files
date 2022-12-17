package com.syntax.class27;

import java.util.HashMap;

public class MapDemo1Review {
    public static void main(String[] args) {
        var fruits=new HashMap<>();
        fruits.put("Apple",1.99);
        fruits.put("Mango",2.99);
        fruits.put("Orange",4.99);
        fruits.put("Banana",10.10);
        System.out.println(fruits);
        System.out.println(fruits.get("Orange"));
        System.out.println(fruits.isEmpty());
        fruits.replace("Mango",3.99);
        System.out.println(fruits);
        System.out.println(fruits.containsKey("Mango"));
        fruits.remove("Apple");
        System.out.println(fruits);
        System.out.println(fruits.values());
        System.out.println(fruits);
    }
}
