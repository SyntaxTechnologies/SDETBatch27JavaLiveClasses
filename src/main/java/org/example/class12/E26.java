package org.example.class12;

import org.example.utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class E26 {
    static void main() throws IOException {


        List<Map<String,String>> list= ExcelReader.getExcelData();
        System.out.println(list.get(0));
        System.out.println(list.get(0).get("First Name"));


    }
}
