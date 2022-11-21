package com.syntax.class28;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDemo2 {
    public static void main(String[] args) throws IOException {

        var path="Data/Test1.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");
        var noOfRows=sheet.getPhysicalNumberOfRows();//Returns the number of rows within the document that contains data
        //System.out.println(noOfRows);

        for(var i=0;i<noOfRows;i++){
            Row row=sheet.getRow(i);
            var noOfCells=row.getPhysicalNumberOfCells();//Returns the number of cells within the document that contains data

            for (var j = 0; j < noOfCells; j++) {
                Cell cell=row.getCell(j);
                System.out.print(cell+" ");

            }
            System.out.println();
        }


    }
}
