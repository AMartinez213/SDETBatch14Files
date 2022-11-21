package com.syntax.class30;

public class FinallyBlockDemo {
    public static void main(String[] args) {

        try{
            System.out.println(10/0);
        }catch(ArithmeticException e){
            System.out.println("Operation not allowed");
        }finally{
            System.out.println("This block is always is executed no matter what");
        }

    }
}
