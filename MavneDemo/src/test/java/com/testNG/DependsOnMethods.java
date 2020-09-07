package com.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods {
	private static final boolean True = false;
	@Test
	public void login(){
		System.out.println("Test Case login");
		
	}
	@Test(dependsOnMethods="login")
	public void search(){
		System.out.println("Test Case Search");
		Assert.assertEquals("XYZ","ABC");
		
	}
	@Test(dependsOnMethods="search", alwaysRun= True)
	public void logout(){
		System.out.println("Test Case Logout");
		
	}
	
}
