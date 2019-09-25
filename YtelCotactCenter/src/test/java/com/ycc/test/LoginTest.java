package com.ycc.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.ycc.common.BaseSelenium;
import com.ycc.page.LoginPage;

public class LoginTest extends BaseSelenium {
//@Test (invocationCount=4, threadPoolSize=2, timeOut=20000, enabled=false, dependsOnMethos="verifyLoginSuccessfulll", description="loginSuccessMethod")
@Test (groups= {"kirangroup"})
//@Test 
public void verifyLoginSuccessfull() throws IOException, InterruptedException
{
	LoginPage lp =new LoginPage();
	lp.successLogin();	
}

@Test (groups= {"kirangroup2"})
//@Test 
public void verifyLoginSuccessfulll() throws IOException, InterruptedException
{
	LoginPage lp =new LoginPage();
	lp.successLogin();	
}

//@Test

public  void forloop() {
	int a[][]= {{2,3,4,5},{6,7,8,9}};
	for (int i=0; i<a.length; i++) {
		System.out.println(a[i]);		
	}
}

}
 
