package com.syntax.class12;

public class HWTask2 {

    public static void main(String[] args) {

        //Create a String that should be combination of letters, numbers and special characters.
        // Find out how many Alphanumeric(abd AZ 284) characters are there in the String.

        String str="asdf1234ASDF@$@$567890";
        String str1=str.replaceAll("[^a-zA-Z0-9]","");

        System.out.println(str1.length());











    }

}
