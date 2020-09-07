package com.seleniumResuableFunctions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseClass.Library;



public class SeleniumUtilities extends Library {
	 Robot robot ;
	public SeleniumUtilities(WebDriver driver) {
		//this.driver=driver;
		logger = Logger.getLogger(Library.class);
		
	}
	public void to_take_screenshot(String path) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(source,new File(path));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void getTitle() {
		
		System.out.println(driver.getTitle());
	
	}
	//Explicit wait
	public void Explicitlywait(String Locator) {
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Locator))));
		
	}
	//Scroll up using Robot class
	public void scrollUpUsinRobot() throws AWTException {
		robot = new Robot();
		 robot.keyPress(KeyEvent.VK_PAGE_UP);
	     robot.keyRelease(KeyEvent.VK_PAGE_UP);
	}
	
	//Scroll down using Robot class
	public void scrolldownUsingRobot() {
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}
	
	public void selectOptionWithText(String textToSelect) {
		try {
			WebElement autoOptions = driver.findElement(By.id("ui-id-1"));
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOf(autoOptions));

			List<WebElement> optionsToSelect = autoOptions.findElements(By.tagName("li"));
			for(WebElement option : optionsToSelect){
		        if(option.getText().equals(textToSelect)) {
		        	System.out.println("Trying to select: "+textToSelect);
		            option.click();
		            break;
		        }
		    }
			
		} catch (NoSuchElementException e) {
			System.out.println(e.getStackTrace());
		}
		catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}
	//selecting from drop down
	public void dropdown(WebElement element,String selectedvalue) {
		Select select = new Select(element); 
		select.selectByVisibleText(selectedvalue);
		
	}
	
	//Page verification
	public void pageVerification(String expectedURLorTitle,String actualURLorTitle) {
		
		try {
		Assert.assertEquals(expectedURLorTitle, actualURLorTitle);
		logger.info("Page is verified");
				
		}catch(Exception e)
		{
			logger.info("Page is not verified");
		}
	}
	//Window scroll down to middle
	public void scrollDown() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 200)");
	}
	
	//Alert Handling
	public void alertHandle() {
	
		Set<String> winhandles = driver.getWindowHandles();// all the windows
	   
		for (String winhandle : winhandles) {
			driver.switchTo().window(winhandle);
			
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				
			}
			driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/button[@class='ui red button']")).click();
		}
	   
	   
	}
	
	// Checking the presence  of element
	public void existElement(String typeOfLocator, String locatorValue) {
		String typeoflocator = typeOfLocator.toLowerCase();
		boolean isElementPresent=false;
		try {
		switch (typeoflocator) {
		case "xpath":
		{
			//uiElement=driver.findElement(By.xpath(locatorValue));
			//Assert.assertEquals(true,driver.findElement(By.xpath(locatorValue)).isDisplayed());
			isElementPresent=driver.findElement(By.xpath(locatorValue)).isDisplayed();
		}
		break;
		case "id":
		{
			
			//Assert.assertEquals(true,driver.findElement(By.id(locatorValue)).isDisplayed());
			isElementPresent=driver.findElement(By.id(locatorValue)).isDisplayed();
		}
		break;
		case "name":
		{
		     //Assert.assertEquals(true,driver.findElement(By.name(locatorValue)).isDisplayed());
			isElementPresent=driver.findElement(By.name(locatorValue)).isDisplayed();
		}
		break;
		case "class":
		{
						
			//Assert.assertEquals(true,driver.findElement(By.className(locatorValue)).isDisplayed());
			isElementPresent=driver.findElement(By.className(locatorValue)).isDisplayed();
		}
		break;
		case "classname":
		{
			
			//Assert.assertEquals(true,driver.findElement(By.className(locatorValue)).isDisplayed());
			isElementPresent=driver.findElement(By.className(locatorValue)).isDisplayed();
		}
		break;
		case "css":
		{
			
			//Assert.assertEquals(true,driver.findElement(By.cssSelector(locatorValue)).isDisplayed());
			isElementPresent=driver.findElement(By.cssSelector(locatorValue)).isDisplayed();
		}
		break;
		case "cssselector":
		{
			
			//Assert.assertEquals(true, driver.findElement(By.cssSelector(locatorValue)).isDisplayed());
			isElementPresent=driver.findElement(By.cssSelector(locatorValue)).isDisplayed();
		}
		break;
				
		}
		
		if (isElementPresent) {
			logger.info("Element is present");
		}
		}catch(Exception e) {
			logger.info("From method 'existElement()' in SeleniumUtilities class :Element is not present");
			
		}
	}
	//Checking Presence of element using xpath
	public void  existanceOfElementUsingxPath(String locatorxPath) {
		
		if(driver.findElement(By.xpath(locatorxPath)).isDisplayed())
		{
		logger.info("Element is present");
	    }
		else {
			logger.info("Element is not present");
		}
	}
	
	public void quit() {
		driver.close();
		
	}

}
