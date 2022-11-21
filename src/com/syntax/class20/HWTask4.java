package com.syntax.class20;

public class HWTask4 {

    /*Write program: userClass that has a constructor that initializes instance variable
       name and mobile number. Create a subclass userInfo that will have user address variable
       and it also being initialized through constructor call.
       Print users name, mobile number and address in userDetails method. Test your code.
     */
    public static void main(String[] args) {

        UserInfo userInfo=new UserInfo("Allan","123456789","20136 Bristow");
        userInfo.printUserDetails();


    }

    }
class UserClass{

    String name;
    String mobileNumber;
    UserClass(String name, String mobileNumber){
        this.name=name;
        this.mobileNumber=mobileNumber;

    }

}
class UserInfo extends UserClass{
    String address;
    UserInfo(String name, String mobielNumber, String address){
        super(name,mobielNumber);
        this.address=address;
    }
    void printUserDetails(){
        System.out.println("Name "+name+" Mobile number "+mobileNumber+" Address "+address);

    }

}
