package com.syntax.class14;

public class MethodDemo2 {

    void printManyTimes(int times){

        for (int i = 0; i < times; i++) {
            System.out.println("Hello Java");
        }

        }

        //In parameters sequence and data type matter
        void printCustomWordManyTimes(String word, int times){
            for (int i = 0; i <times ; i++) {
                System.out.println(word);

            }

        }

    public static void main(String[] args) {

    MethodDemo2 md=new MethodDemo2();
   // md.printManyTimes(2);
        md.printCustomWordManyTimes("Syntax Easy",2);

    }
}
