package com.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class UserProfilePage {
	
	
	
	public WebDriver driver;
	public UserProfilePage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//*[@id='SubmitLogin']/span)]")
	WebElement LandSignin;
	
	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	WebElement Signin;
	
	@FindBy(xpath="//input[@id='email_create']")
	WebElement Email;
	@FindBy(xpath="//div[@id='create_account_error']")
	WebElement emailpopup;
	
	@FindBy(xpath="//button[@id='SubmitCreate']")
	WebElement clickbutton;
	
	@FindBy(xpath="//input[@id='id_gender1']")
	WebElement Title_Mr;
	
	@FindBy(xpath="//input[@id='id_gender2']")
	WebElement Title_Mrs;
	
	@FindBy(xpath="//input[@id='customer_firstname']")
	WebElement Firstname;
	
	@FindBy(xpath="//input[@id='customer_lastname']")
	WebElement Lastname;
	
	@FindBy(xpath="//input[@id='passwd']")
	WebElement Password;
	
	@FindBy(xpath="//select[@id='days']")
	WebElement Day;
	
	@FindBy(xpath="//select[@id='months']")
	WebElement Month;
	
	@FindBy(xpath="//select[@id='years']")
	WebElement Year;
	
	@FindBy(xpath="//input[@id='newsletter']")
	WebElement Sing_up_for_newsletter;
	
	@FindBy(xpath="//input[@id='optin']")
	WebElement Receive_special_offers_from_our_partners;
	
	@FindBy(xpath="//input[@id='company']")
	WebElement company;
	
	@FindBy(xpath="//input[@id='address1']")
	WebElement address;
	
	@FindBy(xpath="//input[@id='city']")
	WebElement city;
	
	@FindBy(xpath="//select[@id='id_state']")
	WebElement state;
	
	@FindBy(xpath="//input[@id='postcode']")
	WebElement postcode;
	
	@FindBy(xpath="//select[@id='id_country']")
	WebElement country;
	
	@FindBy(xpath="//textarea[@id='other']")
	WebElement Additional_information;
	
	@FindBy(xpath="//input[@id='phone']")
	WebElement Homephone;
	
	@FindBy(xpath="//input[@id='phone_mobile']")
	WebElement Mobilephone;
	
	@FindBy(xpath="//input[@id='alias']")
	WebElement Assign_an_address;
	
	@FindBy(xpath="//*[text()='Register']")
	WebElement Register;
	
	@FindBy(xpath="//*[@class='header_user_info']/a/span")
	WebElement userinfo;
	
	@FindBy(xpath="//*[@class='header_user_info']//*[@class='logout']")
	WebElement logout;
	
	
	
	
	
	
	public void setUserdata(String name,String lastname,String pass,String day,String month,String year) throws InterruptedException
	{
		//LandSignin.click();
		Thread.sleep(3000);
		Title_Mr.click();
		Firstname.sendKeys(name);
		Lastname.sendKeys(lastname);
		Password.sendKeys(pass);
		Day.click();
		Select s=new Select(Day);
		s.selectByValue(day);
		Month.click();
		Select s1=new Select(Month);

		s1.selectByIndex(Integer.parseInt(month));
		Year.click();
		Select s2=new Select(Year);
		s2.selectByValue(year);
		Sing_up_for_newsletter.click();
		Receive_special_offers_from_our_partners.click();
		
		
		
	}	
	public void setUseraddress(String addr,String city1,String state1,String zipcode,String county1,String moph) 
	{
		
		address.sendKeys(addr);
		city.sendKeys(city1);
		state.click();
		Select s1=new Select(state);
		s1.selectByVisibleText(state1);
		postcode.sendKeys(zipcode);
		country.click();
		Select s2=new Select(country);
		s2.selectByVisibleText(county1);
		Additional_information.sendKeys("xyzz");
		Mobilephone.sendKeys(moph);
		
		
	}
	public void click_on_register()
	{
		Register.click();
	}
	
	public void validateUserinfo(String fname,String lastname) throws InterruptedException
	{
		Thread.sleep(3000);
		String name[]=userinfo.getText().split("\\s");
		Assert.assertTrue("user details are incorrect",fname.equalsIgnoreCase(name[0]));
		Assert.assertTrue("user details are incorrect",lastname.equalsIgnoreCase(name[1]));
		
	
		
		
		
	}
	
	public void logout()
	{
		logout.click();
	}
	

}
