@SanityScenarioOfMercuryToursPage
Feature: Sanity scenarios of MercuryTours

  #MercuryTours SignUp using iterations
  @SignUpusingIterations
  Scenario Outline: Testing the mercurytours signup page using iterations
    Given I open "Chrome" and provided url for signup
    And I provided details for signUp in "<iteration>"
    When I clicked on SignIn Button
    Then Useraccount should be created successfully
    And I captured screenshot with screenname as "<iteration>"
    And I closed the browser

    Examples: 
      | iteration |
      |         1 |
      |         2 |
