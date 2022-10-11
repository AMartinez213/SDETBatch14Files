package com.syntax.class17;

import java.util.Scanner;

public class EmpTester {
    public static void main(String[] args) {

        Employee josh=new Employee("Josh","IT",120000,25);
        josh.printSalary();
        josh.calculatePrintTax();


        //Below we have more constructor calls
        Scanner scan=new Scanner(System.in);
        StringBuilder str=new StringBuilder();
    }
}
