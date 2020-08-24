package com.testcase;

import java.io.IOException;

public class CalledWrapper {
	public static void main(String[] args) throws IOException  {
		  WrapperMethod wm = new WrapperMethod();
		  wm.insertapp("https://opensource-demo.orangehrmlive.com/");
		  wm.enterbyid("txtUsername", "Admin");
		  wm.enterbyid("txtPassword", "admin123");
		  wm.clickbyxpath("//*[@id=\'btnLogin\']");
		  wm.takesnap("src/test/resources/ScreenShot/test.png");
		  wm.closeapp();
			}
}
