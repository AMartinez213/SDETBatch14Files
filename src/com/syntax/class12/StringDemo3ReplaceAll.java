package com.syntax.class12;

public class StringDemo3ReplaceAll {

    public static void main(String[] args) {
        //ASCI table
        //how to remove numbers from a string using regular expression in java(what to Google example)
        String str="sfksKAFBDAJKF11493!@#%$%$*$";

        System.out.println(str.replaceAll("[0-9]","@"));
        System.out.println(str.replaceAll("[0-9]",""));
        System.out.println(str.replaceAll("[a-z]","[A-Z]"));
        System.out.println(str.replaceAll("[sf]",""));//no comma need to specify what you want to replace
        //System.out.println(str.replaceAll("[#]","$"));
        System.out.println(str.replaceAll("[A-z]","[@]"));
        System.out.println(str.replaceAll("[0-9]","8"));
        System.out.println(str.replaceAll("[^a-z]",""));//^means not
        System.out.println(str.replaceAll("[^a-zA-Z]",""));//^means not with two ranges
        System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));//^means not with three ranges


    }


}
