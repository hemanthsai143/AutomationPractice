package com.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public static WebDriver initlializeDriver() throws IOException
	{
		prop=loadProperties();
		
		String browserName=prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",prop.getProperty("chromedriverPath"));
			driver=new ChromeDriver();
			
			
		}
		else if(browserName.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.IE.driver", prop.getProperty("iebrowserPath"));
			driver=new InternetExplorerDriver();
		}
		
		return driver;
		
	}
	

	
	
	public static Properties loadProperties() throws IOException
	{
	prop=new Properties();
    String path=System.getProperty("user.dir");
	FileInputStream fis=new FileInputStream(path+"\\data.properties");
	prop.load(fis);
    return prop;
	}

}
