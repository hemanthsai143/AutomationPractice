package stepdefinitions;


import java.io.IOException;
import java.util.List;
import java.util.Properties;



import org.openqa.selenium.WebDriver;


import com.pages.LoanestimationPage;

import com.utils.Base;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinitions extends Base{
	
	 
		public static WebDriver driver;
		public static  Properties p;
		LoanestimationPage loanestimationPage;
	
	
	@Before
	public void initServices() throws IOException
	{
		driver=initlializeDriver();
		
	      p= loadProperties();
	     loanestimationPage=new LoanestimationPage(driver);

	 }
	
	@Given("user launches the browser with base url.")
	public void user_launches_the_browser_with_base_url() {
		  driver.get(p.getProperty("url"));
		  driver.manage().window().maximize();

	}
	
	
	@When("user enters all the details for estimation.")
	public void user_enters_all_the_details_for_estimation(DataTable userDetails) {
		List<List<String>> data=userDetails.asLists();
		String applicationType=data.get(1).get(0);
		loanestimationPage.singleapplicationtype(applicationType);
        String numberofdependants=data.get(1).get(1);
        loanestimationPage.selectnumberofdependants(numberofdependants);
        String propertytype=data.get(1).get(2);
        loanestimationPage.selectpropertytype(propertytype);
        String annualincome=data.get(1).get(3);
        String otherincome=data.get(1).get(4);
        loanestimationPage.enterearningdetails(annualincome, otherincome);
        String monthlylivingExpenses=data.get(1).get(5);
        String homeloan=data.get(1).get(6);
        String otherloan=data.get(1).get(7);
        String monthlycommitments=data.get(1).get(8);
        String totalcreditlimits=data.get(1).get(9);
        loanestimationPage.enterexpensesDetails(monthlylivingExpenses, homeloan, otherloan, monthlycommitments, totalcreditlimits);



		 }
	
	@Then("click on borrow button")
	public void click_on_borrow_button() {		
		loanestimationPage.clickonborrowbutton();
	}

	@Then("validate borrowing estimated amount.")
	public void validate_borrowing_estimated_amount(DataTable amount ) {
		List<List<String>> amountDetails=amount.asLists();
		String actualAmount=amountDetails.get(1).get(0);
		loanestimationPage.validateEstimation(actualAmount);
		

	}
	
	@Then("user clicks on startover button.")
	public void user_clicks_on_startover_button() {
		loanestimationPage.clickonstartoverbutton();
	}

	
	@When("user enters living expenses fields by leaving all the other fields.")
	public void user_enters_living_expenses_fields_by_leaving_all_the_other_fields(DataTable requiredexpenses) {
		List<List<String>> data=requiredexpenses.asLists();
		String livingexpense=data.get(1).get(0);
		loanestimationPage.enterrequiredExpenses(livingexpense);
		

		
	}

	

	@Then("verify releavant message is displaying on the screen.")
	public void verify_releavant_message_is_displaying_on_the_screen(DataTable messageDetails) {
		List<List<String>> msg=messageDetails.asLists();
		String requiredmessage=msg.get(1).get(0);
        loanestimationPage.validateMessage(requiredmessage);
		
	}

   @After
   public void closebrowser()
   {
	   driver.close();
   }
	
	
}
