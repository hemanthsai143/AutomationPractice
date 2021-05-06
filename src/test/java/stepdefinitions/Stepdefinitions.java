package stepdefinitions;


import java.io.IOException;
import java.util.List;
import java.util.Properties;



import org.openqa.selenium.WebDriver;


import com.pages.LandingPage;
import com.pages.ShoppingcartPage;
import com.pages.UserProfilePage;

import com.utils.Base;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinitions extends Base{
	
	 
		public static WebDriver driver;
		public static  Properties p;
		LandingPage landingPage;
		UserProfilePage userProfilePage;
		ShoppingcartPage shoppingcartPage;
	
	
	@Before
	public void initServices() throws IOException
	{
		driver=initlializeDriver();
		
	      p= loadProperties();
	     landingPage=new LandingPage(driver);
	     userProfilePage=new UserProfilePage(driver);
	     shoppingcartPage=new ShoppingcartPage(driver);
	 }
	
	
	
	@Given("user launches the browser with base url and clicks on signin button")
	public void launchBrowser() {
		
			  driver.get(p.getProperty("url"));
			  driver.manage().window().maximize();
		      landingPage.landingpageSignin();
	   
	}
	
	
	@When("user enters {string} and click on create account button")
	public void user_enters_and_click_on_create_account_button(String newuserEmailid) throws InterruptedException {

		landingPage.createaccount(newuserEmailid);
		
	}
	
	
	@And("user enters all the details for registration")
	public void user_enters_all_the_details_for_registration(DataTable userDetails) throws InterruptedException {
		List<List<String>> data=userDetails.asLists();
		String firstname=data.get(1).get(0);
		String lastname=data.get(1).get(1);
		String pwd=data.get(1).get(2);
		String dd=data.get(1).get(3);
	    String mm=data.get(1).get(4).replaceAll("\\s","");
	    String yy=data.get(1).get(5);
	    String address=data.get(1).get(6);
	    String city=data.get(1).get(7);
	    String state=data.get(1).get(8);
	    String pincode=data.get(1).get(9);
	    String country=data.get(1).get(10);
	    String phone=data.get(1).get(11);
	    
	    
		userProfilePage.setUserdata(firstname,lastname,pwd,dd,mm,yy);
		userProfilePage.setUseraddress(address, city, state, pincode, country, phone);
		userProfilePage.click_on_register();
		
		}
	
	@When("user enters {string} and {string} and click on signin button")
	public void user_enters_and_and_click_on_signin_button(String emailaddress, String password) throws InterruptedException {
      landingPage.userLogin(emailaddress, password);
      
		
		}
	
	@When("place order by selecting the {string} and {string}")
	public void place_order_by_selecting_the_and(String category, String item) throws InterruptedException {
		shoppingcartPage.selectCategory(category);
		shoppingcartPage.scrolldown();
		shoppingcartPage.selectItem(item);
		shoppingcartPage.paymentsPageCheckout();
		}
	
	
	@Then("verify {string} details are correct in the payment page.")
	public void verify_details_are_correct_in_the_payment_page(String productname) {
		shoppingcartPage.verifyOrderdetails(productname);
	    
	}
	
	@Then("validate user registration is successful or not.")
	public void validate_user_registration_is_successful_or_not(DataTable userinfo) throws InterruptedException {
	    
		List<List<String>> data=userinfo.asLists();
		String fname=data.get(1).get(0);
		String lname=data.get(1).get(1);
		userProfilePage.validateUserinfo(fname, lname);
		}

	
	
	@And("logout from the application.")
	public void logout_from_the_application() {
	   userProfilePage.logout();
	  
	}
}
