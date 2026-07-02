package org.example.class13;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class E6ExcelReading {
    static void main() throws IOException {

        String path="Files/Employees.xlsx";
        FileInputStream fis=new FileInputStream(path);
        XSSFWorkbook Employees=new XSSFWorkbook(fis);
        Sheet sheet1=Employees.getSheet("Sheet1");
        Row row0=sheet1.getRow(0);
        System.out.println(row0.getCell(0)+" "+row0.getCell(1)+" "+row0.getCell(2)+" "+row0.getCell(3)+" "+row0.getCell(4));
        Row row1=sheet1.getRow(1);
        System.out.println(row1.getCell(0)+" "+row1.getCell(1)+" "+row1.getCell(2)+" "+row1.getCell(3)+" "+row1.getCell(4));





    }
}
