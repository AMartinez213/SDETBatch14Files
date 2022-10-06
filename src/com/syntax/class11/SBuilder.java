package com.syntax.class11;

public class SBuilder {

    public static void main(String[] args) {

        StringBuilder stringBuilder=new StringBuilder("IntelliJ is great");

        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        /*
        String doess not allow any methods to change the original contents of the variables
         because String is immutable
        */

        String str=" Intellij ";
        str.toLowerCase();
        System.out.println(str);


        /*String country="USA";
        String home="USA";
        StringBuilder state=new StringBuilder("New York");
        StringBuilder state2=new StringBuilder("New York");*/

    }



}
