package com.syntax.class13;

public class StringMethods {

    public static void main(String[] args) {


        String str = "hello";

        //toUpperCase or toLowerCase

        str.toUpperCase();
        System.out.println(str);//hello

        System.out.println("-----------------");

        str=str.toUpperCase();
        System.out.println(str);//HELLO

        int size=str.length();//length() -> gives size
        System.out.println(size);

        char letter=str.charAt(3);//Returns the char value at the specified index
        System.out.println(letter);

        char lastCharacter=str.charAt(str.length()-1);//How to get the last character
        System.out.println(lastCharacter);

        //indexOf - Returns the index within this string of the first occurence
        int index=str.indexOf(lastCharacter);
        System.out.println(index);

        System.out.println(str.indexOf('e'));//-1
        System.out.println(str);

        //isEmpty()
        boolean empty=str.isEmpty();
        System.out.println(empty);

        //


    }
}
