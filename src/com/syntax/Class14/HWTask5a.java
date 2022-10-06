package com.syntax.Class14;

public class HWTask5a {
    //Create a method createEmail(). Based on values of users name, lastName and email type, your method
    // should return complete email Address. Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
    String userName;
    String lastName;
    void createEmail() {
        System.out.println(userName + lastName + "@gmail.com");
    }

    public static void main(String[] args) {
    HWTask5a user=new HWTask5a();

    user.userName="John";
    user.lastName="Snow";
        user.createEmail();

    }
}
