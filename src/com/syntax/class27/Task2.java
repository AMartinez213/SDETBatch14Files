package com.syntax.class27;

import java.util.LinkedList;

public class Task2 {

    public static void main(String[] args) {


        LinkedList<Card> cards = new LinkedList<>();
        cards.add(new Card(10,"Credit Card",2000));
        cards.add(new Card(15,"Credit Card",3000));
        cards.add(new Card(20,"Credit Card",1000));

        for (Card card:cards
             ) {
            System.out.println(card.toString());
            card.printBalance();

        }
    }

}
class Card{
    double interestRate;
    String cardType;
    double balance;

    public Card(double interestRate, String cardType,double balance) {
        this.interestRate = interestRate;
        this.cardType = cardType;
        this.balance=balance;
    }

    void printBalance(){
        System.out.println(balance);
    }

    @Override
    public String toString() {
        return "Card{" +
                "interestRate=" + interestRate +
                ", cardType='" + cardType + '\'' +
                '}';
    }
}