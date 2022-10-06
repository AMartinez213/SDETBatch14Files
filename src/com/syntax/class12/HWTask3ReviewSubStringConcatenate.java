package com.syntax.class12;

import java.util.Scanner;

public class HWTask3ReviewSubStringConcatenate {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the name of mother");
        String motherName=scan.next();
        System.out.println("Please enter the name of father");
        String fatherName=scan.next();
        System.out.println("Are you expecting a boy or girl");
        Boolean isBoy=scan.nextBoolean();



        if(isBoy) {

            String firstHalf = fatherName.substring(0, fatherName.length() / 2);
            String secondHalf = motherName.substring(motherName.length() / 2);
            System.out.println(firstHalf + secondHalf);

        }else{
            String firstHalf = motherName.substring(0, motherName.length() / 2);
            String secondHalf = fatherName.substring(fatherName.length() / 2);
            System.out.println(firstHalf + secondHalf);

        }


    }
}
