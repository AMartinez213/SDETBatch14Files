package com.syntax.class22;

public class HWTask2 {
}
    class CreditCard {
        double balance;
        double interest;

        CreditCard(double balance, double interest) {
            this.balance=balance;
            this.interest=interest;
        }

        void calculateInterest() {
            double interestAmount = interest * balance / 100;
            this.interest = interest;
            this.balance = balance;
            System.out.println("Interest Amount " + interestAmount);
        }
    }

    class Visa extends CreditCard {
        Visa(double balance, double interest) {
            super(balance, interest);
        }
        @Override
        void calculateInterest() {
            double interestAmount = interest*balance/ 100;
            System.out.println();
            System.out.println("Interest Amount "+(interestAmount+5));
        }
    }

    class AX extends CreditCard {
        AX(double balance, double interest) {
            super(balance, interest);
        }

        @Override
        void calculateInterest() {
            double interestAmount = interest * balance / 100;
            System.out.println();
            System.out.println("Interest Amount " + (interestAmount + 10));
        }
    }

