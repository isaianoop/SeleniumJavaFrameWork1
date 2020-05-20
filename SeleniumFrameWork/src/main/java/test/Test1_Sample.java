package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPage;


public class Test1_Sample {
	
	public static void main(String[] args) {
		
		
		GoogleSearch();
	}

	public static void GoogleSearch()
	{
		
		String projectPath=System.getProperty("user.dir");
		System.out.println("Print the current project path"+projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*
		 * demo class
		 */
		driver.get("https://www.google.com/");
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation Step by Step");
		
		GoogleSearchPage.clickonEnglish(driver);
		GoogleSearchPage.textbox_search(driver).sendKeys("Automation Step by Step");
		GoogleSearchPage.button_earch(driver);
		
		
		
		//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']
		
		//CLick on Search Button
		//driver.findElement(By.xpath("//input[@name='btnK']"));
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		System.out.println("Test has been succesfully executed");
		//close the browser
		driver.close();
		
		
		
		
	}
	
}
