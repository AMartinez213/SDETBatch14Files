package com.syntax.class13;

public class Questions {

    public static void main(String[] args) {

        String str="hello";
        String newString="";

        for(int i=str.length()-1;i>=0;i--) {

            newString = newString + str.charAt(i);
        }

        StringBuilder sb=new StringBuilder("hello");
        sb.reverse();

    }


}
