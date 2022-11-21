package com.syntax.class29;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;

public class ReadingExcelFileDemo1 {
    public static void main(String[] args) throws IOException {

        //Location of the file on your HardDrive where file is stored
        var path="Data/Test1.xlsx";

        //Reads the data from HardDrive brings it to RAM in the raw form 1010101010
        //In simple words we can say computer has navigated to that file
        FileInputStream fileInputStream=new FileInputStream(path);

        //This class convert the raw bytes to excel format or in simple words it is that special software
        //that helps us read and write data to an Excel file
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);

        Sheet sheet=xssfWorkbook.getSheet("Sheet1");
        int noOfRow=sheet.getPhysicalNumberOfRows();

        Row headerRow=sheet.getRow(0);
        LinkedHashMap<String,String> rowMap=new LinkedHashMap();
        for (int i=1; i<noOfRow;i++) {
            Row dataRow=sheet.getRow(i);//get a row from sheet one by one through loop

            int noOfCell=dataRow.getPhysicalNumberOfCells();
            for (int cellNo = 0; cellNo < noOfCell; cellNo++) {

                var key=headerRow.getCell(cellNo).toString();
                var value=dataRow.getCell(cellNo).toString();

                rowMap.put(key,value);

            }

            System.out.println(rowMap);


        }





    }
}
