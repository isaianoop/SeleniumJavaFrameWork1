package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.GoogleSearchPageObjects;

public class TestNGdemo2 {

	static WebDriver driver=null;
	
@BeforeTest
public static void initialsationMethod() {

	String projectPath=System.getProperty("user.dir");
	System.out.println("Print the current project path"+projectPath);
	
	System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
	driver=new ChromeDriver();
	
} 


@Test
public static void googleSearchTest2() throws InterruptedException {
	GoogleSearchPageObjects gspobj= new GoogleSearchPageObjects(driver);
	driver.get("https://www.google.com/");
	//GoogleSearchPageObjects.clickonEnglish(driver);
	gspobj.enterTextinSearchBox("Automation Step By Step");
	gspobj.clickonSearchBox(driver);
}

@Test
public static void googleSearchTest3() throws InterruptedException {
	GoogleSearchPageObjects gspobj= new GoogleSearchPageObjects(driver);
	driver.get("https://www.google.com/");
	//GoogleSearchPageObjects.clickonEnglish(driver);
	gspobj.enterTextinSearchBox("Automation Step By Step");
	gspobj.clickonSearchBox(driver);
}





@AfterTest
public void TearDownTest() {

	System.out.println("Test has been succesfully executed");
	//close the browser
	driver.close();
	driver.quit();
	
}


}
