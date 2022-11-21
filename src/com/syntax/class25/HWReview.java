package com.syntax.class25;

import java.util.ArrayList;

public class HWReview {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Serhii");
        names.add("Nesrin");
        names.add("Jam");
        names.add("Jamo");
        names.add("Jami");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Jam"));
        System.out.println(names.size());
        System.out.println(names);

    }
}
