$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel booking functionality for adactin application",
  "description": "",
  "id": "hotel-booking-functionality-for-adactin-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User enter username and password",
  "description": "",
  "id": "hotel-booking-functionality-for-adactin-application;user-enter-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters \"Karthikeyan112\" as username",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Users enters \"71X7NG\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User verify the valid username and valid password",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_launch_the_application()"
});
formatter.result({
  "duration": 91459389200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Karthikeyan112",
      "offset": 13
    }
  ],
  "location": "LoginStepDefinition.user_enters_as_username(String)"
});
