package com.syntax.class11;

public class PhoneTester {

    public static void main(String[] args) {


        HWReview iphone = new HWReview();

        iphone.make = "Apple";
        iphone.model = "iPhone 14 Pro Max";
        iphone.year = 2022;
        iphone.storage = 128;
        iphone.takePictures();

        HWReview samsungPhone = new HWReview();
        samsungPhone.model = "S22 Ultra";
        samsungPhone.make = "Samsung";
        samsungPhone.year = 2022;
        samsungPhone.makeCall();

    }
}