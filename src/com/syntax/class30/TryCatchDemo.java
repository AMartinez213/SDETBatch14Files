package com.syntax.class30;

public class TryCatchDemo {
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (NullPointerException npe) {
            System.out.println("Got null pointer exception");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Got Index out of bounds exception this time");
        }catch(NegativeArraySizeException e){
            System.out.println("Josh cant create arrays with negative size");
        }catch(ArithmeticException e){
            System.out.println("Not mathematically supported");
        }catch (Exception e){
            System.out.println("I can handle any type of excpetion");
        }

    }
    public static void doSomething(){
        /*String name=null;
        System.out.println(name.length());*/

        int arr[]=new int[1];
        System.out.println(arr[10]);
        String str="dsfnksd";
        str.charAt(20);

        /*System.out.println(1001/0);*/


    }
}
