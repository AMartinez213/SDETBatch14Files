package com.syntax.class15;

public class HWTask3ReviewMethodPalindrome {

    //Create a method that will print whether given String is palindrome or not.

    void printPalindrome(String str){
        str=str.toLowerCase();
        StringBuilder stringBuilder=new StringBuilder(str);
        stringBuilder.reverse();

        if(stringBuilder.toString().equalsIgnoreCase(str)){
        System.out.println("The string is palindrome");
    }else{
        System.out.println("The string is not palidrome");
    }

}

    public static void main(String[] args) {

        HWTask3ReviewMethodPalindrome task = new HWTask3ReviewMethodPalindrome();
        task.printPalindrome("Dad");


    }
    }
