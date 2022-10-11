package com.syntax.class17;

public class Employee {

    private String name;
    private String department;
    private double salary;
    private String ID;
    private double actualSalary;
    private int age;

    static String companyName="Syntax";

    protected Employee(String name, String department, double salary, int age) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.age = age;

    }

    void printSalary(){
        actualSalary=salary+20000+10000;
        System.out.println("$"+actualSalary);
    }

    void calculatePrintTax(){
        double tax=actualSalary*.3;
        System.out.println("$"+tax);

    }

}



