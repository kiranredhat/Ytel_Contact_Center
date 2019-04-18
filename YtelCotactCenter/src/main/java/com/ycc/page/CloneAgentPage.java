package com.ycc.page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ycc.common.WebDriverFactory;
public class CloneAgentPage {
	int r;
	int k=4;
@FindBy (xpath="//input[@id='user']") WebElement elmUser;
@FindBy (xpath="//input[@id='pass']") WebElement elmPassword;
@FindBy (xpath="//input[@id='full_name']") WebElement elmFullName;
@FindBy (xpath="//select[@id='from_id']") WebElement elmSourceAgent;

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
	 Robot robot = new Robot(); 
	 Thread.sleep(5000); 
		 
	Select select = new Select(elmSourceAgent);
	select.selectByVisibleText("9756 - ytelindia");
	
	
	return new AgentPage();
}
}
