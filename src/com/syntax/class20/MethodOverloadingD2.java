package com.syntax.class20;

public class MethodOverloadingD2 {
    static void method(String name, int number) {
        System.out.println(name + " " + number);
    }

    void F1(String name, int number, int number2) {
        System.out.println(name + " " + number);
    }

    void F1(String name, int number, int number2, int number3) {
        System.out.println(name + " " + number);
    }
}