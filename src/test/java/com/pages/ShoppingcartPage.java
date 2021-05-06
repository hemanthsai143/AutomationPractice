package com.pages;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ShoppingcartPage {
	
	
	public WebDriver driver;
	public ShoppingcartPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	WebDriverWait w;
	
	
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
	
	@FindBy(xpath="//*[@id='order_step']/li[1]/span")
	WebElement ordercheckoutPage;
	
	
	
	
	
	
	public void selectCategory(String category) throws InterruptedException
	{
		
       
		driver.findElement(By.xpath("//*[text()='"+category+"']")).click();
		
	}
	
	public void selectItem(String item) throws InterruptedException
	{
		w=new WebDriverWait(driver, 5);
		w.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(By.xpath("//div[@class='product-image-container']//a[@title='"+item+"']"))));

		driver.findElement(By.xpath("//div[@class='product-image-container']//a[@title='"+item+"']")).click();
		
	}
	
	public void addtoCart() throws InterruptedException
	{
		w=new WebDriverWait(driver, 8);
		w.until(ExpectedConditions.visibilityOfAllElements(addtoCart));
		addtoCart.click();
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
		w=new WebDriverWait(driver, 3);
		w.until(ExpectedConditions.visibilityOfAllElements(checkout));

		checkout.click();
		
		}
	
	public void checkoutshippingPage() throws InterruptedException
	{
		checkoutshippingPage.click();
		
		
		}
	
	public void finalcheckout() throws InterruptedException
	{
		

		finalcheckout.click();
		
		
	}
	
	public void paymentsPageCheckout() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
       switchtoframe();
		scrolldown();
		addtoCart();
		switchtodefaultContent();
		checkout();
		
		w=new WebDriverWait(driver, 5);
		w.until(ExpectedConditions.visibilityOfAllElements(ordercheckoutPage));
		scrolldownbottom();
		finalcheckout();
		scrolldownbottom();
		finalcheckout();
		scrolldown();
		
		w.until(ExpectedConditions.visibilityOfAllElements(checkoutshippingPage));
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
		w=new WebDriverWait(driver, 3);
		w.until(ExpectedConditions.visibilityOfAllElements(cartSummary));
		
		Assert.assertTrue("order details are incorrect",productname.equalsIgnoreCase(cartSummary.getText()));
	}
	
}
