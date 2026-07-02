package org.example.class12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class E21 {
    static void main() throws IOException {

        String path = "Files/Configuration.properties";
        FileInputStream fis = new FileInputStream(path);
        Properties p = new Properties();
        p.load(fis);
        System.out.println(p.getProperty("dbURL"));
        System.out.println(p.getProperty("userName"));

    }
}
