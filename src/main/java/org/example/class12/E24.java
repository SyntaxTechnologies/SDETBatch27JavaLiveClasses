package org.example.class12;

import org.example.utils.ConfigReader;

import java.io.IOException;

public class E24 {
    static void main() throws IOException {

        String value= ConfigReader.readConfigFile("browser");
        System.out.println(value);
    }
}
