package com.syntax.class24;

import java.util.ArrayList;

public class ArrayListDemo2Review {
    public static void main(String[] args) {

//      int = Integer
//      boolean = Boolean
//      byte = Byte
//      double=Double
//      long=Long
//      float=Float
//      char=Character

        ArrayList<Integer> num = new ArrayList<>();

        num.add(10);
        num.add(20);
        num.add(35);
        System.out.println(num);

        var a=24;
        num.add(a);
        System.out.println(num);

        for (Integer numbers:num){
            System.out.print(numbers+", ");
        }
    }
}
