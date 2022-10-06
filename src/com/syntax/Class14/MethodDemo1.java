package com.syntax.Class14;

public class MethodDemo1 {

    //Method that doesn't take any parameters and prints some lines on the console
    void printHello() {
        System.out.println("Hello World");
        System.out.println("Hello Java");
        System.out.println("Hello Aladin");
    }

    //Method that takes a single parameter of type String and prints it
    void printWord(String word){
        System.out.println(word);
    }

    public static void main(String[] args) {
        MethodDemo1 obj=new MethodDemo1();
        obj.printHello();
        obj.printWord("Taivion Don't worry it's Java");
        obj.printWord("No Athira it does not make sense i am confused can you please repeat it");


    }
}
