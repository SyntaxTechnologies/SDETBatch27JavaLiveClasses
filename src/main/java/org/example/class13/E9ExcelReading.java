package org.example.class13;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class E9ExcelReading {
    static void main() throws IOException {

        String path="Files/Employees.xlsx";
        FileInputStream fis=new FileInputStream(path);
        XSSFWorkbook Employees=new XSSFWorkbook(fis);
        Sheet sheet1=Employees.getSheet("Sheet1");

        ArrayList<LinkedHashMap<String,String>> entireExcelData=new ArrayList<>();
        Row headerRow=sheet1.getRow(0);

        for(int rowNo=1;rowNo<sheet1.getPhysicalNumberOfRows();rowNo++){
            Row row=sheet1.getRow(rowNo);
            LinkedHashMap<String,String> rowMap=new LinkedHashMap<>();
            for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
                String key=headerRow.getCell(i).toString();
                String value=row.getCell(i).toString();
                rowMap.put(key,value);

            }

                entireExcelData.add(rowMap);

        }

        System.out.println(entireExcelData);

    }
}
