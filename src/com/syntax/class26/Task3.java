package com.syntax.class26;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();
        for (int i = 2; i <=500; i+=2) {
            numbers.add(i);
        }
        System.out.println(numbers);

        var it=numbers.iterator();

        while(it.hasNext()){
            Integer num=it.next();
            if(num%5==0){
                it.remove();
            }

        }
        System.out.println(numbers);
    }
}
