package com.syntax.class27;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {

        ArrayList<Insurance> insurances=new ArrayList<>();
        insurances.add(new Car("Adam","Tesla Model S"));
        insurances.add(new Pet("Geico","Dog"));
        insurances.add(new Health("State Life"));
        System.out.println(insurances);

        for (Insurance i:insurances){

        i.getQuote();
        i.cancelInsurance();
        }
    }
}
