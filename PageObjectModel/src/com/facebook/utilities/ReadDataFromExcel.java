package com.facebook.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {
	
	public static boolean isTestRunable(String TCName) throws IOException
	{
		FileInputStream fs = new FileInputStream("D:\\Bipin\\14th April Batch\\PageObjectModel\\src\\com\\facebook\\Data\\TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet sh = wb.getSheet("TestCaseNames");
		//check if the test case exists
		// if it exist then check run mode
		
		//total rows
		int totalRows=sh.getPhysicalNumberOfRows();
		
		
		for(int i =1;i<totalRows;i++)
		{
			if(sh.getRow(i).getCell(0).getStringCellValue().equals(TCName))
			{
				if(sh.getRow(i).getCell(1).getStringCellValue().equals("Y"))
						{
					return true;
						}
			}
		}
		return false;
	}

	
public static Object[][] readTCData(String TCName) throws IOException
{
	FileInputStream fs = new FileInputStream("D:\\Bipin\\14th April Batch\\PageObjectModel\\src\\com\\facebook\\Data\\TestData.xlsx");
	XSSFWorkbook wb = new XSSFWorkbook(fs);
	XSSFSheet sh = wb.getSheet(TCName);
	
	//read TC data & populate in a two D Object Array
	int totalRows=sh.getPhysicalNumberOfRows();
	int totalColumns=sh.getRow(0).getPhysicalNumberOfCells();
	
	//int arr[][] = new int[rows][columns];
	Object arr[][]= new Object[totalRows][totalColumns];
	for(int i=0;i<totalRows;i++)//rows
	{
		for(int j=0;j<totalColumns;j++)//columns
		{
			arr[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
		}
	}
	return arr;
}
}





















