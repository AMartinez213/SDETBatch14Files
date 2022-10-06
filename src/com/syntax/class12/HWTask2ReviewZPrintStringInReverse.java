package com.syntax.class12;

public class HWTask2ReviewZPrintStringInReverse {

    public static void main(String[] args) {

        String str="Sunday";

        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();//line to seperate code

        //Another Way

        char[] charArr=str.toCharArray();

        for(int i=charArr.length-1;i>=0;i--){
            System.out.print(charArr[i]);
        }


    }

}
