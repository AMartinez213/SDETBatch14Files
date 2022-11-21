package com.syntax.class14;

public class Task5Review {

    public static void main(String[] args) {

        String str="dad";
        StringBuilder stringBuilder=new StringBuilder("dad");
        stringBuilder.reverse();

        if(stringBuilder.toString().equals(str)){
            System.out.println("The string is palindrome");
        }else{
            System.out.println("The string is not palidrome");
        }
    }
}
