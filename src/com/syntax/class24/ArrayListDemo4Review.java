package com.syntax.class24;

import java.util.ArrayList;

public class ArrayListDemo4Review {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Tymur");
        names.add("Salma");
        names.add("MJ");
        names.add("Josh");
        names.add(0, "Josh Again");
        System.out.println(names);

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(35);
        numbers.add(1,100);
        numbers.set(0,1000);
        System.out.println(numbers);
        System.out.println(numbers.remove(1)+numbers.remove(0));
        System.out.println(numbers);
        numbers.clone();
        System.out.println(numbers);
        numbers.clear();
        System.out.println(numbers);

    }
}
