package com.syntax.class11;

public class HWTask2 {

    public static void main(String[] args) {

        //Create a String and print it in reverse order (Sunday → yadnuS).

        String sun="Sunday";
        char[] suns=sun.toCharArray();
        String reverse="";
        for(int i=suns.length-1;i>=0;i--){
            reverse+=suns[i];
        }
        System.out.println(reverse);

    }


}
