package com.syntax.class27;

import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {

        HashMap<String,String> data=new HashMap<>();
        data.put("Username","Anton123");
        data.put("Password","pass123");

        System.out.println(data);
        System.out.println(data.get("Password"));

    }
}
