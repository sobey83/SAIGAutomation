package com.suyati.frameworkengine;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelLibrary {

	/**
	 * @param args
	 * @throws Exception 
	 */	
	

		
	public String getExcelData(String sheetName,int rowNum, int cellNum) throws Exception{
		String retVal=null;
		try {
			FileInputStream fis = new FileInputStream("./tests/testscenarios.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s = wb.getSheet(sheetName);
			Row r = s.getRow(rowNum);
			Cell c = r.getCell(cellNum);
			retVal = c.getStringCellValue();
			} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return retVal;
	}
	public int getRowCount(String sheetName) throws Exception{
		int rowCnt=0;
		try {
			FileInputStream fis = new FileInputStream("./tests/testscenarios.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s = wb.getSheet(sheetName);
			rowCnt = s.getLastRowNum();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return rowCnt;
	}
	public void setExcelData(String sheetName, int row, int cell, String data) throws Exception{
		try {
			FileInputStream fis = new FileInputStream("./tests/testscenarios.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s = wb.getSheet(sheetName);
			Row r = s.getRow(row);
			Cell c = r.createCell(cell);
			c.setCellValue(data);
			FileOutputStream fos = new FileOutputStream("./tests/testscenarios.xlsx");
			wb.write(fos);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}




