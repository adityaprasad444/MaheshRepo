package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriter {

	XSSFWorkbook wb;
	XSSFSheet sh;
	
	public ExcelWriter(String ExcelPath){
		try {
			File src=new File(ExcelPath);		
			FileInputStream FIS= new FileInputStream(src);
			wb= new XSSFWorkbook(FIS);
			
			} catch (Exception e) {
			System.out.println("Exception is: "+ e.getMessage());
		
								}	
		
			}
	public void writeData(int SheetIndex, int row, int column, String data, String ExcelPath){
		XSSFSheet sh= wb.getSheetAt(SheetIndex);
		Cell cell= null;
		XSSFRow sheetrow=sh.getRow(row);
		if(sheetrow==null){
			sheetrow=sh.createRow(row);
		}
		cell=sheetrow.createCell(column);
		if(cell==null){
			cell=sheetrow.createCell(column);
			   		}
		cell.setCellValue(data);
		try{
			FileOutputStream FOS= new FileOutputStream(new File(ExcelPath));
			wb.write(FOS);
			FOS.close();
		}
		catch(Exception e){
			System.out.println("Exception is: "+ e.getMessage());
					}
	}
}
