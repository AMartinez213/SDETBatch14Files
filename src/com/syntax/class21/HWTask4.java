package com.syntax.class21;

public class HWTask4 {

    /*
    Create 1 class with a private method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */

  private static void print() {
        System.out.println("I love java");
    }
    static void print(String str) {
        System.out.println("I love "+str);
    }
    static void print(String str,int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("I love " + str);
        }
    }
    public static void main(String[] args) {
        print("Allan",4);
    }
}
