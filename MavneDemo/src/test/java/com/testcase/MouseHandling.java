package com.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.xpath("//input[@id=\'txtUsername\']")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.xpath("//*[@id=\'btnLogin\']")).click();
        WebElement Admin= driver.findElement(By.xpath("//*[@id=\'menu_admin_viewAdminModule\']/b"));
        WebElement Qualification= driver.findElement(By.id("menu_admin_Qualifications"));
        WebElement Languages= driver.findElement(By.id("menu_admin_viewLanguages"));
        Actions action= new Actions(driver);
        action.moveToElement(Admin).perform();
        action.moveToElement(Qualification).perform();
        action.moveToElement(Languages).click().build().perform();
	}

}
