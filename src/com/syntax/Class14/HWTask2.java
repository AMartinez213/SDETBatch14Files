package com.syntax.class14;

public class HWTask2 {

    //Create a method that will take a number and prints whether the number is even or odd.
    boolean evenNum(int num) {
        if (num % 2 == 0) {
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {

    HWTask2 num1=new HWTask2();

        if(num1.evenNum(24)){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}
