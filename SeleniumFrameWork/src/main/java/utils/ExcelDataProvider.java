package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider{
	
	static WebDriver driver=null;
	
	@BeforeTest
	public static void initialsationMethod() {

		String projectPath=System.getProperty("user.dir");
		System.out.println("Print the current project path"+projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		
	} 

	
	
	@Test(dataProvider="test1data")	
public void test1(String username, String password ) throws InterruptedException {
	System.out.println(username+"||"+password);
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.id("txtUsername")).sendKeys(username);
	driver.findElement(By.id("txtPassword")).sendKeys(password);
	//driver.findElement(By.id("btnLogin")).click();
	Thread.sleep(5000);
}	
	
@DataProvider(name="test1data")	
public Object[][] getData() {
	String excelPath= "C:\\Users\\Anoop\\Desktop\\Automation\\SeleniumFrameWork\\excel\\data.xlsx";
	Object data[][]=testData(excelPath, "sheet1");
	return data;
	
}	
	
	
public Object[][] testData(String excelPath, String sheetName) {
	
	Excelutils excel= new Excelutils(excelPath, sheetName);
	int rowCount=excel.getRowCount();
	int colCount=excel.getColumnCount();
	Object data[][]=new Object[rowCount-1][colCount];
	for(int i=1;i<rowCount;i++) {
		for(int j=0;j<colCount;j++) {
			String cellData=excel.getCellDataString(i, j);
			//System.out.println(cellData +" || ");
			data[i-1][j]=cellData;
		}
		System.out.println();
	}
return data;
}


}
