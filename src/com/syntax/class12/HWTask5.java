package com.syntax.class12;

public class HWTask5 {

    public static void main(String[] args) {
        //How would you check if String is palindrome or not? aba=> true
        //Abbc =>false

        String str="RacecaR";
        String str1="";
        int strLength = str.length();


        for(int i=(strLength-1);i>=0;--i) {
            str1= str1+ str.charAt(i);
        }

        if (str.toLowerCase().equals(str1.toLowerCase())) {
            System.out.println(str + " is a Palindrome String.");
        }
        else {
            System.out.println(str + " is not a Palindrome String.");
        }
    }
}
