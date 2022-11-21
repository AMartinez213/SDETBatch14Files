package com.syntax.class28;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class FileDemo1 {
    public static void main(String[] args) throws IOException {

        var path="Data/config.properties";//location of the file
        var fileinputStream=new FileInputStream(path);
        var properties=new Properties();
        properties.load(fileinputStream);
        System.out.println(properties.getProperty("URL"));
        System.out.println(properties.getProperty("userName"));
        System.out.println(properties.getProperty("password"));
        System.out.println(properties.getProperty("browser"));


    }

}
