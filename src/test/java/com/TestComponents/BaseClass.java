package com.TestComponents;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.PageObject.LandingPage;



public class BaseClass {

	public WebDriver driver;
	public LandingPage landingPage;
	public WebDriver initializedriver() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\Global.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		if (browserName.equalsIgnoreCase("chrome"))
		{
			driver = new FirefoxDriver();;
		
		}
		else if (browserName.equalsIgnoreCase("firefox"))
		{
			driver = new EdgeDriver();;
			
		}
		else if (browserName.equalsIgnoreCase("edge"))
		{
			driver = new ChromeDriver();;
			
		}
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
		}
	
		public LandingPage launchApplication() throws IOException {
		driver= initializedriver();
		landingPage.goTo();
		return landingPage;
			
	}
	
	
	public void tearDown()
	{
		driver.quit();
	}
}
