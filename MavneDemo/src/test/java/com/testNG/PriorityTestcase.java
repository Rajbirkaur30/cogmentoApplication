package com.testNG;

import org.testng.annotations.Test;

public class PriorityTestcase {
	@Test(priority=3)
	public void testcase1(){
		System.out.println("Test Case 1");
		
	}
	@Test(priority=1)
	public void testcase2(){
		System.out.println("Test Case 2");
		
	}
	@Test(priority=2)
	public void testcase3(){
		System.out.println("Test Case 3");
		
	}
}
