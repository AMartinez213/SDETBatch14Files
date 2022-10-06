package com.syntax.class12;

public class HWTask4Test {
    public static void main(String[] args) {
//declaring and initializing a string
        String str = "This is sentence I want to reverse";
//declaring an empty string array
        String[] strArray = null;
//converting using String.split() method with whitespace as a delimiter
        strArray = str.split(" ");
//printing the converted string array
        for (int i= strArray.length-1;i>=0; i--){
            System.out.print(strArray[i]+" ");

            //sihT si ecnetnes i tnaw ot esrever
        }
    }
}

