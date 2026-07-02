package org.example.class12;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E22 {
    static void main() throws IOException {

        String path = "Files/Employees.xlsx";
        FileInputStream fis = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fis);
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");
        Row row=sheet.getRow(1);
        System.out.println(row.getCell(0)+" "+row.getCell(1)+" "+row.getCell(2)+" "+row.getCell(3));
        Row row2=sheet.getRow(2);
        System.out.println(row2.getCell(0)+" "+row2.getCell(1)+" "+row2.getCell(2)+" "+row2.getCell(3));
        Row  row3=sheet.getRow(3);
        System.out.println(row3.getCell(0)+" "+row3.getCell(1)+" "+row3.getCell(2)+" "+row3.getCell(3));




    }
}
