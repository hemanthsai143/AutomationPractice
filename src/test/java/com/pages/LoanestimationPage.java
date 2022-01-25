package com.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoanestimationPage {
	
	public WebDriver driver;
	

	public LoanestimationPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		}

	@FindBy(xpath="//input[@id='application_type_single']")
	WebElement applicationtypesingle;
	
	@FindBy(xpath="//input[@id='application_type_joint']")
	WebElement applicationtypejoint;
	
	@FindBy(xpath="//*[@title='Number of dependants']")
	WebElement numberofdependants;
	
	@FindBy(xpath="//input[@id='borrow_type_home']")
	WebElement hometypeproperty;
	
	@FindBy(xpath="//input[@id='borrow_type_investment']")
	WebElement investmenttypeproperty;
	
	@FindBy(xpath="//*[text()='Your annual income (before tax)']/../div/input")
	WebElement annualIncome;
	
	@FindBy(xpath="//*[text()='Your annual other income (optional)']/../div/input")
	WebElement  otherIncome;
	
	@FindBy(xpath="//*[text()='Monthly living expenses ']/../div/input")
	WebElement  monthlylivingExpenses;
	
	@FindBy(xpath="//*[@id='homeloans']")
	WebElement homeloan;
	
	@FindBy(xpath="//*[@id='otherloans']")
	WebElement otherloan;
	
	@FindBy(xpath="//*[text()='Other monthly commitments']/../div/input")
	WebElement monthlycommitments;


	@FindBy(xpath="//*[text()='Total credit card limits']/../div/input")
	WebElement totalcreditlimits;
	
	@FindBy(xpath="//*[@id='btnBorrowCalculater']")
	WebElement borrowbutton;
	
	@FindBy(xpath="//span[@class='borrow__result__text']")
	WebElement borrowresulttext;
    
	@FindBy(xpath="//div[@class='borrow__error__text']")
	WebElement borrowerrortext;

	
	@FindBy(xpath="//span[@id='borrowResultTextAmount']")
	WebElement amount;
	
	@FindBy(xpath="//*[@class='icon icon_restart']")
	WebElement restartbutton;


     
     WebDriverWait w;

	

     public void singleapplicationtype(String applicationtype)
	{
		if(applicationtype.contains("Single"))
		{
		applicationtypesingle.click();
		}
		else if (applicationtype.contains("Joint")){
			applicationtypejoint.click();
		}
	}
	
	
     public void selectnumberofdependants(String value)
     {
    	 
    	 Select s=new Select(numberofdependants);
    	 s.selectByVisibleText(value);
     }
  
     public void selectpropertytype(String propertytype)
     {
    	 if(propertytype.contains("Home"))
    	 {
    		 hometypeproperty.click();
    	 }
    	 
    	 else if (propertytype.contains("Investment")) {
    		 investmenttypeproperty.click();
			
		}
     }
      
     
     public void enterearningdetails(String annualincomeValue,String otherincomeValue)
     {
    	 annualIncome.sendKeys(annualincomeValue);
    	 otherIncome.sendKeys(otherincomeValue);
    	 
    	}
     
     
     public void enterexpensesDetails(String monthlyexpenses,String homeLoan,String otherLoan,String monthlyCommitments,String totalcreditlimit )
     {
    	 monthlylivingExpenses.sendKeys(monthlyexpenses);
    	 homeloan.sendKeys(homeLoan);
    	 otherloan.sendKeys(otherLoan);
    	monthlycommitments.sendKeys(monthlyCommitments);
    	totalcreditlimits.sendKeys(totalcreditlimit);
    	 
     }
     
     public void clickonborrowbutton()
     {
    	 borrowbutton.click();

     }
     
     public void clickonstartoverbutton()
     {
    	 restartbutton.click();

     }

     
     public void validateEstimation(String actualAmount)
     {
  		w=new WebDriverWait(driver, 10);
  		w.until(ExpectedConditions.attributeContains(borrowresulttext, "aria-live", "assertive"));
  		Assert.assertTrue(actualAmount.equalsIgnoreCase(amount.getText()));

    	 
     }
     
     public void enterrequiredExpenses(String expense)
     {
    	 monthlylivingExpenses.sendKeys(expense);
     }
     
     public void validateMessage(String requiredmessage)
     {
   		w=new WebDriverWait(driver, 10);
   		w.until(ExpectedConditions.attributeContains(borrowerrortext, "aria-live", "assertive"));
   		Assert.assertTrue(requiredmessage.equalsIgnoreCase(borrowerrortext.getText()));

    	 
     }
    
	
	
}
