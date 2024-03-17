package com.TestComponents;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.PageObject.LandingPage;

import io.github.bonigarcia.wdm.WebDriverManager;

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
			driver = WebDriverManager.chromedriver().create();
		
		}
		else if (browserName.equalsIgnoreCase("firefox"))
		{
			driver = WebDriverManager.firefoxdriver().create();
			
		}
		else if (browserName.equalsIgnoreCase("edge"))
		{
			driver = WebDriverManager.edgedriver().create();
			
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
