package com.Automation.FrameworkSetup;

import java.io.FileInputStream;
import java.io.File;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheet_Setup {
	
	XSSFWorkbook workbook;
	XSSFSheet sheet;

	public void setup() throws IOException
	{	
	File src = new File("C:\\Users\\ranjara2\\Downloads\\Test.xlsx");
	FileInputStream fs = new FileInputStream(src);
	 workbook = new XSSFWorkbook(fs);
	 sheet = workbook.getSheetAt(0);
	}
	
	public String getFirstName(int row) throws IOException
	{
		setup();
		String FirstName = sheet.getRow(row).getCell(0).getStringCellValue();
		return FirstName;
	}
	
	public String getSurName(int row) throws IOException
	{
		setup();
		String FirstName = sheet.getRow(row).getCell(1).getStringCellValue();
		return FirstName;
	}
	
	public int getMobile(int row) throws IOException
	{
		setup();
		double Mobiles = sheet.getRow(row).getCell(2).getNumericCellValue();
		int Mobile = Double.valueOf(Mobiles).intValue();
		return Mobile;
	}
	
	public String getNewPassword(int row) throws IOException
	{
		setup();
		String FirstName = sheet.getRow(row).getCell(3).getStringCellValue();
		return FirstName;
	}
	
	public String getGender(int row) throws IOException
	{
		setup();
		String FirstName = sheet.getRow(row).getCell(4).getStringCellValue();
		return FirstName;
	}
	
	
	
 

}
