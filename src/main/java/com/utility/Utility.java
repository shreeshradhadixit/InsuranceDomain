package com.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

import com.Base.BaseClass;

public class Utility extends BaseClass {

	public static void implicitWeight()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	public Sheet getSheet(String SheetName) throws EncryptedDocumentException, IOException {
		
		FileInputStream fileinputstream=new FileInputStream(ProjectPath+"src\\test\\resources\\Data\\OrangeHr.xlsx");
		Sheet sh = (Sheet) WorkbookFactory.create(fileinputstream).getSheet(SheetName);
		return sh;
		}
     public Object getSingleData(int rowNum ,int cellNum, Sheet sh)
     {
   
    	// if(((org.apache.poi.ss.usermodel.Sheet) sh).getRow(rowNum).getCell(cellNum).getStringCellValue());
    	 if(((Cell) ((org.apache.poi.ss.usermodel.Sheet) sh).getRow(rowNum))).getCellType().toString().equalsIgnoreCase("String")) {
    		return ((org.apache.poi.ss.usermodel.Sheet) sh).getRow(rowNum).getCell(cellNum).getStringCellValue();
    		
    	 }
    	 else {
     		return ((org.apache.poi.ss.usermodel.Sheet) sh).getRow(rowNum).getCell(cellNum).getNumericCellValue();

    	 }
     }
     public HashMap<String, String> getAllExcelData(Sheet sh)
     {
    	 HashMap<String,String> hm=new HashMap<>();
    	 for(int i=0;i<((Object) sh).getLastrRowNum();i++) {
    		 int cellNum=((org.apache.poi.ss.usermodel.Sheet) sh).getRow(i).getLastCellNum();
    		 for(int j=0;j<cellNum;j++) {
    			// String data=((org.apache.poi.ss.usermodel.Sheet) sh).getRow(i).getCell(j).getStringCellValue();
    			 //String value=((org.apache.poi.ss.usermodel.Sheet) sh).getRow(i).getCell(j).getStringCellValue();
                 hm.put(((org.apache.poi.ss.usermodel.Sheet) sh).getRow(i).getCell(j).getStringCellValue(), ((org.apache.poi.ss.usermodel.Sheet) sh).getRow(i).getCell(j).getStringCellValue());
    		 }

    		 }
    		 for(Map.Entry<String, String>map:hm.entrySet()) {
    			 System.out.println(map.getKey()+ "" + map.getValue());
    	 }
    		 
    		 return hm;
    	 
     }
	//public Sheet getSheet(String string) {
		// TODO Auto-generated method stub
		


	//public Sheet getSheet(String sheetName) {
		// TODO Auto-generated method stub
	}
