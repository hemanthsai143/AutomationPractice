$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/com/features/RegistrationandShopping.feature");
formatter.feature({
  "name": "New User Registration and placing order",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify new user is able to register in automation practice website successfully",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "user launches the browser with base url and clicks on signin button",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters \"\u003cemailaddress\u003e\" and click on create account button",
  "keyword": "When "
});
formatter.step({
  "name": "user enters all the details for registration",
  "keyword": "And ",
  "rows": [
    {
      "cells": [
        "firstName",
        "lastName",
        "password",
        "day",
        "month",
        "year",
        "address",
        "city",
        "state",
        "postcode",
        "country",
        "phone"
      ]
    },
    {
      "cells": [
        "Hemanth",
        "Sai",
        "Hemanth@89",
        "23",
        "3",
        "1996",
        "Arrow Highway",
        "Los Angeles",
        "California",
        "00000",
        "United States",
        "94444421"
      ]
    }
  ]
});
formatter.step({
  "name": "validate user registration is successful or not.",
  "keyword": "Then ",
  "rows": [
    {
      "cells": [
        "firstName",
        "lastName"
      ]
    },
    {
      "cells": [
        "Hemanth",
        "Sai"
      ]
    }
  ]
});
formatter.step({
  "name": "logout from the application.",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "baseurl",
        "emailaddress"
      ]
    },
    {
      "cells": [
        "http://automationpractice.com/index.php",
        "kihhggd123@gmail.com"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify new user is able to register in automation practice website successfully",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launches the browser with base url and clicks on signin button",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.Stepdefinitions.launchBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"kihhggd123@gmail.com\" and click on create account button",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.Stepdefinitions.user_enters_and_click_on_create_account_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters all the details for registration",
  "rows": [
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.Stepdefinitions.user_enters_all_the_details_for_registration(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate user registration is successful or not.",
  "rows": [
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.Stepdefinitions.validate_user_registration_is_successful_or_not(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "logout from the application.",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.Stepdefinitions.logout_from_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verify registered user is able to place order in automation practice website successfully",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "user launches the browser with base url and clicks on signin button",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters \"\u003cemailaddress\u003e\" and \"\u003cpassword\u003e\" and click on signin button",
  "keyword": "When "
});
formatter.step({
  "name": "place order by selecting the \"\u003ccategory\u003e\" and \"\u003cproduct\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "verify \"\u003cproduct\u003e\" details are correct in the payment page.",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "baseurl",
        "emailaddress",
        "password",
        "category",
        "product"
      ]
    },
    {
      "cells": [
        "http://automationpractice.com/index.php",
        "Hemanth11@gmail.com",
        "Hemanth@55",
        "Women",
        "Faded Short Sleeve T-shirts"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify registered user is able to place order in automation practice website successfully",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launches the browser with base url and clicks on signin button",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.Stepdefinitions.launchBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"Hemanth11@gmail.com\" and \"Hemanth@55\" and click on signin button",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.Stepdefinitions.user_enters_and_and_click_on_signin_button(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "place order by selecting the \"Women\" and \"Faded Short Sleeve T-shirts\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.Stepdefinitions.place_order_by_selecting_the_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify \"Faded Short Sleeve T-shirts\" details are correct in the payment page.",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.Stepdefinitions.verify_details_are_correct_in_the_payment_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});