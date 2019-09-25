package com.ycc.common;

import org.openqa.selenium.WebDriver;

public class WebDriverFactory {
public static ThreadLocal<WebDriver> tl = new ThreadLocal<WebDriver>();
public static ThreadLocal<String> tl2 = new ThreadLocal<String>();

public static void setdr (WebDriver dr)
	{
		tl.set(dr);
	}

public static WebDriver getdr ()
	{
		return tl.get();
	}


public static void setCampaign(String campaign )
{
	tl2.set(campaign);
}

public static String getCampaign()
{
	return tl2.get();
}
}


