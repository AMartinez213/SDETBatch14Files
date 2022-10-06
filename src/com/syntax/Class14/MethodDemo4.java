package com.syntax.Class14;

import jdk.internal.org.objectweb.asm.commons.Method;

public class MethodDemo4 {

    boolean mystery() {
        return false;
    }

    String mystery2(int num) {
        return "Java";

    }

    String method(String word) {
        //return "Java";
        if (word.equals("Java")){
            return "python";
    }else
    {
        return "Java";
    }

}
    public static void main(String[] args) {

    MethodDemo4 methodDemo4=new MethodDemo4();
        System.out.println(methodDemo4.mystery());
        System.out.println(methodDemo4.mystery2(5));
        System.out.println(methodDemo4.method("python"));


    }

}
