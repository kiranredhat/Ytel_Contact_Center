package com.ycc.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ycc.common.WebDriverFactory;

public class DashboardPage {
@FindBy (xpath="//input[@id='monitor_phone']") WebElement elmPhoneNumber;
@FindBy (xpath="//a[@class='ui-dialog-titlebar-minimize ui-corner-all ui-state-default']") WebElement elmAgentPopUp;
@FindBy (xpath="//a[@aria-label='Users Menu']") WebElement elmAgents;
@FindBy (xpath="//a[@href='/DB/User']") WebElement elmAgent;

public WebDriverWait wt;
public DashboardPage()
{
	PageFactory.initElements(WebDriverFactory.getdr(), this);
	wt=new WebDriverWait(WebDriverFactory.getdr(), 20);
}
public DashboardPage isDashboardPageLoaded()
{
	wt.until(ExpectedConditions.visibilityOf(elmPhoneNumber));
	wt.until(ExpectedConditions.visibilityOf(elmAgents));

	return this;
}

public AgentPage navigateToAgentPage()
{
	elmAgents.click();
	elmAgentPopUp.click();
	elmAgent.click();
	return new AgentPage().isAgentPageLoaded();
}
}
