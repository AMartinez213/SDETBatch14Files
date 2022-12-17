package com.syntax.class27;

import java.util.HashMap;

public class MapeDemo4Review {
    public static void main(String[] args) {

        HashMap<String,Double> fruits = new HashMap<>();
        fruits.put("Apple", 1.99);
        fruits.put("Mango", 2.99);
        fruits.put("Orange", 4.99);
        fruits.put("Banana", 10.10);

//        var allKeys=fruits.keySet();
//        System.out.println(allKeys);
//
//        var iterator=allKeys.iterator();
//
//        while(iterator.hasNext()){
//            var item=(String)iterator.next();
//            if(item.contains("n")){
//                iterator.remove();
//            }
//        }
//        System.out.println(allKeys);
        fruits.keySet().removeIf(x->x.contains("n"));
        System.out.println(fruits);
    }

}
