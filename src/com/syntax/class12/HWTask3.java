package com.syntax.class12;

public class HWTask3 {

    //You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
    // How would you find out how many sentences are in that String?

    public static void main(String[] args) {

        String str="Is it saturday? Is it raining? Do we have a Java class today?";

        String [] arr = str.split("[?]");
        int sum=0;
        for(int i=0;i<arr.length;i++) {
            sum += i;
        }
        System.out.println(sum);


    }



}
