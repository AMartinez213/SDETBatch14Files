package com.syntax.class27;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class MapDemo5Review {
    public static void main(String[] args) {

        HashMap<String,Double> fruits=new HashMap<>();
//        var fruits = new HashMap<>();
        fruits.put("Apple", 1.99);
        fruits.put("Mango", 1.99);
        fruits.put("Orange", 4.99);
        fruits.put("Banana", 10.10);

//        var allValues=fruits.values();
        Collection<Double> allValues=fruits.values();
//        var iterator=allValues.iterator();
//        Iterator iterator=allValues.iterator();
        Iterator<Double> iterator=allValues.iterator();

        while(iterator.hasNext()) {
           var item= (Double) iterator.next();
            if (item>2) {
                iterator.remove();
            }
        }
        System.out.println(fruits);
        /*fruits.values().removeIf(item1->item1>2);
        System.out.println(fruits);*/
    }
}