package com.zohoo.genric;

import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FRWutills implements IAutoConstant
{
	/**
	 * is used to read the data from XML file
	 * @param path
	 * @param sheet
	 * @param rown
	 * @param celln
	 * @return
	 */
	public static String read_XML_Data(String path,String sheet,int rown,int celln)
	{
		String data="";
		try
		{
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		data=wb.getSheet(sheet).getRow(rown).getCell(celln).toString();
		}
		catch (Exception e)
		{
		e.printStackTrace();	
		}
		return data;

	}
	/**
	 * is used write the data into XML file
	 * @param path
	 * @param sheet
	 * @param row
	 * @param cell
	 * @param passdata
	 */
	public static void write_XML_DATA(String path,String sheet,int row,int cell,String passdata)
	{
		try 
		{
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		wb.getSheet(sheet).createRow(row).createCell(cell).setCellValue(passdata);
		wb.write(new FileOutputStream(path));
		}
		catch (Exception e) 
		{
		e.printStackTrace();	
		}
	}
	/**
	 * is used to count the rows has to be filled with data
	 * @param sheet
	 * @param path
	 * @return
	 */
	public static int XL_DATA_Count(String sheet,String path)
	{
		int rows=0;
		try 
		{
			
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			rows=wb.getSheet(sheet).getLastRowNum();
		} 
		catch (Exception e) 
		{
		 e.printStackTrace();
		}
		return rows;
	}
	/**
	 * is used to verify the webpage,is it display or not by using title of webpage  
	 * @param driver
	 * @param expectedTitle
	 */
	public static void verifyWebPage(WebDriver driver,String expectedTitle)
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
	    wait.until(ExpectedConditions.titleIs(expectedTitle));
	    String actualTitle = driver.getTitle();
	    if(actualTitle.equals(expectedTitle))
	    {
	     	System.out.println("****the expected title is==="+expectedTitle);
	    }
	    else
	    {
	    	System.out.println("*the expected title is wrong we get===="+actualTitle);
	    }
	    
	}
	/**
	 * is used to take screenshot
	 * @param driver
	 * @param path
	 */
	public static void takeScreenShot(WebDriver driver,String path)
	{
		try
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
		    File src = ts.getScreenshotAs(OutputType.FILE);
		     File des = new File(path);
		    FileUtils.copyFile(src, des);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * is used to perform explicitwait
	 * @param driver
	 */
	public static void explicitlyWait(WebDriver driver)
	{
		new WebDriverWait(driver,EOT);
	}
	/**
	 * is used to perform all 5 actions,mouse hovering,composit and context click,drag and drop,double click
	 * @param driver
	 */
	public static void actions(WebDriver driver)
	{
		new Actions(driver);
	}
	/**
	 * is used to perform all robot class actions
	 * @param driver
	 */
	public static void robot(WebDriver driver)
	{
		try 
		{
		new Robot();
		}
		catch (Exception e)
		{
		e.printStackTrace();
		}
	}
	/**
	 * is used to perform the all ListBox Actions
	 * @param element
	 */
	public static void mouseActions(WebElement element)
	{
		new Select(element);
	}
}
