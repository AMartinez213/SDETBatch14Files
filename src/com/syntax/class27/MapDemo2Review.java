package com.syntax.class27;

import java.util.LinkedHashMap;

public class MapDemo2Review {
    public static void main(String[] args) {
        var beautyProducts = new LinkedHashMap<>();
        beautyProducts.put("Foundation",50.5);
        beautyProducts.put("Blush",20);
        beautyProducts.put("Lipstick",10.5);

        var cosmetics=new LinkedHashMap<>();
        cosmetics.put("Soap",10.2);
        cosmetics.put("Conditioner",20.5);
        cosmetics.put("Shampoo",30.99);

        var grocery=new LinkedHashMap<>();
        grocery.putAll(beautyProducts);
        grocery.putAll(cosmetics);
        System.out.println(grocery);
    }
}
