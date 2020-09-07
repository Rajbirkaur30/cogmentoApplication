package com.testNG;

import org.testng.annotations.Test;

public class DependsUponGroups {
	@Test(groups={"Smoke","Regression"})
	public void testcase1(){
		System.out.println("Test Case 1");
		
	}
	@Test(groups={"Smoke","Sanity"})
	public void testcase2(){
		System.out.println("Test Case 2");
		
	}
	@Test(groups={"Functional Testing","Retesting"})
	public void testcase3(){
		System.out.println("Test Case 3");
		
	}
	

}
