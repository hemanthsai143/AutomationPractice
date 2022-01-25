$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/com/features/Homeloancalculator.feature");
formatter.feature({
  "name": "Home Loan calculator",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify user is able to estimate loan by using loan calculator in ANZ portal.",
  "description": "",
  "keyword": "Scenario",
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
  "name": "user launches the browser with base url.",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.Stepdefinitions.user_launches_the_browser_with_base_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters all the details for estimation.",
  "rows": [
    {},
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.Stepdefinitions.user_enters_all_the_details_for_estimation(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on borrow button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.Stepdefinitions.click_on_borrow_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate borrowing estimated amount.",
  "rows": [
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.Stepdefinitions.validate_borrowing_estimated_amount(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on startover button.",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.Stepdefinitions.user_clicks_on_startover_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters living expenses fields by leaving all the other fields.",
  "rows": [
    {},
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.Stepdefinitions.user_enters_living_expenses_fields_by_leaving_all_the_other_fields(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on borrow button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.Stepdefinitions.click_on_borrow_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify releavant message is displaying on the screen.",
  "rows": [
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.Stepdefinitions.verify_releavant_message_is_displaying_on_the_screen(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});