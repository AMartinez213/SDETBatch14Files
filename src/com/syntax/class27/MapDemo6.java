package com.syntax.class27;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo6 {
    public static void main(String[] args) {

        HashMap<String, Double> fruits = new HashMap<>();
//        var fruits = new HashMap<>();
        fruits.put("Apple", 1.99);
        fruits.put("Mango", 1.99);
        fruits.put("Orange", 4.99);
        fruits.put("Banana", 10.10);

        Set<Map.Entry<String,Double>> entrySet=fruits.entrySet();
//        var entrySet = fruits.entrySet();

        Iterator<Map.Entry<String,Double>> iterator= entrySet.iterator();
//        var iterator = entrySet.iterator();

        /*while (iterator.hasNext()) {
            var item = iterator.next();
            if(entrySet.contains("n")){
                iterator.remove();
            }
        }
        System.out.println(fruits);*/
    }
}