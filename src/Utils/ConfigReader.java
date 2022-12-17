package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static Properties read (String path) {

        var properties = new Properties(); // that special software which helps us read data from that file
        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream(path); //it helps us Navigate to the file
            properties = new Properties(); // that special software which helps us read data from that file
            properties.load(fileInputStream); //loads all the data from the file inside(Memory)
        } catch (FileNotFoundException e) {
            //System.out.println("Please check your file path"); use this for normal humans no technical background
            e.printStackTrace();//when programmers will use this code
        } catch (IOException e) {
            //System.out.println("Please check your harddrive");
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return properties;
    }
}