package com.syntax.class27;

import java.util.LinkedHashMap;

public class MapDemoReview {
    public static void main(String[] args) {

        var data=new LinkedHashMap<>();
        data.put("Mango","Work");
        data.put("Apple",2.00);
        data.put("Grapes",2.34f);

        data.put("Apple",4.44);
        System.out.println(data);


    }
}
