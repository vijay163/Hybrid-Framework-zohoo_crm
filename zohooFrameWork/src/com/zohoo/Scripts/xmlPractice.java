package com.zohoo.Scripts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import com.zohoo.ObjectRepository.loginPage;
import com.zohoo.genric.BaseTest;
import com.zohoo.genric.FRWutills;

public class xmlPractice extends BaseTest
{
@Test
public void dataXml()throws InterruptedException, IOException {
	/*Workbook wb = WorkbookFactory.create(new FileInputStream("./data/input.xlsx"));
	 String un = wb.getSheet("ValidLogin").getRow(1).getCell(0).toString();
	 String pw = wb.getSheet("validLogin").getRow(1).getCell(1).toString();
	BaseTest.openApplication();
	loginPage lp = new loginPage(driver);
	Thread.sleep(2000);
	String un = FRWutills.read_XML_Data(PATH,"ValidLogin", 1, 0);
	String pw = FRWutills.read_XML_Data(PATH,"ValidLogin", 1, 1);
     lp.setUser(un);
     lp.setPass(pw);
     lp.ClickSubmit();
    lp.errorMsg();
    
    
	Workbook wb = WorkbookFactory.create(new FileInputStream("./data/input.xlsx"));
   wb.getSheet("InvalidLogin").createRow(1).createCell(0).setCellValue("mahesh");
   wb.getSheet("InvalidLogin").getRow(1).createCell(1).setCellValue("babu");
   wb.write(new FileOutputStream("./data/input.xlsx"));
*/
	Workbook wb = WorkbookFactory.create(new FileInputStream("./data/input.xlsx"));
	int s = wb.getSheet("InvalidLogin").getLastRowNum();
	System.out.println("no.of entries in sheet"+s);
}
}
