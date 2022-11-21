package com.syntax.class23;

public class HWTask1Review {
    /*
    Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
    Define common behavior within parent class and override some of the methods in child classes
    Define some methods specific to child classes.
    Write example of achieving run time polymorphism.
     */

    class Student{

        void study(){
            System.out.println("Students must study");
        }
        void doHomework(){
            System.out.println("Studens must solve their homework");
        }
        void doPractice(){
            System.out.println("Students must practice to get good marks");
        }
    }
    class SyntaxStudent extends Student{
        @Override
        void doHomework() {
            System.out.println("Syntax students must solve all Repls three times");
        }
        @Override
        void doPractice() {
            System.out.println("Syntax student must do their own research and practice");
        }
    }
    class CollegeStudent extends Student{
        @Override
        void doPractice() {
            System.out.println("College students must practice to get good marks");
        }
    }
    class SchoolStudents extends Student{
    }
}
