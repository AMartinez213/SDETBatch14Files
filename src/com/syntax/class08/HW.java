package com.syntax.class08;

import java.util.Scanner;

public class HW {

        //Declare a variable to store a price for a coffee. Ask the user to pay for the coffee.
        //Keep asking to pay for the coffee until the user enters the EXACT amount
        //If the user give more than coffee price --> Ask them to give less, if the user gives less money
        // than ask to give more. Once user give EXACT amount print "Please enjoy your coffee.

        public static void main(String[] args) {

            double user;
            double price=12;
            Scanner scan = new Scanner(System.in);

            do {
                System.out.println("Please pay for your coffee");
                user = scan.nextDouble();
                if (user > price) {
                    System.out.println("Please give me less money");
                } else if (user < price) {
                    System.out.println("Please give me more money");
                }
            } while (user != price);

            System.out.println("Thank you, enjoy your coffee!!");

    }
}
