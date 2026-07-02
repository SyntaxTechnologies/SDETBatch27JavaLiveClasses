package org.example.utils;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelReader {

    public static List<Map<String,String>> getExcelData() throws IOException {

        FileInputStream fis = new FileInputStream(Constants.EXCEL_FILE_PATH);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fis);
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");

        List<Map<String,String>> excelDataList=new ArrayList<>();
        Row HeaderRow=sheet.getRow(0);

        for(int rowNo=1;rowNo<sheet.getPhysicalNumberOfRows();rowNo++){
            Row row=sheet.getRow(rowNo);

            Map<String,String> rowMap=new LinkedHashMap<>();
            for (int cellNo = 0; cellNo < row.getPhysicalNumberOfCells(); cellNo++) {
                String key=HeaderRow.getCell(cellNo).toString();
                String value=row.getCell(cellNo).toString();
                rowMap.put(key,value);
            }
            excelDataList.add(rowMap);
        }
        return excelDataList;
    }

}
