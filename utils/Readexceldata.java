package com.utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readexceldata {
	public static String[] [] getData(String excelFileName) throws IOException {
		XSSFWorkbook book = new XSSFWorkbook("C:\\Users\\Lenovo\\Downloads\\data.xlsx");
		XSSFSheet sheet = book.getSheetAt(0);
		int rowCount= sheet.getLastRowNum();
		short colCount = sheet.getRow(0).getLastCellNum();
		System.out.println(rowCount);
		System.out.println( colCount);
		String[][] data= new String [rowCount][colCount];
		
		DataFormatter df = new DataFormatter();
		for(int i=1;i<=rowCount;i++) {	
			XSSFRow eachRow= sheet.getRow(i);
			for(int j=0;j<colCount;j++)
			{
				XSSFCell eachCell = eachRow.getCell(j);
				//data out of the cell
				data[i-1][j]= df.formatCellValue(eachCell);//balancing by -1
						
			}
			
			
		}
		book.close();
		return data;
	}

}
