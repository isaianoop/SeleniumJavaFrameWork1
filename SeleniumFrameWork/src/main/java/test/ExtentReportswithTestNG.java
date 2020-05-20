package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportswithTestNG {
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	private static WebDriver driver=null;
	
    @BeforeSuite
	public void setUp() {

		htmlReporter= new ExtentHtmlReporter("extent1.html");

		// create ExtentReports and attach reporter(s)
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		}
    
    @BeforeTest
	public void beforeTest() {
		String projectPath=System.getProperty("user.dir");
		System.out.println("Print the current project path"+projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		
		
	}
	
	@Test
	public void test1() throws Exception {
		ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
			driver.get("https://google.com");
	        test.pass("navigated to browser");
			test.log(Status.INFO, "This step shows usage of log(status, details)");

	        test.info("This step shows usage of info(details)");
	        
	        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
	        
	         test.addScreenCaptureFromPath("screenshot.png");
			}

	@Test
	public void test2() throws Exception {
		ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
			test.pass("navigated to browser");
			test.log(Status.INFO, "This step shows usage of log(status, details)");

	        test.info("This step shows usage of info(details)");
	        
	        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
	        
	         test.addScreenCaptureFromPath("screenshot.png");
			}

	
	
	
	@AfterTest
	public void TearDownTest() {

		System.out.println("Test has been succesfully executed");
		//close the browser
		driver.close();
		driver.quit();
		
	}
	

	
	@AfterSuite
	public void tearDown() {
	       extent.flush();

	}
}
