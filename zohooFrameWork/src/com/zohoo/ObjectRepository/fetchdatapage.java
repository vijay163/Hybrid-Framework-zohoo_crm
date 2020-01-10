package com.zohoo.ObjectRepository;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.zohoo.genric.FRWutills;

public class fetchdatapage extends FRWutills {
	@FindBy(xpath="//td[@id='Annual Revenue']/../td[2]")
	private WebElement annsalary;
	@FindBy(xpath="//td[@id='Shipping Street']/../td[2]")
	private WebElement area;
	public fetchdatapage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void annualsalary()
	{
		System.out.println(annsalary.getText());
	}
	public void location()
	{
		System.out.println(area.getText());
	}
   public void verifyAnnSalary(WebDriver driver)
   {
	   String exsal = annsalary.getText();
	   String acsal = "$1,000,000.00";
       if(acsal.equals(exsal))
       {
    	   System.out.println("***salary is equal===="+acsal);
       }
       else
       {
    	   System.out.println("**salary not matches==="+exsal);
       }
   }
   public void verifyArea(WebDriver driver)
   {
	   String exarea = area.getText();
	   String acarea = "nr colony";
       if(acarea.equals(exarea))
       {
    	   System.out.println("***area is equal===="+acarea);
       }
       else
       {
    	   System.out.println("**area not matches==="+exarea);
       }
   }
}
