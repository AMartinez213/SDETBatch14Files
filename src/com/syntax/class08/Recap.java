package com.syntax.class08;

import java.util.Scanner;

public class Recap {

        //Print even numbers from 20 to 1 (2 ways)

    public static void main(String[] args) {


        for (int i = 20; i >= 2; i -= 2) System.out.print(i + " ");

        System.out.println();

        for(int j=20; j>=2;j--){
            if(j%2==0) System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("------------------------------");

        //Prompt the user to ask the name 3 times and print "Good afternoon +name...."

        Scanner scan=new Scanner(System.in);

        for(int i=1; i<=3; i++){
            System.out.println("Please write a name");
            String name=scan.nextLine();
            System.out.println("Good afternoon "+name);

        }

    }

}
