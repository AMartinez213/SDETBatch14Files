package com.syntax.class19;

public class HWTask1 {
    /*Write a Student class   that have instance variables name and address. Create a constructor that will initialize
    those variables.
    Print name & address of given  student using displayInfo method.*/
}
class Student{
    String name;
    String address;
    public Student(String name,String address){
        this.name=name;
        this.address=address;
    }

    void displayInfo(){
        System.out.println("Name "+name+" Address "+address);
    }

    public static void main(String[] args) {
        Student josh=new Student("Josh","Earth");
        josh.displayInfo();
    }

}
