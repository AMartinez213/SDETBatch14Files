package com.syntax.class22;

public class WebDriver {
    public void startBrowser(){
        System.out.println("Starting the Browser");
    }
    public void Test(){
        System.out.println("Perform the testing");
    }
    public void CloseBrowser(){
        System.out.println("Closing the browser");
    }
}
class Chrome extends WebDriver {
    public void startBrowser() {
        System.out.println("Starting the Google Chrome");
    }

    public void Test() {
        System.out.println("Perform the testing on Google Chrome");
    }

    public void CloseBrowser() {
        System.out.println("Closing the Google Chrome");
    }
}
class Firebox extends WebDriver {
    public void startBrowser() {
        System.out.println("Starting the Firefox");
    }

    public void Test() {
        System.out.println("Perform the testing on Firebox");
    }

    public void CloseBrowser() {
        System.out.println("Closing the Firebox");
    }
}