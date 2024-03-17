package com.Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class VerifyTotalValue {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();;//chromedriver
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

}
