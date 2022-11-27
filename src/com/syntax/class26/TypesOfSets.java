package com.syntax.class26;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TypesOfSets {
    public static void main(String[] args) {


//      There are three types of sets
//      HashSet: Downside --> It does not care about the insertion order (uses internal algorithm)
//      HashSet: Upside --> It's the fastest type of set
        var hashSet=new HashSet<>();
        hashSet.add("Mango");
        hashSet.add("Apple");
        hashSet.add("Mango");
        hashSet.add("Kiwi");
        hashSet.add("Orange");
        hashSet.add("Banana");
        System.out.println("HashSet:");
        System.out.println(hashSet);

//      Insertion speed is same as HashSet but retrieval speed is the worst
        var linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add("Mango");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Kiwi");
        linkedHashSet.add("Mango");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Banana");
        System.out.println("LinkedHashSet:");
        System.out.println(linkedHashSet);

//      Whenever you need sorted data use TreeSet
        var treeSet=new TreeSet<>();
        treeSet.add("Mango");
        treeSet.add("Apple");
        treeSet.add("Kiwi");
        treeSet.add("Mango");
        treeSet.add("Orange");
        treeSet.add("Banana");
        System.out.println("TreeSet:");
        System.out.println(treeSet);

    }
}
