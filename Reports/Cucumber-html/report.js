$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MercuryTours.feature");
formatter.feature({
  "line": 2,
  "name": "Sanity scenarios of MercuryTours",
  "description": "",
  "id": "sanity-scenarios-of-mercurytours",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SanityScenarioOfMercuryToursPage"
    }
  ]
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 4,
      "value": "#MercuryTours SignUp using iterations"
    }
  ],
  "line": 6,
  "name": "Testing the mercurytours signup page using iterations",
  "description": "",
  "id": "sanity-scenarios-of-mercurytours;testing-the-mercurytours-signup-page-using-iterations",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@SignUpusingIterations"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I open \"Chrome\" and provided url for signup",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I provided details for signUp in \"\u003citeration\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I clicked on SignIn Button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Useraccount should be created successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I captured screenshot with screenname as \"\u003citeration\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I closed the browser",
  "keyword": "And "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "sanity-scenarios-of-mercurytours;testing-the-mercurytours-signup-page-using-iterations;",
  "rows": [
    {
      "cells": [
        "iteration"
      ],
      "line": 15,
      "id": "sanity-scenarios-of-mercurytours;testing-the-mercurytours-signup-page-using-iterations;;1"
    },
    {
      "cells": [
        "1"
      ],
      "line": 16,
      "id": "sanity-scenarios-of-mercurytours;testing-the-mercurytours-signup-page-using-iterations;;2"
    },
    {
      "cells": [
        "2"
      ],
      "line": 17,
      "id": "sanity-scenarios-of-mercurytours;testing-the-mercurytours-signup-page-using-iterations;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 16,
  "name": "Testing the mercurytours signup page using iterations",
  "description": "",
  "id": "sanity-scenarios-of-mercurytours;testing-the-mercurytours-signup-page-using-iterations;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@SignUpusingIterations"
    },
    {
      "line": 1,
      "name": "@SanityScenarioOfMercuryToursPage"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I open \"Chrome\" and provided url for signup",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I provided details for signUp in \"1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I clicked on SignIn Button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Useraccount should be created successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I captured screenshot with screenname as \"1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I closed the browser",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Chrome",
      "offset": 8
    }
  ],
  "location": "MercuryToursSanitySteps.i_open_and_provided_url_for_signup(String)"
});
formatter.result({
  "duration": 6031607641,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 34
    }
  ],
  "location": "MercuryToursSanitySteps.i_provided_details_for_signUp_in(int)"
});
formatter.result({
  "duration": 4075300987,
  "status": "passed"
});
formatter.match({
  "location": "MercuryToursSanitySteps.i_clicked_on_SignIn_Button()"
});
formatter.result({
  "duration": 235851,
  "status": "passed"
});
formatter.match({
  "location": "MercuryToursSanitySteps.useraccount_should_be_created_successfully()"
});
formatter.result({
  "duration": 160395,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 42
    }
  ],
  "location": "MercuryToursSanitySteps.i_captured_screenshot_with_screenname_as(String)"
});
formatter.result({
  "duration": 529522312,
  "status": "passed"
});
formatter.match({
  "location": "FacebookSanitySteps.i_closed_the_browser()"
});
formatter.result({
  "duration": 37093457,
  "error_message": "java.lang.NullPointerException\r\n\tat Steps.FacebookSanitySteps.i_closed_the_browser(FacebookSanitySteps.java:91)\r\n\tat ✽.And I closed the browser(MercuryTours.feature:12)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 17,
  "name": "Testing the mercurytours signup page using iterations",
  "description": "",
  "id": "sanity-scenarios-of-mercurytours;testing-the-mercurytours-signup-page-using-iterations;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@SignUpusingIterations"
    },
    {
      "line": 1,
      "name": "@SanityScenarioOfMercuryToursPage"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I open \"Chrome\" and provided url for signup",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I provided details for signUp in \"2\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I clicked on SignIn Button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Useraccount should be created successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I captured screenshot with screenname as \"2\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I closed the browser",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Chrome",
      "offset": 8
    }
  ],
  "location": "MercuryToursSanitySteps.i_open_and_provided_url_for_signup(String)"
});
formatter.result({
  "duration": 4857776083,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 34
    }
  ],
  "location": "MercuryToursSanitySteps.i_provided_details_for_signUp_in(int)"
});
formatter.result({
  "duration": 3453598314,
  "status": "passed"
});
formatter.match({
  "location": "MercuryToursSanitySteps.i_clicked_on_SignIn_Button()"
});
formatter.result({
  "duration": 201481,
  "status": "passed"
});
formatter.match({
  "location": "MercuryToursSanitySteps.useraccount_should_be_created_successfully()"
});
formatter.result({
  "duration": 166321,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 42
    }
  ],
  "location": "MercuryToursSanitySteps.i_captured_screenshot_with_screenname_as(String)"
});
formatter.result({
  "duration": 489302342,
  "status": "passed"
});
formatter.match({
  "location": "FacebookSanitySteps.i_closed_the_browser()"
});
formatter.result({
  "duration": 42724657,
  "error_message": "java.lang.NullPointerException\r\n\tat Steps.FacebookSanitySteps.i_closed_the_browser(FacebookSanitySteps.java:91)\r\n\tat ✽.And I closed the browser(MercuryTours.feature:12)\r\n",
  "status": "failed"
});
});