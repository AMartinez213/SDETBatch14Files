package com.syntax.class17;

public class HWTask3 {

    //Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    //Method should be available inside the clase only where it was declared and executed by calling it's name.

    private static String getVowels(String str) {
        String newStr = str.replaceAll("[^aeiouAEIOU]", "");
        return newStr;
    }

    public static void main(String[] args) {

        System.out.println(getVowels("Humera"));

    }

}
