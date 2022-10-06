package com.syntax.class11;

import java.util.Scanner;

public class HWTask3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What's the father's name?");
        String fathername=scan.next();
        System.out.println("What's the mother's name?");
        String mothersname=scan.next();
        System.out.println("Are you expecting a boy or girl?");
        String boyOrGirl=scan.next();

        if(boyOrGirl.equalsIgnoreCase("boy")) {
            System.out.println(fathername.substring(0,fathername.length()/2)+mothersname.substring(mothersname.length()/2));
        }else if (boyOrGirl.equalsIgnoreCase("girl")) {
            System.out.println(mothersname.substring(0,mothersname.length()/2)+fathername.substring(fathername.length()/2));
            }
        else{
            System.out.println("I dont have a name to recommend");
        }



    }
}



