package com.syntax.class08;

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {

        //from the range of 1 to 50 find the sum of all even and odd numbers

        int sumOfEven=0;
        int sumofOdd=0;

        for(int i=1;i<=50;i++) {
            if (i % 2 == 0) {
                sumOfEven += i;
            } else if(i%2!=0){
                    sumofOdd+=i;
            }
        }
            System.out.println(sumOfEven);
        System.out.println(sumofOdd);

        System.out.println("----------------------------");

        //Create a secret number and let the user guess the secret number
        //If user guesses the correct secret number --> print "You Won!!!"

        int secretNum=24;
        int guessedNum;

        Scanner scan=new Scanner(System.in);

        do {
            System.out.println("Please enter a secret number");
            guessedNum = scan.nextInt();
        }while(guessedNum!=secretNum);

            System.out.println("You won!!!!");
    }
}


