package utils;

public class Excelutilsdemo {

	public static void main(String[] args) {
		String projectpath=System.getProperty("user.dir");
		Excelutils excel = new Excelutils(projectpath+"/excel/data.xlsx", "Sheet1");
		excel.getRowCount();
		excel.getCellDataString(0, 0);
		excel.getCellDataNumber(1, 1);
		
	}
}
