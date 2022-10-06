package com.syntax.class15;

public class HWTask2ReviewMethodOddOrEven {

    //Create a method that will take a number and prints whether the number is even or odd.

    void printEvenOrOdd(int number) {

        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }

    public static void main(String[] args) {

        HWTask2ReviewMethodOddOrEven number=new HWTask2ReviewMethodOddOrEven();

        number.printEvenOrOdd(23);

    }


}
