package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils {

	static String projectpath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public Excelutils(String excelPath, String sheetName) {
		try{

		 workbook= new XSSFWorkbook(excelPath);
		 sheet=workbook.getSheet(sheetName);	
		}	
		catch(Exception exp) {

			exp.printStackTrace();
		}

	}

	public static void main(String[] args) {
		getRowCount();
		getCellDataString(0,0);
		getCellDataNumber(1,1);
	}


	public static int getRowCount() {
		int rowCount=0;
		try {
			
			rowCount=sheet.getPhysicalNumberOfRows();
			//System.out.println("Row Count is: "+rowCount);
		}

		catch(Exception exp) {
			System.out.println(exp.getStackTrace());
			System.out.println(exp.getMessage());
			exp.printStackTrace();

		}
		return rowCount;
	}

	
	public static int getColumnCount() {
		
		int columnCount=0;
		try {
			
			 columnCount=sheet.getRow(0).getPhysicalNumberOfCells();
			//System.out.println("Row Count is: "+columnCount);
		}

		catch(Exception exp) {
			System.out.println(exp.getStackTrace());
			System.out.println(exp.getMessage());
			exp.printStackTrace();

		}
		return columnCount;
	}

	
	
	
	
	public static String getCellDataString(int rowNum, int colNum) {
		
		String celldata=null;
		try {
			celldata=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println("Cell Data"+celldata);
		}

		catch(Exception exp) {
			System.out.println(exp.getStackTrace());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
			
		}
return celldata;
	}
	
	

	public static void getCellDataNumber(int rowNum,int colNum) {
		try {

			double celldata=sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println(celldata);
		}

		catch(Exception exp) {

		}

	}



}
