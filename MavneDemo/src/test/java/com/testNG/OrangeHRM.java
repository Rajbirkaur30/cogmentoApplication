package com.testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {
	WebDriver driver;
	@BeforeMethod
	public void launchApp() {
		WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test
	public void login(){
		 driver.findElement(By.xpath("//input[@id=\'txtUsername\']")).sendKeys("Admin");
	        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	        driver.findElement(By.xpath("//*[@id=\'btnLogin\']")).click();
		
	}
	@AfterMethod
	public void closeApp() {
		driver.quit();
	}
	
	

}
