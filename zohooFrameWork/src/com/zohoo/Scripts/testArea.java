package com.zohoo.Scripts;

import com.zohoo.ObjectRepository.accountsLoginpage;
import com.zohoo.ObjectRepository.fetchdatapage;
import com.zohoo.ObjectRepository.loginPage;
import com.zohoo.genric.BaseTest;

public class testArea extends BaseTest
{
public static void main(String[] args) throws InterruptedException {
	BaseTest.openApplication();
	loginPage lp = new loginPage(driver);
     lp.setUser("rashmi@dell.com");
     lp.setPass("123456");
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
//fe.takeScreenShot(driver,"./screenshot/product.png");
BaseTest.closeApplication();

}
}
