package com.ycc.common;

import org.openqa.selenium.WebDriver;

public class WebDriverFactory {
public static ThreadLocal<WebDriver> tl = new ThreadLocal<WebDriver>();

public static void setdr (WebDriver dr)
	{
		tl.set(dr);
	}

public static WebDriver getdr ()
	{
		return tl.get();
	}
}
