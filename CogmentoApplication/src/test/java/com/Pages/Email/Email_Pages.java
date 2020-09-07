package com.Pages.Email;

import java.util.List;

import org.junit.Assert;

//import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseClass.Library;
import com.seleniumResuableFunctions.SeleniumUtilities;

public class Email_Pages extends Library{
	SeleniumUtilities sUtil;
	JavascriptExecutor js;
	//Getting elements
			@FindBy(name="email")
			WebElement txtEmail;
			@FindBy(name="password")
			WebElement txtPassword;
			@FindBy(xpath="//*[@id=\'ui\']/div/div/form/div/div[3]")
			WebElement btnLogin;
			@FindBy(xpath="//*[@id=\'main-nav\']/a[10]/span")
			WebElement emailClk;
			@FindBy(xpath="//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/div/div[1]/div/div[1]/button")
			WebElement composeclk;
			@FindBy(xpath="//*[@id=\'dashboard-toolbar\']/div[2]/div/button")
			WebElement connectemail;
			@FindBy(xpath="//*//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/div/div[2]/div/form/div[2]/div[1]/div/input")
			WebElement Receipient;
			@FindBy(xpath="//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/div/div[2]/div/form/div[2]/div[2]/div/input")
			WebElement Receipient1;
			@FindBy(xpath="//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/div/div[2]/div/form/div[2]/div[3]/div/input")
			WebElement bcc;
			@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/div/div[2]/div/form/div[2]/div[1]/div/i")
			WebElement srchbtn;
			@FindBy(xpath="//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/div/div[2]/div/form/div[3]/div/input")
			WebElement subject;
			@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/div/div[2]/div/form/div[4]/div[1]/div/i")
			WebElement drpdwn;
			@FindBy(xpath="//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/div/div[2]/div/form/div[4]/div[1]/div/div[2]/div")
			WebElement seltemp;
			@FindBy(xpath="//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/div/div[2]/div/form/div[4]/div[2]/div")
			WebElement attchmnt;
			@FindBy(xpath="//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/div/div[2]/div/form/div[5]/div/div[3]/div/div/div/div/div[1]/div")
			WebElement body;
			@FindBy(xpath="//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div")
			WebElement send;
			@FindBy(xpath="//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div/div[1]")
			WebElement back;
			@FindBy(xpath="//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div[1]/div[2]/div[2]")
			WebElement list;
			@FindBy(xpath="//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div/div[3]/span")
			WebElement etemp;
			@FindBy(xpath="//*[@id=\'dashboard-toolbar\']/div[2]/div/a/button")
			WebElement newtemp;
			@FindBy(xpath="//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/div/div[1]/div/div[2]")
			WebElement inbox;
			@FindBy(xpath="//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div[1]/div[1]/div[1]/input")
			WebElement srctext;
			@FindBy(xpath="//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div[1]/div[1]/div[1]/i")
			WebElement searchbtn;
			@FindBy(xpath="//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/i")
			WebElement selectemail;
			@FindBy(xpath="//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/i")
			WebElement explainemail;
			@FindBy(xpath="//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[2]")
			WebElement emptyinbox;
			@FindBy(xpath="//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/div/div[1]/div/div[3]")
			WebElement sent;
			
			
			//Constructor
			public Email_Pages(WebDriver driver) {
				this.driver=driver;
				PageFactory.initElements(driver, this);
			
		}
			public void login(String email,String pass) {
				txtEmail.sendKeys(email);
				txtPassword.sendKeys(pass);
						
			}
			public void submit() {
				btnLogin.click();
				
			}
			public void email() throws InterruptedException {
				emailClk.click();
				Thread.sleep(2000);
			}
			public void compose() throws InterruptedException {
				composeclk.click();
				Thread.sleep(2000);
			}
			public void connectemail() {
				connectemail.click();
			}
			
			public void email_to(String ch) throws InterruptedException {
				Actions act = new Actions(driver);
		        WebDriverWait wait = new WebDriverWait(driver,30);
		        driver.manage().window().maximize();
		        Receipient.sendKeys(ch);
		        try {
		            Thread.sleep(1000);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
		        List<WebElement> allOptions = driver.findElements(By.xpath("//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/div/div[2]/div/form/div[2]/div[1]/div/div[2]/div[2]/span"));

		        try {
		            for (int i = 0; i < allOptions.size(); i++) {
		                String option =  allOptions.get(i).getText();

		                System.out.println(option);
		                allOptions.get(i).click();
		            }
		        } catch (org.openqa.selenium.StaleElementReferenceException ex) {
		            // TODO Auto-generated catch block
		            ex.printStackTrace();
		        }
							
			}
			public void email_cc(String email) {
				Receipient1.sendKeys(email);
				
			}
			public void emial_bcc(String email) {
				bcc.sendKeys(email);
			}
			public void subj(String sbj) {
				subject.sendKeys(sbj);
				
			}
			public void template() {
				 sUtil = new SeleniumUtilities(driver); 
				  js = ((JavascriptExecutor) driver);
				 js.executeScript("window.scrollTo(0, 200)");
				WebDriverWait wait = new WebDriverWait(driver,30);
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/div/div[2]/div/form/div[4]/div[1]/div/i")));
				drpdwn.click();
				sUtil.scrollDown();
				seltemp.click();
			}
			/*public void attachment() {
				attchmnt.click();
			}*/
			public void Message(String msg) throws InterruptedException {
				body.sendKeys(msg);
				
				
				WebElement header=driver.findElement(By.xpath("//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/div/div[2]/div/form/div[5]/div/div[1]/button[1]/i"));
				
				header.click();
				Thread.sleep(1000);
			
				WebElement para= driver.findElement(By.xpath("//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/div/div[2]/div/form/div[5]/div/div[1]/button[2]"));
				para.click();
				Thread.sleep(1000);
				WebElement bullets=driver.findElement(By.xpath("//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/div/div[2]/div/form/div[5]/div/div[1]/button[3]"));
				bullets.click();
				Thread.sleep(1000);
				WebElement sorted=driver.findElement(By.xpath("//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/div/div[2]/div/form/div[5]/div/div[1]/button[4]"));
				sorted.click();
				Thread.sleep(1000);
				WebElement bold=driver.findElement(By.xpath("//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/div/div[2]/div/form/div[5]/div/div[2]/button[1]/i"));
				bold.click();
				WebElement editable=driver.findElement(By.xpath("//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/div/div[2]/div/form/div[5]/div/div[3]/div/div/div/div/ol/li/div/span/span"));
				 Actions actions= new Actions(driver);
				 actions.moveToElement(editable);
						actions.doubleClick();
					
						actions.click(bold); 
						//actions.click(buttonItalic)
						actions.perform();
				Thread.sleep(1000);
				WebElement italic=driver.findElement(By.xpath("//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/div/div[2]/div/form/div[5]/div/div[2]/button[2]/i"));
				italic.click();
				Thread.sleep(1000);
				WebElement underline=driver.findElement(By.xpath("//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/div/div[2]/div/form/div[5]/div/div[2]/button[3]/i"));
				underline.click();
				Thread.sleep(1000);
				WebElement code=driver.findElement(By.xpath("//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/div/div[2]/div/form/div[5]/div/div[2]/button[4]/i"));
				code.click();
			
			
			}
			public void send_email() {
				//send.click();
			}
			public void go_back() {
				back.click();
			}
			public void inbox() {
				inbox.click();
				srctext.sendKeys("Abc");
				searchbtn.click();
				selectemail.click();
				explainemail.click();
				Assert.assertEquals(true, emptyinbox.isDisplayed());
				logger.info("No Message here is dispalying");
			}
			public void sent() {
				sent.click();
				
			}
}
