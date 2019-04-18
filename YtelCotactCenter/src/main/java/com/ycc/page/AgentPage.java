package com.ycc.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ycc.common.WebDriverFactory;

public class AgentPage {
@FindBy (xpath="//input[@type='search']") WebElement elmSearchPage;
@FindBy (xpath="//body[@id='x5AdminApp']/div[1]/div[2]/div[3]/legend/div/a/i") WebElement elmCloneAgent;

private WebDriverWait wt;
public AgentPage()
{
	PageFactory.initElements(WebDriverFactory.getdr(), this);
	wt=new WebDriverWait(WebDriverFactory.getdr(), 20);
}

public AgentPage isAgentPageLoaded()
{
	wt.until(ExpectedConditions.visibilityOf(elmSearchPage));
	wt.until(ExpectedConditions.visibilityOf(elmCloneAgent));

	return this;
	
}

public CloneAgentPage navigateToCloneAgentPage()
{
	elmCloneAgent.click();
	return new CloneAgentPage().isCloneAgentPageLoaded();
}
}
