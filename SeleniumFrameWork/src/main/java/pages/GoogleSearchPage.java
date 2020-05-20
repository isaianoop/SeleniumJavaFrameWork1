package pages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {


	private static WebElement element=null;
	
	
	
	public static WebElement textbox_search(WebDriver driver) {
		
	WebElement element=driver.findElement(By.name("q"));
	
	return element;
		
	}
	
	
	public static WebElement button_earch(WebDriver driver) {
		
		WebElement element=driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']"));
		return element;
		}
	
	
	public static void clickonEnglish(WebDriver driver) {
		driver.findElement(By.linkText("English")).click();
		
	} 
	
	   
}
