package com.syntax.class14;

public class StringBuilderVsBuilder {

    public static void main(String[] args) {


        StringBuilder stringBuilder = new StringBuilder("Today is java class");//new and improve version
        StringBuffer stringBuffer = new StringBuffer("Today is java class");//older one and not used mostly

        String str = "Java is very easy";

        //If we want to convert the String to a String builder we can use the below syntax
        StringBuilder stringBuilder1 = new StringBuilder(str);

        System.out.println("StringBuilder1 = "+stringBuilder1);

        //If we want to convert from StringBuilder to a String we can use the syntax below
        String newStr=stringBuilder1.toString();


    }
}
