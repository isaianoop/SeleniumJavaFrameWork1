import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {
	public static void main(String[] args) throws InterruptedException {
		
		String projectPath=System.getProperty("user.dir");
		System.out.println("Print the current project path"+projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("abcd");
		java.util.List<WebElement> listofelements=driver.findElements(By.xpath("//input"));
		int countofelements=listofelements.size();
		System.out.println("Count Of Elements:"+countofelements);
		Thread.sleep(3000);
		driver.close();
	}

}
