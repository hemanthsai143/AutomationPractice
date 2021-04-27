Feature: New User Registration and placing order

@test
Scenario Outline: Verify new user is able to register in automation practice website successfully
 Given user launches the browser with base url and clicks on signin button
 When user enters "<emailaddress>" and click on create account button
 And user enters all the details for registration
|firstName|lastName|password|day|month|year|address|city|state|postcode|country|phone|
 |Hemanth|Sai|Hemanth@89|23|3 |1996|Arrow Highway|Los Angeles|California|00000|United States|94444421|
 Then validate user registration is successful or not.
 |firstName|lastName|
 |Hemanth|Sai|
 And logout from the application.

Examples:

|baseurl                                |emailaddress|
|http://automationpractice.com/index.php|lambzzuy123@gmail.com|

@test
Scenario Outline: Verify registered user is able to place order in automation practice website successfully
 Given user launches the browser with base url and clicks on signin button
 When user enters "<emailaddress>" and "<password>" and click on signin button
 And place order by selecting the "<category>" and "<product>"
 Then verify "<product>" details are correct in the payment page.
 
Examples:

|baseurl                                |emailaddress        |password|category|product|
|http://automationpractice.com/index.php|lambzzuy123@gmail.com|Hemanth@89|Women|Faded Short Sleeve T-shirts|