package com.Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTotalValue {

	public static void main(String[] args) {
		WebDriver driver = WebDriverManager.chromedriver().create();//chromedriver
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

}
