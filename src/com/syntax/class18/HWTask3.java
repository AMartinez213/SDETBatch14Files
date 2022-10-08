package com.syntax.class18;

public class HWTask3 {
    /*Write a java class that have 4 constructors with 4 different access levels of
    constructors(private,public,default,protected) and create 4 objects of this
    class: 1 - inside same class; 2 - from outside the class; 3 - from different class inside different package
    and observe result.
     */

    private HWTask3(){
        System.out.println("private");
    }
    HWTask3(String name){
        System.out.println("default");
    }
    protected HWTask3(int name){
        System.out.println("protected");
    }
    public HWTask3(boolean name){
        System.out.println("public");
    }

    public static void main(String[] args) {
        new HWTask3();
        new HWTask3("Thank you!");
        new HWTask3(5);
        new HWTask3(true);


    }

}
