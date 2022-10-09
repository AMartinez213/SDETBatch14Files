package com.syntax.class17;

public class Employee {

    String name;
    String department;
    double salary;
    String ID;
    int age;
    double actualSalary;
    static String companyName="Syntax";

    void printSalary(){
        double actualSalary=salary+20000+10000;
        System.out.println(actualSalary);
    }
    void calculatePrintTax(){
        double tax=actualSalary*.3;
        System.out.println("Tax= "+tax);

    }

    public static void main(String[] args) {
        Employee emp1=new Employee();




    }






    }



