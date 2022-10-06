package com.syntax.class15;

import java.util.Scanner;

public class HWTask1ReviewMethodLargerNumber {

    //Create a method that will take 2 parameters as a numbers and prints which number is larger.

    void numIsLarger(int num1,int num2) {
        if (num1 > num2) {
            System.out.println(num1+" is greater than "+num2);
        } else if (num2 > num1) {
            System.out.println(num2+" is greater than "+num1);
        } else {
            System.out.println("Numbers are equal");
        }
    }

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter the first number");
        int num1= scan.nextInt();
        System.out.println("Please enter the second number");
        int num2= scan.nextInt();

        HWTask1ReviewMethodLargerNumber largest=new HWTask1ReviewMethodLargerNumber();

        largest.numIsLarger(num1,num2);







    }
}


