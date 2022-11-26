package com.syntax.class30;

public class TypesOfExcep {

    public static void main(String[] args) {
        String name = null;

        if (name != null) {
            System.out.println(name.length());
        }

        int[] arr = new int[5];
        int index = 10;
        try {
            System.out.println(arr[index]);
        } catch (Exception e) {
            System.out.println("Josh please fix your issues you never write good code");
        }
        if (index < arr.length) {
            System.out.println(index);

        }

        /*try {
            System.out.println(ExcelReader.read("C:\\Users\\AMart\\IntelliJ\\Class Files\\SDETBatch14\\Data\\Test1.xlsx"));
        } catch (IOException e) {
            System.out.println("Backup Code");
        }
        System.out.println("important line of code");*/

    }
}

