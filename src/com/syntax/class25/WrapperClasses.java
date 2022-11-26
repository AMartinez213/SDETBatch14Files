package com.syntax.class25;

import java.util.ArrayList;

public class WrapperClasses {
    public static void main(String[] args) {
        int num = 10;
//      Boxing or manual conversion from primitive to wrapper type
//      Integer wrappedNum = Integer.valueOf(num);
//      Auto-Boxing or Automatic conversion of a primitive to a wrapper type
        Integer wrappedNum = num;
        System.out.println(wrappedNum);

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
//      Un-Boxing converting a wrapper type to a corresponding primitive type
//      int num2=wrappedNum.intValue();
//      Auto Un-Boxing or Automatic conversion of a wrapper type to a primitive type.
        int num2=wrappedNum;
    }
}