Feature: Home Loan calculator
 
  @test
  Scenario:Verify user is able to estimate loan by using loan calculator in ANZ portal.
    Given user launches the browser with base url.
    When user enters all the details for estimation.
    |Application type|Dependents|PropertyType|AnnualIncome|Otherincome|monthlylivingExpenses|homeloan|otherloan|monthlycommitments|totalcreditlimits|
    |Single          |0         |Home        |80,000      |10,000     | 500                 |0        |100     |0                 |10,000                  |
    And click on borrow button
    Then validate borrowing estimated amount.
    |amount|
    |$482,000|
    And user clicks on startover button.



   
      
   @test
   Scenario:Verify user should be able to see the releavant error message when required fields are not given.
   Given user launches the browser with base url.
   When user enters living expenses fields by leaving all the other fields.
    |monthlylivingExpenses|
    |1 |
    And click on borrow button
    Then verify releavant message is displaying on the screen.
    |Message|
    |Based on the details you've entered, we're unable to give you an estimate of your borrowing power with this calculator. For questions, call us on 1800 035 500.|
   
   
    
    
    
    

  