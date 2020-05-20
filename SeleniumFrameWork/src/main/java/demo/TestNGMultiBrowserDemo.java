package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultiBrowserDemo {
	WebDriver driver=null;
	String projectPath=System.getProperty("user.dir");
	
	@Parameters("browserName")
	@BeforeTest
		public void setUp(String browserName) {
		System.out.println("Browser name is :"+browserName);
		if(browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
			driver=new ChromeDriver();
		}

		else if(browserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\firefoxdriver\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
	
	
	}
	
	
	
	@Test
	public void test() throws InterruptedException {
		driver.get("https://google.com");
		Thread.sleep(4000);	}
	
	
	@AfterTest
	public void tearDown() {
		driver.close();
		System.out.println("Test Completed Successfully");
	}
	

}
