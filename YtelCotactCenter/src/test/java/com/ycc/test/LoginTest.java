package com.ycc.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.ycc.common.BaseSelenium;
import com.ycc.page.LoginPage;

public class LoginTest extends BaseSelenium {
@Test
public void verifyLoginSuccessfull() throws IOException, InterruptedException
{
	LoginPage lp =new LoginPage();
	lp.successLogin();	
}

}
 