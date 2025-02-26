package Utilities;

import java.io.*;
import java.util.Properties;

public class readProp  {

    public static File rootPath = new File(System.getProperty("user.dir"));

    static FileInputStream fileInput = null;


    public static String readValuesFromConfigFile(String Key) {

        File file = new File(rootPath, "config.properties");

        try {
            fileInput = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Properties prop = new Properties();

        // load properties file
        try {
            prop.load(fileInput);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return prop.getProperty(Key);
    }


}
