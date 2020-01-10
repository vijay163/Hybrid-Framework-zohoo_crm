package com.zohoo.Scripts;

import org.testng.annotations.Test;

import com.zohoo.ObjectRepository.accountsLoginpage;
import com.zohoo.ObjectRepository.fetchdatapage;
import com.zohoo.ObjectRepository.loginPage;
import com.zohoo.genric.BaseTest;
import com.zohoo.genric.FRWutills;

public class testSalary extends BaseTest
{
@Test
public void testSal()throws InterruptedException
{
	String un = FRWutills.read_XML_Data(XL_DATA_PATH, "ValidLOgin",1,0);
	String pw = FRWutills.read_XML_Data(XL_DATA_PATH, "ValidLogin",1,1);
	BaseTest.openApplication();
	loginPage lp = new loginPage(driver);
     lp.setUser(un);
     lp.setPass(pw);
     lp.ClickSubmit();
     System.err.println("****enter into login****");
    accountsLoginpage ac = new accountsLoginpage(driver);
    ac.verifyWebPage(driver,"Zoho CRM - Home Page");
    ac.clickAcc();
    ac.clickRashmi();
    ac.verifyWebPage(driver,"Zoho CRM - Account Details");
System.err.println("****get salary*******");
fetchdatapage fe = new fetchdatapage(driver);
fe.annualsalary();
fe.location();
fe.verifyAnnSalary(driver);
fe.takeScreenShot(driver,"./screenshot/product.png");
BaseTest.closeApplication();

}
}
