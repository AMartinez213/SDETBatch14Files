package com.syntax.class16;

public class Task1Tester {

    public static void main(String[] args) {

        SyntaxEmployee asgharEmp = new SyntaxEmployee();

        asgharEmp.empID = "123";
        asgharEmp.salary = 100000;

        SyntaxEmployee.CEO="Asel";
        System.out.println(SyntaxEmployee.CEO);
        SyntaxEmployee moazzamEmp = new SyntaxEmployee();
        moazzamEmp.empID = "124";
        moazzamEmp.salary = 100000;

        System.out.println(SyntaxEmployee.CEO);


    }


}



