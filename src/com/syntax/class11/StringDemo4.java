package com.syntax.class11;

public class StringDemo4 {

    public static void main(String[] args) {

        String str = "Shah";
        String str2 = "Shah";
        String str3=new String("Shah");

        if(str.equals("shah")){
            System.out.println("I found it");
        }
        if(str3.equalsIgnoreCase("shah")){
            System.out.println("I found it with equalsIgnoreCase");

        }

    }


}
