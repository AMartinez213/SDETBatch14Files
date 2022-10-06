package com.syntax.class16;

public class Student {

    /*Create a class called students
      Create three variables Name, ID, and numbersOfStudents
      Create three objects of the Student Class
      Set the value for studentName, studentID, and increment the numberOfStudents for each object
      Print out total number of students
    */

    String name;
    String ID;
    static int numberOfStudents;


    public static void main(String[] args) {

        Student roman = new Student();

        roman.ID="1";
        roman.name="Roman";
        Student.numberOfStudents++;

        Student allan = new Student();

        allan.ID="2";
        allan.name="Allan";
        Student.numberOfStudents++;

        Student gary = new Student();

        gary.ID="3";
        gary.name="Gary";
        Student.numberOfStudents++;

        System.out.println(roman.name);
        System.out.println(numberOfStudents);

    }
}
