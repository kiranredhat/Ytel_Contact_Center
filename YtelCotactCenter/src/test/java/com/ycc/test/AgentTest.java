package com.ycc.test;

import java.io.IOException;

import org.omg.CORBA.LongLongSeqHelper;
import org.testng.annotations.Test;

import com.ycc.common.BaseSelenium;
import com.ycc.page.LoginPage;

public class AgentTest extends BaseSelenium {
@Test
public void verifyAgentTest() throws IOException, InterruptedException
{
	LoginPage lp = new LoginPage();
	lp.successLogin()
		.navigateToAgentPage();
}
	

}
