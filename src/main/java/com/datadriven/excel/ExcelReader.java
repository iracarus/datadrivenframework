package com.datadriven.excel;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class ExcelReader {
    private static final String FILE_NAME = System.getProperty("user.dir") + "/src/main/resources/InputData.xlsx";

    private Iterator<Sheet> getAllSheetsData()
    {
        FileInputStream excelFile;
        XSSFWorkbook wb = null;
        boolean sheetFound = false;
        try {
            excelFile = new FileInputStream(new File(FILE_NAME));
            wb = new XSSFWorkbook(excelFile);
        } catch (
                IOException e) {
            e.printStackTrace();
        }
//        for(Iterator<Sheet> sheetIterator = wb.sheetIterator(); sheetIterator.hasNext(); )
//        {
//            Sheet currentSheet = sheetIterator.next();
//                sheetFound = true;
//                for( int i = 0; i < currentSheet.getLastRowNum(); i++)
//                {
//                    Row currentRow = currentSheet.getRow(i);
//                    for(int j = 0; j < currentRow.getLastCellNum(); j++ )
//                    {
//                        Cell currentCell = currentRow.getCell(j);
//
//                        DataFormatter df = new DataFormatter();
//                        System.out.print(df.formatCellValue(currentCell));
//                        System.out.print("\t");
//                    }
//                    System.out.println();
//                }
//                System.out.println("\n");
//            }
//
//            if(!sheetFound)
//                System.out.println("No sheet found.");
            return wb.sheetIterator();
    }

    public void getAllRowsData(String sheetName)
    {
        Iterator<Sheet> allSheets = getAllSheetsData();
        while(allSheets.hasNext())
        {
            Sheet currentSheet = allSheets.next();
            if(currentSheet.getSheetName().equalsIgnoreCase(sheetName))
            {

            }
        }
    }
    public static String getCellData(String sheetName, int row, int column) {
    }
}
