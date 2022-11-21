package com.syntax.class21;

public class Browser {
    void openBrowser(){
        System.out.println("Opening Browser");
    }
    void navigate(){
        System.out.println("Opening URL");
    }
    void test(){
        System.out.println("Testing the webpage");
    }
    void closeBrowser(){
        System.out.println("Close the browser");
    }
}
class Chrome extends Browser{
    void openBrowser(){
        System.out.println("Opening the browser in less than one second");
    }
    void navigate(){
        System.out.println("Opening URL");
    }
    void test(){
        System.out.println("Testing the webpage");
    }
    void close() {
        System.out.println("Close the browser");
    }
}
class Firefox{
    void openBrowser(){
        System.out.println("Opens browser in less than 2 seconds");
    }
}
