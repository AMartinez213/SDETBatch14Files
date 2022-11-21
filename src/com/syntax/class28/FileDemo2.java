package com.syntax.class28;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class FileDemo2 {
    public static void main(String[] args) throws IOException {

        var path="Data/Test1.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");
        Row row=sheet.getRow(7);
//        Column col=sheet.getLeftCol(0);
        System.out.print(row.getCell(0)+" ");
        System.out.print(row.getCell(1)+" ");
        System.out.print(row.getCell(2)+" ");
        System.out.print(row.getCell(3)+" ");

        System.out.println();

        Row row1=sheet.getRow(1);
        System.out.print(row1.getCell(0)+" ");
        System.out.print(row1.getCell(1)+" ");
        System.out.print(row1.getCell(2)+" ");
        System.out.print(row1.getCell(3)+" ");


    }
}
