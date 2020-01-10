package com.zohoo.genric;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

abstract public class BaseTest implements IAutoConstant 
{
	static
	{
		System.setProperty(CHROME_KEY,CHROME_VALUE);
		System.setProperty(GECKO_KEY,GECKO_VALUE);
	}
	public static WebDriver driver;
	public static void openApplication()
	{
		   driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(IOT,TimeUnit.SECONDS);
			driver.get(URL);
			
		
	}
public static void closeApplication()
{
driver.close();	
}
}
