package com.syntax.Class14;

public class HWTask1 {

     //Create a method that will take 2 parameters as a numbers and prints which number is larger.

     void numIsLarger(int num1,int num2) {
          if (num1 > num2) {
               System.out.println("Num1 is greater than Num2");
          } else {
               System.out.println("Num2 is greater than Num1");
          }
     }

     public static void main(String[] args) {

          HWTask1  largest=new HWTask1();

          largest.numIsLarger(120,24);




     }
}
