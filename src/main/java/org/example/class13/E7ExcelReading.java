package org.example.class13;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class E7ExcelReading {
    static void main() throws IOException {

        String path="Files/Employees.xlsx";
        FileInputStream fis=new FileInputStream(path);
        XSSFWorkbook Employees=new XSSFWorkbook(fis);
        Sheet sheet1=Employees.getSheet("Sheet1");
        Row row0=sheet1.getRow(0);
        for (int i = 0; i < 4; i++) {
            System.out.print(row0.getCell(i)+" ");
        }
        System.out.println();

        Row row1=sheet1.getRow(1);
        for (int i = 0; i < 4; i++) {
            System.out.print(row1.getCell(i)+" ");
        }
        System.out.println();


        Row row2=sheet1.getRow(2);
        for (int i = 0; i < 4; i++) {
            System.out.print(row2.getCell(i)+" ");
        }
        System.out.println();





    }
}
