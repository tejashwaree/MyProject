package com.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AbstractComponents.AbstarctComponent;

public class LandingPage extends AbstarctComponent{
	public WebDriver driver;

	
	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	public void loginApplication(String email, String pasword) throws InterruptedException {
		 	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(email);
			driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys(pasword);
			driver.findElement(By.xpath("(//*[@data-testid='login-button']/span)[1]")).click();
			Thread.sleep(3000);
			
	}

	public void goTo() {
		driver.get("https://app.tryloop.ai/login/password");
	}
}
