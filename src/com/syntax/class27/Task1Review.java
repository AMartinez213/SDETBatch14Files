package com.syntax.class27;

import java.util.ArrayList;

public class Task1Review {
    public static void main(String[] args) {
        /*
        Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as
        getQuote and cancelInsurance. Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as
        carModel and Class Pet has petType attribute. Create 3 objects of the sub classes and store them in ArrayList.
        Using for loop/advanced for loop/ iterator access all methods of the class.
         */
        ArrayList<InsuranceReview> insurances=new ArrayList<>();
        insurances.add(new CarReview("Adam","Tesla Model s"));
        insurances.add(new PetReview("Geico","Dog"));
        insurances.add(new HealthReview("State life"));
        System.out.println(insurances);


        for (InsuranceReview i:insurances
        ) {
            i.getQuote();
            i.cancelInsurance();
        }
    }

}

