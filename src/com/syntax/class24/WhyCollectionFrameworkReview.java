package com.syntax.class24;

import java.util.ArrayList;
import java.util.Arrays;

public class WhyCollectionFrameworkReview {
    public static void main(String[] args) {
//        If we have to store a single value we should use variables
        var name="Josh";
        var name2="Joe";
        System.out.println(name);
        System.out.println(name2);

//        If we have to store more than 2 values of same data type then we should go with an array
        String[] names={"Reshad","Adam","Again Josh"};

//        fixed in size
        String [] breeds=new String[10];
        breeds[0]="Bulldogs";
        breeds[1]="Lab";
        breeds[2]="Pit";
        System.out.println(Arrays.toString(breeds));

        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Blue");
        arrayList.add("Bluee");
        arrayList.add("Blueee");
        arrayList.add("Blueeee");
        arrayList.add("Blueeeee");
        arrayList.add("Blueeeeee");

        /*System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));
        System.out.println(arrayList);
        System.out.println(arrayList.indexOf("Blueee"));*/

        for(String arr:arrayList){
            var Names=arr;
            System.out.print(Names+", ");
        }
    }
}
