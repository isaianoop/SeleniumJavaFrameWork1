package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

@SuppressWarnings("deprecation")
public class ExtentHtmlReportSample {

	private static WebDriver driver=null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ExtentHtmlReporter htmlReporter= new ExtentHtmlReporter("extentReports.html");
		
        // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        ExtentTest test = extent.createTest("Google Search Test","Test description");

        String projectPath=System.getProperty("user.dir");
    	System.out.println("Print the current project path"+projectPath);
    	
    	System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
    	driver=new ChromeDriver();
        test.log(Status.INFO, "starting test case");
        
    	driver.get("https://google.com");
    	test.pass("website is launched succesfully");
    	
    	driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
    	test.pass("Succesfully entered text ");
    	
    	
    	driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
    	test.pass("clicked on enter");
    	test.fail("unable to click on enter");
    	
    	driver.close();
    	driver.quit();
    	test.pass("Closed the browser");
    	test.info("Test got completed");
    	
    	// calling flush writes everything to the log file
        extent.flush();
    	
    	
    	
	}

}
