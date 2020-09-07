import java.net.MalformedURLException;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumGrid {
	WebDriver driver;
	String baseurl, nodeurl;
	@BeforeTest
	public void setup() throws MalformedURLException
	{
	baseurl="http://facebook.com/";
	nodeurl="http://192.168.0.56:5506/wd/hub";
	DesiredCapabilities capablity = DesiredCapabilities.firefox();
	capablity.setBrowserName("firefox");
	capablity.setPlatform(Platform.WINDOWS);
	driver =new RemoteWebDriver(new URL(nodeurl),capablity);
	}
	@AfterTest
	public void aftertest()
	{
	driver.quit();
	}
	@Test
	public void simpletest(){
	driver.get(baseurl);
	String a= driver.getTitle();
	System.out.println("title of the page:"+a);
	}
	

}



}
