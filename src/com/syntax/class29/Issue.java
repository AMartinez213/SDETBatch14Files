package com.syntax.class29;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class Issue {

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

            var noOfRows=sheet.getPhysicalNumberOfRows();
            for (int i = 0; i < noOfRows; i++) {
                Row row=sheet.getRow(i);
                System.out.println(row);//get a row from sheet one by one through loop
                var noOfCells=row.getPhysicalNumberOfCells();
                for (int j = 0; j < noOfCells; j++) {
                    System.out.print(row.getCell(j)+" ");
                }
            }

        }
    }

