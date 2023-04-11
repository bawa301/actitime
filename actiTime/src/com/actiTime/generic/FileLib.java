package com.actiTime.generic;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib 
{
	
	
	public String getPropertData(String key) throws Exception
	{
		FileInputStream fis = new FileInputStream("./data/credentials.property");
		Properties p= new Properties();
		p.load(fis);
		String credtls = p.getProperty(key);
		return credtls;
	}
	
	
	public String getExcelData(String sheet, int row, int cell) throws Throwable
	{
		FileInputStream fis = new FileInputStream("./data/credentials.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String value = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
	
	
}
