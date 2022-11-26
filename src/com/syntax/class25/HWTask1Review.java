package com.syntax.class25;

import java.util.ArrayList;

public class HWTask1Review {
    /*Create an ArrayList that will store 5 names into it.Find out whether the given ArrayList
       is empty or not?Check whether the specific name is present in an ArrayList or not?Find the size
       of your ArrayList and print all values from that.*/

    /*Non-generic way of using collections framework this is how your ancestors use to write code before Java 1.5
    it causes a lot of problems at run time because java don't know at compile time what type of data you are using in
    this class and because java does not know it can't help you avoid these errors*/

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(5);
        names.add("Gary");
        names.add("Christopher");
        names.add("Gerrardo");
        names.add("Kimberly");
        names.add("Brandon");

        System.out.println(names.isEmpty());
        System.out.println(names.contains("Gary"));
        System.out.println(names.size());
        System.out.println(names);
    }
}
