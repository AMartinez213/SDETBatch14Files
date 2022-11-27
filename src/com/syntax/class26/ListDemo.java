package com.syntax.class26;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {

        var words=new ArrayList<>();
//        ArrayList<String> words = new ArrayList<>();
        List<String> words2 = new ArrayList<>();
        words2 = new LinkedList<>();


        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.addFirst("Hi");
    }
}
