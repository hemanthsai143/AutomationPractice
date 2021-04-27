package com.pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	

	public WebDriver driver;
	
	public LandingPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		}
	
	
	@FindBy(xpath="//div[@class='header_user_info']//a[@title='Log in to your customer account']")
	WebElement signinbutton;
	
	@FindBy(xpath="//input[@id='email_create']")
	WebElement newUserEmail;
	
	
	@FindBy(xpath="//button[@id='SubmitCreate']")
	WebElement createAccount;
	
	
	@FindBy(xpath="//input[@id='email']")
	WebElement userEmail;
	
	
	@FindBy(xpath="//input[@id='passwd']")
	WebElement password;
	
	
	@FindBy(xpath="//*[@id='SubmitLogin']/span")
	WebElement signin;
	
	
	
	
	public void landingpageSignin()
	{
		signinbutton.click();
	}
	
	public void createaccount(String email) throws InterruptedException
	{
		Thread.sleep(3000);
	    scrolldown();
	    newUserEmail.sendKeys(email);
	    createAccount.click();
	    
	    
	}
	
	public void userLogin(String email,String pwd) throws InterruptedException
	{
		
		Thread.sleep(3000);
		scrolldown();
		userEmail.sendKeys(email);
		password.sendKeys(pwd);
		signin.click();
		
	    
	}
	
	public void scrolldown()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)", "");
		
	}
	}
