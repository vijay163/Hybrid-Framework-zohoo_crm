package com.zohoo.Scripts;

import org.testng.annotations.Test;

import com.zohoo.ObjectRepository.loginPage;
import com.zohoo.genric.BaseTest;
import com.zohoo.genric.FRWutills;

public class TestValidLogin extends BaseTest
{
	@Test
	public void validLogin() throws InterruptedException
	{
		BaseTest.openApplication();
		loginPage lp = new loginPage(driver);
		String un = FRWutills.read_XML_Data(XL_DATA_PATH,"ValidLogin",1 , 0);
		String pw = FRWutills.read_XML_Data(XL_DATA_PATH,"ValidLogin",1,1);
		lp.setUser(un);
		lp.setPass(pw);
		lp.ClickSubmit();
	}

}
