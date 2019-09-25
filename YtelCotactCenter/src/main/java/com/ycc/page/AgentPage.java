package com.ycc.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ycc.common.WebDriverFactory;

public class AgentPage {
	
@FindBy (xpath="//input[@type='search']") WebElement elmSearchPage;
@FindBy (xpath="//body[@id='x5AdminApp']/div[1]/div[2]/div[3]/legend/div/a/i") WebElement elmCloneAgent;
@FindBy (xpath="//table[@id='table-1']") WebElement elmBaseTable;
@FindBy (xpath="//*[@id='table-1']/tbody/tr") WebElement elmsubTable;
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

public AgentPage verifyTable()
{
	 java.util.List<WebElement> tablerow = elmBaseTable.findElements(By.xpath("//*[@id='table-1']/tbody/tr"));
	 String beforexpath="//*[@id=\"table-1\"]/tbody/tr[";
	 String afterxpath="]/td[2]";
	 for (int i=1; i<=3;i++)
	 {
		String name= WebDriverFactory.getdr().findElement(By.xpath(beforexpath+i+afterxpath)).getText();
		 System.out.println(name);
		 if (name.contains("ytelindia"))
		 {
			 String beforexpath1="//*[@id=\"table-1\"]/tbody/tr[";
			 String afterxpath1="]/td[7]";
			 
			//*[@id="438"]/td[7]/a/span
			// WebDriverFactory.getdr().findElement(By.xpath("//*[@id=\\\"table-1\\\"]/tbody/tr["+ i + "]/td[7]/a/span")).click();
			WebDriverFactory.getdr().findElement(By.xpath(beforexpath1+i+afterxpath1)).click();

		 }

	 }
	 
	return this;
}
}