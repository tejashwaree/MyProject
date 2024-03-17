package com.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


@Test
public class VerifyGrandTotal{

	public static void main(String[] args)throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://app.tryloop.ai/login/password");
		String email = "qa-engineer-assignment@test.com";
		String password = "QApassword123$";
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(email);
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys(password);
		driver.findElement(By.xpath("(//*[@data-testid='login-button']/span)[1]")).click();
		Thread.sleep(3000);
		}

}
