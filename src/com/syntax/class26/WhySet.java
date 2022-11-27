package com.syntax.class26;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class WhySet {
    public static void main(String[] args) {
        var numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        System.out.println(numbers);


        var setNumbers=new LinkedHashSet<>();//Set doesn't allow duplicate values (HashSet Deletes first occurrence)
        setNumbers.add(10);
        setNumbers.add(20);
        setNumbers.add(10);
        System.out.println(setNumbers);



    }
}
