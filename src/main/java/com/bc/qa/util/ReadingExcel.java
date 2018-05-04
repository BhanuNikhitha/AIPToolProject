package com.bc.qa.util;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.bc.qa.base.BaseClass;

public class ReadingExcel extends BaseClass {
	
		public FileInputStream fis;
		public static XSSFWorkbook wb;
		public static XSSFCell cell;
		
//		public ReadingExcel(String filepath)
//		{
//				try {
//					fis = new FileInputStream(filepath);
//					wb = new XSSFWorkbook(fis);
//				} catch (Exception e) {
//					System.out.println(e.getMessage());
//				}				
//		}
		
		public static String getdata(int sheetIndex, int rowNum, int colNum)
		{
				cell = wb.getSheetAt(sheetIndex).getRow(rowNum).getCell(colNum);
				String data = "";
				
				if(cell.getCellTypeEnum() == CellType.NUMERIC)
				{
						int cellData = (int) cell.getNumericCellValue();
						data =  new Integer(cellData).toString();
				}
				if(cell.getCellTypeEnum() == CellType.STRING)
				{
						data = cell.getStringCellValue();
				}
				if(DateUtil.isCellDateFormatted(cell))
				{
						SimpleDateFormat df = new SimpleDateFormat(data);
						Date tempData = cell.getDateCellValue();
						data = df.format(tempData);					
				}
				return data;			
		}
		
		public static int rowCount(int sheetIndex)
		{
				return wb.getSheetAt(sheetIndex).getLastRowNum();
		}
		
		public static int colCount(int sheetIndex, int rowNum)
		{
				return wb.getSheetAt(sheetIndex).getRow(rowNum).getLastCellNum();
		}
}
