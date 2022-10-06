package com.syntax.class15;

public class VariableHondaBike {

    static int topSpeed=200;
    static int noOfTires=2;
    String model;
    int year;

    public void printTotalDistance(int noOfGallons, int avg) {

        double distance = noOfGallons / 10;
        System.out.println("Your bike can go max " + distance + " mpg with this many gallons " + noOfGallons);
    }

    public static void main(String[] args) {

        System.out.println(VariableHondaBike.noOfTires);
        VariableHondaBike ybr=new VariableHondaBike();
        ybr.model="ybr100";
        ybr.printTotalDistance(10,25);


    }

}
