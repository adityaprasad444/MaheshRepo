package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * ExcelReader.java - It is mainly used to read excel data
 * @author Nukala Mahesh
 * @version 1.7
 * Date - 12-19-2017	
 */

public class ExcelReader {
	
	XSSFWorkbook wb;
	XSSFSheet sh;
	
	/**
	 * ExcelReader - This constructor is used to get the excel sheet present in the path
	 * @param ExcelPath
	 * @author Nukala Mahesh
	 * Date - 12-19-2017	
	 */
	
	public ExcelReader(String Excelpath){		
		
		try {
			File src=new File(Excelpath);		
			FileInputStream FIS= new FileInputStream(src);
			wb= new XSSFWorkbook(FIS);
			
			} catch (Exception e) {
			System.out.println("Exception is: "+ e.getMessage());
		
								}	
					
		}
	
	/**
	 * This method is used to get the data present in given location
	 * @param SheetNo, row, column
	 * @return celldata
	 * @author Nukala Mahesh
	 * Date - 12-19-2017	
	 */
	
	public String getData(int SheetNo, int row, int column){
		
		sh=wb.getSheetAt(SheetNo);
		String data=sh.getRow(row).getCell(column).getStringCellValue();
		return data;
		
	}
	
	/**
	 * This method is used to get the row count for the sheet
	 * @param SheetNo
	 * @return rowsCount
	 * @author Nukala Mahesh
	 * Date - 12-19-2017	
	 */
	
	public int getRowCount(int SheetNo){
		int row=wb.getSheetAt(SheetNo).getLastRowNum();		
		row=row+1;
		return row;
		
	}
	
	/**
	 * This method is used to get the row instance of the sheet
	 * @param SheetNo, row
	 * @return rowData
	 * @author Nukala Mahesh
	 * Date - 12-19-2017	
	 */
	
	public XSSFRow getRow(int sheetNo, int row){
		int rowcount=wb.getSheetAt(sheetNo).getLastRowNum();		
		rowcount=rowcount+1;
		XSSFRow rowData=wb.getSheetAt(sheetNo).getRow(row);
		
		
		return rowData;
	}
	
	/**
	 * This method is used to get the row count for the sheet using sheetName
	 * @param SheetNo
	 * @return rowsCount
	 * @author Nukala Mahesh
	 * Date - 12-19-2017	
	 */
	
	public int getRowCountUsingSheetName(String SheetName){
		int row=wb.getSheet(SheetName).getLastRowNum();	
		row=row+1;
		return row;
	}
	
	/**
	 * This method is used to write the data into excel sheet
	 * @param SheetIndex, row, column, data, ExcelPath
	 * @author Nukala Mahesh
	 * Date - 12-19-2017	
	 */
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
