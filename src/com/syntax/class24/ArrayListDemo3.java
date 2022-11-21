package com.syntax.class24;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {

        ArrayList<Character> chars = new ArrayList<>();

        chars.add('a');
        chars.add('b');
        chars.add('c');
        chars.add('d');
        chars.add('f');

        for(Character num:chars){
            System.out.println(num);
        }


        ArrayList<Boolean> booleans = new ArrayList<>();
        booleans.add(false);
        booleans.add(false);
        booleans.add(true);

        System.out.println(booleans);

        ArrayList<Float> flo=new ArrayList<>();

        flo.add(3.2f);
        flo.add(4.2f);
        flo.add(5.2f);
        System.out.println(flo);
    }
}
