package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {

	WebDriver driver=null;
	
public static void main(String[] args) throws InterruptedException {
	googleSearchTest();
	}

public static void googleSearchTest() throws InterruptedException {
	

	String projectPath=System.getProperty("user.dir");
	System.out.println("Print the current project path"+projectPath);
	
	System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	
	GoogleSearchPageObjects gspobj= new GoogleSearchPageObjects(driver);
	driver.get("https://www.google.com/");
	//GoogleSearchPageObjects.clickonEnglish(driver);
	gspobj.enterTextinSearchBox("Automation Step By Step");
	gspobj.clickonSearchBox(driver);
}


}
