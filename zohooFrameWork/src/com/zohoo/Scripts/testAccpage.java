package com.zohoo.Scripts;

import com.zohoo.ObjectRepository.accountsLoginpage;
import com.zohoo.ObjectRepository.loginPage;
import com.zohoo.genric.BaseTest;

public class testAccpage extends BaseTest{
public static void main(String[] args) throws Exception
{ 
	BaseTest.openApplication();
	loginPage lp = new loginPage(driver);
	lp.setUser("rashmi@dell.com");
	lp.setPass("123456");
	lp.ClickSubmit();
	accountsLoginpage al = new accountsLoginpage(driver);
	al.clickAcc();
	al.clickRashmi();
    al.verifyWebPage(driver, "Zoho CRM - Account Details");
    
}
}
