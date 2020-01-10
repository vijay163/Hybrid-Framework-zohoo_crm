package com.zohoo.Scripts;

import org.testng.annotations.Test;

import com.zohoo.ObjectRepository.loginPage;
import com.zohoo.genric.BaseTest;
import com.zohoo.genric.FRWutills;

public class testInvalidLogin extends BaseTest
{
@Test
public void invalidLOgin()throws InterruptedException
{ 
	int t = FRWutills.XL_DATA_Count("InvalidLogin",XL_DATA_PATH);
    System.out.println("no.of the rows are"+t);
	BaseTest.openApplication();	
	loginPage lp1 = new loginPage(driver);
	for(int i=1;i<=t;i++) 
	{
		String un = FRWutills.read_XML_Data(XL_DATA_PATH, "InvalidLogin" ,i,0);
		String pw = FRWutills.read_XML_Data(XL_DATA_PATH, "InvalidLogin",i,1);
	System.out.println("**enter wrong user name and pass cick login********");
    lp1.setUser(un);
    lp1.setPass(pw);
    lp1.ClickSubmit();
    lp1.errorMsg();
    Thread.sleep(IOT);
    }
}
}