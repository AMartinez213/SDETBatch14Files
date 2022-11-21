package com.syntax.class14;

public class HWTask3 {

    //Create a method that will print whether given String is palindrome or not.
    void palindrome(String word) {

        StringBuilder word1 = new StringBuilder(word);
        word1.reverse();

        if (word1.toString().equalsIgnoreCase(word)) {
            System.out.println("The word is a palindrome");
        } else {
            System.out.println("The word is not a palindrome");
        }
    }

    public static void main(String[] args) {

        HWTask3 str=new HWTask3();
        str.palindrome("Racecar");

            }
   }


