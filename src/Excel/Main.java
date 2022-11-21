package Excel;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {

        public static void main(String[] args) throws IOException {

            String path="C:\\Users\\AMart\\Downloads\\Compressed\\Test.xlsx";
            FileInputStream fileInputStream=new FileInputStream(path);
            XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
            Sheet sheet=xssfWorkbook.getSheet("Sheet1");
            Row row=sheet.getRow(0);
            System.out.println(row.getCell(0));
            System.out.println(row.getCell(1));
            System.out.println(row.getCell(4));

            row=sheet.getRow(1);
            System.out.println(row.getCell(0));
            System.out.println(row.getCell(1));

            row=sheet.getRow(4);
            System.out.println(row.getCell(2));



        }
    }

