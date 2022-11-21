package com.syntax.class26;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {

        LinkedList<String> linkedList=new LinkedList<>();

        long startTime=System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(0,"Test");
        }
        long endtime= System.currentTimeMillis();
        System.out.println("Linked List "+(endtime-startTime));


        ArrayList<String> arrayList=new ArrayList<>();
        long startTimeA=System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(0,"Test");
        }
        long endtimeA= System.currentTimeMillis();
        System.out.println("ArrayList "+(endtimeA-startTimeA));

        
    }
}
