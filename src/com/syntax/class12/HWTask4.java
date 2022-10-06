package com.syntax.class12;
import java.lang.String;
public class HWTask4 {

    public static void main(String[] args) {

        //How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever

            StringBuilder stringBuilder = new StringBuilder("This is sentence i want to reverse");

            System.out.println(stringBuilder);
            stringBuilder.reverse();
            System.out.println(stringBuilder);

        }
    }
