package org.example.class13;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E5ExcelReading {
    static void main() throws IOException {

        String path="Files/Employees.xlsx";
        FileInputStream fis=new FileInputStream(path);
        XSSFWorkbook Employees=new XSSFWorkbook(fis);
        Sheet sheet1=Employees.getSheet("Sheet1");
        Row row=sheet1.getRow(2);
        Cell cell=row.getCell(4);
        System.out.println(cell.toString());



    }
}
