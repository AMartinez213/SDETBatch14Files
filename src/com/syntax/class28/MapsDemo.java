package com.syntax.class28;

import java.util.HashMap;

public class MapsDemo {
    public static void main(String[] args) {

        HashMap<String,Double> items=new HashMap<>();
        items.put("iPhone 14",1000.);
        items.put("eggs",2.4);
        items.put("Apples",5.0);
        items.put("Keyboard",100.0);
        items.put("Flower",1.0);
        //items.remove("eggs",2.4);

        //I want to remove the items if their price is more than 10
        //Iterator<Double> iterator=items.values().iterator();//first we are getting a collection of values then a Iterator

        /*while(iterator.hasNext()){
            Double price=iterator.next();
            if(price>10){
                iterator.remove();*/

       // items.values().removeIf(price -> price > 10);
        //System.out.println(items);

        System.out.println(items.values());



        }


}