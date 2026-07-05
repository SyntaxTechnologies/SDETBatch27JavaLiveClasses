package org.example.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class ConfigReader {

    public static String readConfigFile(String key) {


        Properties p = new Properties();
        try(FileInputStream fis = new FileInputStream(Constants.CONFIG_PATH)) {
            p.load(fis);
        } catch (IOException io) {
            io.printStackTrace();
        }
        return p.getProperty(key);
    }
}
