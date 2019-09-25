package com.ycc.page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.css.ElementCSSInlineStyle;

import com.ycc.common.WebDriverFactory;
public class CloneAgentPage {
	int r;
	int k=4;
@FindBy (xpath="//input[@id='user']") WebElement elmUser;
@FindBy (xpath="//input[@id='pass']") WebElement elmPassword;
@FindBy (xpath="//input[@id='full_name']") WebElement elmFullName;
@FindBy (xpath="//select[@id='from_id']") WebElement elmSourceAgent;
@FindBy (xpath="//button[@class='btn btn-info']") WebElement elmSubmit;
@FindBy (xpath="//table[@id='table-1']") WebElement elmBaseTable;


private WebDriverWait wt;
public CloneAgentPage()
{
	PageFactory.initElements(WebDriverFactory.getdr(), this);
	wt=new WebDriverWait(WebDriverFactory.getdr(), 20);

}
public CloneAgentPage isCloneAgentPageLoaded()
{
	wt.until(ExpectedConditions.visibilityOf(elmUser));
	wt.until(ExpectedConditions.visibilityOf(elmPassword));
	wt.until(ExpectedConditions.visibilityOf(elmFullName));
	wt.until(ExpectedConditions.visibilityOf(elmSourceAgent));
	wt.until(ExpectedConditions.visibilityOf(elmSubmit));
	return this;
	
}

public AgentPage cloneAgentSuccess() throws InterruptedException, AWTException
{
	Random rand =new Random();
	int r=rand.nextInt(700000);
	elmUser.sendKeys("4"+r);
	String c= "4"+r;
	System.out.println("elmUser result is "+c);

	elmPassword.sendKeys("aQ!23456");
	elmFullName.sendKeys("balaji");
	elmFullName.click();
	 Thread.sleep(5000); 		 
	Select select = new Select(elmSourceAgent);
	select.selectByVisibleText("9756 - ytelindia");
	//elmSubmit.click();
	JavascriptExecutor js = (JavascriptExecutor) WebDriverFactory.getdr();
	js.executeScript("arguments[0].click();", elmSubmit);
	
	wt.until(ExpectedConditions.visibilityOf(elmBaseTable));

	java.util.List<WebElement> tablerow = elmBaseTable.findElements(By.xpath("//*[@id='table-1']/tbody/tr"));
	 String beforexpath="//*[@id=\"table-1\"]/tbody/tr[";
	 String afterxpath="]/td[2]";
	 for (int i=1; i<=3;i++)
	 {
		String name= WebDriverFactory.getdr().findElement(By.xpath(beforexpath+i+afterxpath)).getText();
		 System.out.println(name);
		
		 if (name.contains(c))
		 {
			 String beforexpath1="//*[@id=\"table-1\"]/tbody/tr[";
			 String afterxpath1="]/td[7]";
			 
			//*[@id="438"]/td[7]/a/span
			// WebDriverFactory.getdr().findElement(By.xpath("//*[@id=\\\"table-1\\\"]/tbody/tr["+ i + "]/td[7]/a/span")).click();
			WebDriverFactory.getdr().findElement(By.xpath(beforexpath1+i+afterxpath1)).click();
		 }else if (name==c);
		 
		 }	
	return new AgentPage();
}
}
