package org.example.class13;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class E8ExcelReading {
    static void main() throws IOException {

        String path="Files/Employees.xlsx";
        FileInputStream fis=new FileInputStream(path);
        XSSFWorkbook Employees=new XSSFWorkbook(fis);
        Sheet sheet1=Employees.getSheet("Sheet1");

        for(int rowNo=0;rowNo<sheet1.getPhysicalNumberOfRows();rowNo++){
            Row row=sheet1.getRow(rowNo);
            for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
                System.out.print(row.getCell(i)+" ");
            }
            System.out.println();
        }

    }
}
