package com.syntax.class13;

public class StringMethods1 {

    public static void main(String[] args) {


      String myStr="This is the sentence that i want to reverse";

      String[] array=myStr.split(" ");
        System.out.println(array.length);
        System.out.println(array[3]);

        for(int i=array.length-1;i>=0;i--){
            System.out.print(array[i]);
            System.out.print(" ");
        }

    }
}
