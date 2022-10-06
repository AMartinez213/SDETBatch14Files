package com.syntax.class12;
import java.lang.String;

public class HWTask6 {

    public static void main(String[] args) {

        //How would you swap  2 strings without a temporary variable?

        String str="Hello";
        String str1="Good Bye";

        System.out.println(str.replace(str,str1));
        System.out.println(str.replace(str1,str));




    }
}
