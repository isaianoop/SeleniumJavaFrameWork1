package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class GoogleSearchPageObjects {
	
		WebDriver driver=null;
		By text_box_search= By.name("q");
		By button_search=By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']");
	    static By language_link=By.linkText("English");
	   
	public GoogleSearchPageObjects(WebDriver driver) {
	
		this.driver=driver;
	}
	
	
	public void enterTextinSearchBox(String text) {
		driver.findElement(text_box_search).sendKeys(text);
			}
	
	public void clickonSearchBox(WebDriver driver) {
		driver.findElement(button_search).sendKeys(Keys.ENTER);
		
	}


	public static void clickonEnglish(WebDriver driver) {
		driver.findElement(language_link).click();
	} 
	
	
	
}
