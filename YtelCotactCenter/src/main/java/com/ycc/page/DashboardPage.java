package com.ycc.page;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
@FindBy (xpath="//span[@class='multiselect-selected-text']") WebElement DashboardDropDown;
@FindBy (xpath="//a[@aria-label='Campaign Menu']") WebElement elmCampaigns;
@FindBy (xpath="//a[@href='/DB/Campaign']") WebElement elmCampaign;

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
	Actions action = new Actions(WebDriverFactory.getdr());
	action.click().build().perform();
	List<WebElement> els = WebDriverFactory.getdr().findElements(By.xpath("//span[@class='multiselect-selected-text']"));
	for ( WebElement el : els ) {
	    if ( !el.isSelected() ) {
	        el.click();
	    }
	}

	return this;
}

public DashboardPage CampaignDropDown()
{
	List<WebElement> els = WebDriverFactory.getdr().findElements(By.xpath("//span[@class='multiselect-selected-text']"));
	for ( int i=0; i<=els.size(); i++) {
//		for ( WebElement el : els ) {
//	    if ( !el.isSelected() ) {
	        ((WebElement) els).click();
	    }
	
	return this;
}
public AgentPage navigateToAgentPage()
{
	elmAgents.click();
	elmAgentPopUp.click();
	elmAgent.click();
	return new AgentPage().isAgentPageLoaded();
}

public CampaignListPage navigateToCampaignListPage()
{
	elmCampaigns.click();
	elmAgentPopUp.click();
	elmCampaign.click();
	return new CampaignListPage();
}

public GroupEditPage navigateToGroupEditPage()
{
	elmAgentPopUp.click();
	WebDriverFactory.getdr().get("https://x5adminw.ytel.com/DB/UserGroup/edit/KiranGroup");
	return new GroupEditPage().isGroupEditPageLoaded();
}

public KiranPage navigateToKiranPage() throws AWTException
{
	elmAgentPopUp.click();
	WebDriverFactory.getdr().get("https://x5adminw.ytel.com/DB/UserGroup/edit/KiranGroup");
	return new KiranPage().isKiranPageLoaded();
}

}
