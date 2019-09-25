package com.ycc.page;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ycc.common.WebDriverFactory;

import javafx.scene.control.Alert;

public class LoginPage {
@FindBy (xpath="//input[@class='form-control']") WebElement elmUsername;
//@FindBy (xpath="//div[@class='input-group']//div//input[@id='username']") WebElement elmUsername;

	

@FindBy (xpath="//input[@type='password']") WebElement elmPassword;
@FindBy (xpath="//input[@type='checkbox']") WebElement elmCheckbox;
//@FindBy (xpath="//button[@type='submit']") WebElement elmSubmit;
//div[@class='form-group']//button[@id='login']
@FindBy (xpath="//div[@class='form-group']//button[@id='login']") WebElement elmSubmit;

//@FindBy (xpath="//input[@id='txtUsername' and @id='txtUsername']") WebElement elmUsername;
//@FindBy (xpath="//input[@id='txtUsername' or @id='txtUsername']") WebElement elmUsername;
//@FindBy (xpath="//input[contains(@id,'Username')]") WebElement elmUsername;
//@FindBy (xpath="//input[starts-with(@id,'txtUser')]") WebElement elmUsername;
//@FindBy (xpath="//*[text()='LOGIN Panell']") WebElement elmUsername;//elmUsername.isDisplayed();

public WebDriverWait wt;
public LoginPage()
{
	PageFactory.initElements(WebDriverFactory.getdr(), this);
	wt =new WebDriverWait(WebDriverFactory.getdr(), 20);
}

public DashboardPage successLogin() throws IOException, InterruptedException
{
//	 
//
//    JavascriptExecutor js = (JavascriptExecutor)WebDriverFactory.getdr();	
//  //  js.executeScript("arguments[0].click();", elmSubmit);
////	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//	js.executeScript("arguments[0].scrollIntoView(true);", elmSubmit);
//	 js.executeScript("window.scrollBy(0,600)");	
//	js.executeScript("history.go(0)"); //page will be refresh.
//	js.executeScript("arguments[0].style.border='3px solid red'", elmSubmit);
//
//
//	String title = js.executeScript("return document.title;").toString();
//	System.out.println(title);
//    js.executeScript("arguments[0].style.backgroundColor = 'rgb(0,200,0)'",  elmSubmit);
//
//    try {
//        Thread.sleep(20);
//    }  catch (InterruptedException e) {
//    }
////	String pageText = js.executeScript("return document.documentElement.innerText;").toString();
////	System.out.println(pageText);
//    js.executeScript("alert('Welcome to Guru99');");  
//	Thread.sleep(5000);
//	WebDriverFactory.getdr().switchTo().alert().accept();
//
//    File src = ((TakesScreenshot) WebDriverFactory.getdr()).getScreenshotAs(OutputType.FILE);
//	FileUtils.copyFile(src, new File("C:\\Users\\User\\eclipse-workspace\\YtelCotactCenter\\src\\test\\java\\com\\ycc\\test\\element.png"));

	
	elmUsername.sendKeys("kiran@ytel.co.in");
	elmPassword.sendKeys("BALAji@0321");
	elmCheckbox.click();
//	elmSubmit.click();
	elmSubmit.getCssValue("font-size");
	return new DashboardPage().isDashboardPageLoaded();
 
//	return new DashboardPage().isDashboardPageLoaded();
	
}

}

