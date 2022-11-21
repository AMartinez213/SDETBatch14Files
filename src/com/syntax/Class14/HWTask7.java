package com.syntax.class14;

public class HWTask7 {
        void grade(int grade) {
        if (grade > 90) {
            System.out.println("A");
        } else if (grade >= 80 && grade < 90) {
            System.out.println("B");
        } else if (grade >= 70 && grade < 80) {
            System.out.println("C");
        } else if (grade >= 50 && grade < 70) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }

    public static void main(String[] args) {

        HWTask7 student=new HWTask7();
        student.grade(96);

    }

}
