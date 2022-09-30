package com.ciklum.utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataExcelLibrary {

	public static Object[][] readExcelData(String dataSheetName) throws IOException 
	{
		//String excelPath= "D:\\Exceldata.xls";
		FileInputStream fis= new FileInputStream("D:\\Screenshot\\Exceldata.xlsx");
		 XSSFWorkbook workBook= new XSSFWorkbook(fis);
		XSSFSheet sheet= workBook.getSheetAt(0);
		int numberofRows=sheet.getLastRowNum();
		System.out.println("The number of Rows"+ numberofRows);
		int numberofColums= sheet.getRow(0).getLastCellNum();
		System.out.println("the number of columns:"+numberofColums);
		Object[][] data = new Object[numberofRows][numberofColums];
		
		//loop
		for(int i=1;i<=numberofRows;i++)
		{
			XSSFRow allRows=sheet.getRow(i);
			
			for(int j=0;j<numberofColums;j++)
			{
				XSSFCell allColumns=allRows.getCell(j);
//				
			String value=allColumns.getStringCellValue();
			System.out.println("string value:"+value);
			data[i-1][j]=value;
			}
		}
		workBook.close();
		return data;
	}

}




