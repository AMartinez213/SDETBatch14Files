package com.syntax.class11;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        String userName="user1";
        String password="passeven123";
        String confirmPassword="passeven123";

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the userName");
        userName=scanner.next();
        System.out.println("Please enter the password");
        password=scanner.next();
        System.out.println("Please enter the password again");
        confirmPassword=scanner.next();




        if(userName.isEmpty() || password.isEmpty()) {
            System.out.println("Username and Password can't be empty");
        }else if(password.length()<8) {
            System.out.println("Password is too short");
        }else if(password.equals(userName)) {
            System.out.println("Password can't contain username");
        }else if(!(confirmPassword.equals(password))){
            System.out.println("Password does not match");
        }else{
            System.out.println("Your username and password has been created");
        }




    }
}
