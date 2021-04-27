package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ShoppingcartPage {
	
	
	public WebDriver driver;
	public ShoppingcartPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	@FindBy(xpath="//*[text()='Add to cart']")
	WebElement addtoCart;
	
	@FindBy(xpath="//*[@title='Proceed to checkout']")
	WebElement checkout;
	
	@FindBy(xpath="//*[text()='Proceed to checkout']")
	WebElement finalcheckout;
	
	@FindBy(xpath="//*[@id='form']/p/button/span")
	WebElement checkoutshippingPage;
	
	@FindBy(xpath="//*[@id='cgv']")
	WebElement termsandconditionsButton;
	
	@FindBy(xpath="//table[@id='cart_summary']/tbody/tr/td[2]/p/a")
	WebElement cartSummary;
	
	
	
	
	
	public void selectCategory(String category) throws InterruptedException
	{
		

		driver.findElement(By.xpath("//*[text()='"+category+"']")).click();
		Thread.sleep(3000);
	}
	
	public void selectItem(String item) throws InterruptedException
	{
		

		driver.findElement(By.xpath("//div[@class='product-image-container']//a[@title='"+item+"']")).click();
		Thread.sleep(8000);
	}
	
	public void addtoCart() throws InterruptedException
	{
		addtoCart.click();
		Thread.sleep(3000);
	}
	
	public void switchtoframe()
	{
		driver.switchTo().frame(0);
	}
	
	public void switchtodefaultContent()
	{
		driver.switchTo().defaultContent();
	}
	
	public void checkout() throws InterruptedException
	{
		

		checkout.click();
		Thread.sleep(3000);
		}
	
	public void checkoutshippingPage() throws InterruptedException
	{
		checkoutshippingPage.click();
		Thread.sleep(3000);
		}
	
	public void finalcheckout() throws InterruptedException
	{
		

		finalcheckout.click();
		Thread.sleep(3000);
		
	}
	
	public void paymentsPageCheckout() throws InterruptedException
	{
       switchtoframe();
		scrolldown();
		addtoCart();
		switchtodefaultContent();
		checkout();
		Thread.sleep(5000);
		scrolldownbottom();
		finalcheckout();
		scrolldownbottom();
		finalcheckout();
		termsandconditionsButton.click();
		checkoutshippingPage();
		
	}
	
	
	
	
	public void scrolldown()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)", "");
	}
	public void scrolldownbottom()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)", "");
	}
	
	public void verifyOrderdetails(String productname)
	{
		System.out.println(cartSummary.getText());
		
		Assert.assertTrue("order details are incorrect",productname.equalsIgnoreCase(cartSummary.getText()));
	}
	
}
