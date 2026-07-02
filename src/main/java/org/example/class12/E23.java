package org.example.class12;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class E23 {
    static void main() throws IOException {

        String path = "Files/Employees.xlsx";
        FileInputStream fis = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fis);
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");

        for(int rowNo=0;rowNo<sheet.getPhysicalNumberOfRows();rowNo++){
            Row row=sheet.getRow(rowNo);

            for (int cellNo = 0; cellNo < row.getPhysicalNumberOfCells(); cellNo++) {
                System.out.print(row.getCell(cellNo)+" ");
            }
            System.out.println();
        }





    }
}
