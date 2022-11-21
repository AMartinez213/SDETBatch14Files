package com.syntax.class27;

import java.util.HashMap;

public class MapDemo1 {
    public static void main(String[] args) {
        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("Apple",1.99);
        fruit.put("Mango",2.99);
        fruit.put("Orange",4.99);
        fruit.put("Bananas",10.1);

        System.out.println(fruit);
        System.out.println(fruit.get("Orange"));
        fruit.remove("Orange");
        System.out.println(fruit);
        System.out.println(fruit.containsKey("Mango"));
        System.out.println(fruit.containsKey("Peach"));
        System.out.println(fruit.containsValue(2.99));
        System.out.println(fruit.size());
        System.out.println(fruit.isEmpty());
        System.out.println(fruit.replace("Apple",1.99,18.99));
        System.out.println(fruit);

    }
}
