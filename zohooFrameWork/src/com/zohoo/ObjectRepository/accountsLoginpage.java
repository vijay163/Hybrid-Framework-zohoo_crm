package com.zohoo.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zohoo.genric.FRWutills;

public class accountsLoginpage extends FRWutills{
	@FindBy(xpath="//a[text()='Accounts']")
	private WebElement accounts;
	@FindBy(xpath="//a[text()='rashmi']")
	private WebElement rashmi;
	public accountsLoginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public  void clickAcc()
	{
	accounts.click();
	}
	public void clickRashmi()
	{
		rashmi.click();
	}
	

}
