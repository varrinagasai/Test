package core_Swagger;

import org.testng.annotations.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swagger {
	
	public String swagger_url ="http://api-docs.pareteum.cloud:8080/acn/qa/";
	private static WebDriver driver;
	public JavascriptExecutor js;
	private static WebElement wb;
	
	public static WebDriver getDriver() 
	{
		return driver;
	}
	
	public static WebElement getElement() 
	{
		return wb;
	}
	@BeforeSuite
	public void loadDriver()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nagasai\\Desktop\\Automation\\JARS\\chromedriver.exe");
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		driver.get(swagger_url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String swagger_Title = driver.getTitle();
		System.out.println(swagger_Title);
		js.executeScript("window.scrollBy(0,1000)");
		
		wb = driver.findElement(By.xpath("//*[@class='block col-12 block-desktop col-12-desktop']/div"));	
		List<WebElement> list= wb.findElements(By.xpath("//*[@class='opblock-tag-section is-open']"));
		int rc = list.size();
		System.out.println("CoreAPI Controllers:" +rc);
	}
	@AfterSuite
	public void closeBrowser()
		{
		driver.close();
		}
	}