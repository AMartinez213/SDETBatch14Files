package com.syntax.class26;

import java.util.ArrayList;

public class Task1Review {
    public static void main(String[] args) {


 /* Create an arrayList of words.
       Remove every word that ends with āeā.
     */
        ArrayList<String> words=new ArrayList();
        words.add("Java");
        words.add("India");
        words.add("Palestine");
        words.add("USA");
        words.add("France");
        words.add("Pakistan");
        words.add("Ukraine");

        words.removeIf(word -> word.endsWith("e"));
        System.out.println(words);

        /*var iterator=words.iterator();

        while (iterator.hasNext()){
            var item=iterator.next();
            if(item.endsWith("e")){
                iterator.remove();
            }
        }

        System.out.println(words);*/

    }
}

