package com.syntax.class24;
import java.util.ArrayList;
public class Homework {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Allan");
        names.add("Gerrardo");
        names.add("Gary");
        names.add("Christopher");
        names.add("Brandon");

        if (names.isEmpty()) {
            System.out.println("Names ArrayList is Empty");
        } else {
            System.out.println("Names ArrayList in NOT Empty");
        }
        if (names.contains("Gary")) {
            System.out.println("Gary is present in the ArrayList");
        } else {
            System.out.println("Gary is NOT present in the ArrayList");
        }
        System.out.println(names.size());

        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("************************");
        names.forEach(System.out::println);
    }
}
