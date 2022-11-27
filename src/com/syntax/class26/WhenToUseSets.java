package com.syntax.class26;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class WhenToUseSets {
    public static void main(String[] args) {
        var numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(40);
        numbers.add(50);
        numbers.add(50);
        numbers.add(50);
        numbers.add(50);
        numbers.add(50);
        System.out.println(numbers);

        System.out.println(new LinkedHashSet<>(numbers));

        var num=new LinkedHashSet<>(numbers);
//      num.addAll(numbers);
        System.out.println(num);
        System.out.println(new LinkedList<>(num));


    }
}
