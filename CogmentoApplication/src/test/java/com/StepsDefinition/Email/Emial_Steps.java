package com.StepsDefinition.Email;

import org.openqa.selenium.By;

import com.Pages.Email.Email_Pages;
import com.baseClass.Library;
import com.seleniumResuableFunctions.SeleniumUtilities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Emial_Steps extends Library {
	Email_Pages epage;
	 SeleniumUtilities sUti;
	@Given("Launch the browser and navigate to the URL")
	public void launch_the_browser_and_navigate_to_the_URL() {
		browserSetUp();
		logger.info("Browser Launched and navigate to URL");
	   
	}

	@When("Enter Email and password")
	public void enter_Email_and_password() {
       epage=new Email_Pages(driver);
		 epage.login(properties.getProperty("LoginEmial"), properties.getProperty("LoginPassword"));
		 logger.info("LoginEmail and password entered successfully");
	
	}

	@Then("Click the login button")
	public void click_the_login_button() {
		epage.submit();
		logger.info("Login successfully");
	
	}

	@Then("Get the page title and screen shot")
	public void get_the_page_title_and_screen_shot() {
		sUti = new SeleniumUtilities(driver);
		sUti.to_take_screenshot("src/test/resources/ScreenShots/CogmentoLogin.png");
		logger.info("Take Screen Shot");
		sUti.getTitle();
		//tearDown();
	   
	}
	

	@When("Click Email")
	public void click_Email() throws InterruptedException {
		epage.email();
		
	    
	}
	@Then("Compose an email")
	public void compose_an_email() throws InterruptedException {
		epage.compose();
	   
	}

	
	@Then("fill the required fields")
	public void fill_the_required_fields() throws InterruptedException {
		epage.email_to("raj");
		epage.email_cc("rairajbir@gmail.com");
	    epage.emial_bcc("rairajbir@gmail.com");
	    epage.subj("My first Project");
	    epage.template();
	 //   epage.attachment();
	    epage.Message("This is my first project for Automation");
	    }
	@Then("send the email")
	public void send_the_email() {
	    epage.send_email();
	}

	@Then("Go back to previous page")
	public void go_back_to_previous_page() {
		epage.go_back();
	    
	}

	@Then("Check inbox")
	public void check_inbox() {
		epage.inbox();
		 	    
	}

	@Then("Check Sent Messages")
	public void check_Sent_Messages() {
	    
	}

	@Then("Refersh the page")
	public void refersh_the_page() {
	    
	}

	@Then("select feature fetch")
	public void select_feature_fetch() {
	    
	}

	@When("Select feature Template")
	public void select_feature_Template() {
	    
	}

	@Then("Create new Email Template")
	public void create_new_Email_Template() {
	    
	}

	@Then("Fill all required fields to create template")
	public void fill_all_required_fields_to_create_template() {
	   
	    
	}

	@Then("Save the Template")
	public void save_the_Template() {
	   
	    
	}

	@Then("Edit the existing Template and save it")
	public void edit_the_existing_Template_and_save_it() {
	   
	    
	}

	@Then("Go back to Email page")
	public void go_back_to_Email_page() {
	   
	    
	}

	@When("Connect an Email Account")
	public void connect_an_Email_Account() {
	   
	    
	}

	@Then("Do Accounts settings")
	public void do_Accounts_settings() {
	   
	    
	}

	
}
