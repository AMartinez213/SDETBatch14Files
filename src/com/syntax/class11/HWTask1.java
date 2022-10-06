package com.syntax.class11;

public class HWTask1 {

    public static void main(String[] args) {

        /*Create a String and if the String is not empty perform the following:
        if the String has an odd number of characters and has 3 or more characters,
        print the character in the middle of the String.*/

            String car="Maybach";


            for(int i=0;i<car.length();i++) {

            if(car.isEmpty()) {
                System.out.println("String is empty");
            }else if (car.length() > 3) {
            }
            }
            System.out.println(car.charAt(car.length()/2));
    }
}
