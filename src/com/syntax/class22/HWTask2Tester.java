package com.syntax.class22;

public class HWTask2Tester {
    public static void main(String[] args) {
        Visa visa=new Visa(100,5);
        AX ax=new AX(100,5);
        visa.calculateInterest();
        ax.calculateInterest();
    }

}
