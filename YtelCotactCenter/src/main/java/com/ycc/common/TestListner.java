package com.ycc.common;

import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;


public class TestListner implements IInvokedMethodListener {

	public void afterInvocation(IInvokedMethod arg0, ITestResult arg1) {
		// TODO Auto-generated method stub
		
		WebDriverFactory.getdr().quit();
	}

	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {
		// TODO Auto-generated method stub
		try 
		{
			if (arg0.isTestMethod())
			{
				System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Browser\\chromedriver.exe");
//				System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Browser\\geckodriver.exe");
//				System.setProperty("webdriver.ie.driver", "F:\\Selenium\\Browser\\IEDriverServer.exe");

				WebDriverFactory.setdr(new ChromeDriver());
				WebDriverFactory.getdr().manage().deleteAllCookies();
				WebDriverFactory.getdr().get("https://x5admin.ytel.com/Account/login");
//				WebDriverFactory.getdr().manage().window().maximize();
				Dimension d=new Dimension(480,620);
				WebDriverFactory.getdr().manage().window().setSize(d);
//				DesiredCapabilities DC = new DesiredCapabilities();
//				 DC.setBrowserName("chrome");
//				 DC.setVersion("72");
//				 WebDriverFactory.setdr(new RemoteWebDriver(new URL ("http://192.168.43.34:4444/wd/hub"),DC));
//				 WebDriverFactory.getdr().get("http://127.0.0.1/orangehrm-3.3.1/symfony/web/index.php/auth/login"); // Navigate to

			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	
	

}
