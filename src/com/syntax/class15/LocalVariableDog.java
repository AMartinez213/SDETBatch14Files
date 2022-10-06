package com.syntax.class15;

public class LocalVariableDog {

    String name;//instance
    static int noOfLegs=4;//static


    void bark(){
        int i=10;//local
        for (int j = 0; j <10 ; j++) {
            //int j is also a local variable
            System.out.println("Barking......");

        }

    }

    public static void main(String[] args) {

        LocalVariableDog dog1=new LocalVariableDog();

        dog1.name="Tomy";
        dog1.bark();

        LocalVariableDog dog2=new LocalVariableDog();
        dog2.name="Lucky";
        dog2.bark();
        System.out.println(dog2.name);

    }




}
