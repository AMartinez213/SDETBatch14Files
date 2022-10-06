package com.syntax.class15;

public class HWTask5ReviewMethodUserEmail {

    String createEmail(String firstName,String lastName, String emailType) {

        return firstName + lastName + "@" + emailType + ".com".toLowerCase();
    }

    public static void main(String[] args) {

    HWTask5ReviewMethodUserEmail task5=new HWTask5ReviewMethodUserEmail();

    String fullEmail=task5.createEmail("John","Snow","gmail");
        System.out.println(fullEmail);
        System.out.println(task5.createEmail("Allan","Martinez","Yahoo"));




    }

}
