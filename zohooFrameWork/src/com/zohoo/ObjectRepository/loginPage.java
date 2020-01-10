package com.zohoo.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zohoo.genric.FRWutills;

public class loginPage extends FRWutills {
	@FindBy(xpath="//input[@id='userName']")
	private WebElement user;
	@FindBy(xpath="//input[@id='passWord']")
	private WebElement pass;
	@FindBy(xpath="//input[@alt='Sign In']")
	private WebElement submit;
	@FindBy(xpath="//td[text()=' No such account configured for the user ']")
	private WebElement errormsg;
	public loginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void setUser(String un) throws InterruptedException
	{
		user.sendKeys(un);
		System.out.println(user.getAttribute("value"));
		Thread.sleep(2000);
	}
	public void setPass(String pw) throws InterruptedException
	{
	pass.sendKeys(pw);	
	System.out.println(pass.getAttribute("value"));
	Thread.sleep(2000);
	
	}
	public void ClickSubmit()
	{
		submit.click();
	}
	public void errorMsg()
	{
	if(errormsg.isDisplayed())
	{
		System.out.println("***you enter wrong credentials***");
	}
	System.out.println(errormsg.getText());
  }
}