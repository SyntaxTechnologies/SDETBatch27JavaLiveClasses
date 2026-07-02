package org.example.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class ConfigReader {

    public static String readConfigFile(String fileName) throws IOException {
        FileInputStream fis = new FileInputStream(Constants.CONFIG_PATH);
        Properties p = new Properties();
        p.load(fis);
        return p.getProperty(fileName);
    }
}
