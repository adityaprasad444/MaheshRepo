@SanityScenarioOfFacebook
Feature: Sanity scenarios of facebook

  # This scenario is used to create new account in facebook using excel as data provider
  @FacebookSignupusingExcel
  Scenario Outline: Facebook signup with multiple user details
    Given I open "Chrome" and provided the url
    And I provided the details required for signup in "<iteration>"
    When I click on Create Account button
    Then Facebook account should be created successfully
    Then I closed the browser
    Examples:
    |iteration|
    |1|
    |2| 
 

  # This scenario is used to create new accounts in facebook by passing data in scenario
  @FacebookSignUpUsingExamples
  Scenario Outline: Facebook signup with multiple user details using Examples
    Given I open "<Browser>" and provided the url
    And I provided the details required for signup "<FirstName>" and "<SurName>" and "<MobileNum>" and "<NewPassword>" and "<Dob>" and "<Gender>"
    When I click on Create Account button
    Then Facebook account should be created successfully
    Then I closed the browser

    Examples: 
      | Browser | FirstName | SurName | MobileNum  | NewPassword | Dob        | Gender |
      | Chrome  | Mahesh    | Nuk     | 4567896543 | Qwerty123   | 15-02-1991 | Male   |
      | Firefox | Jessi     | Paul    | 3457890987 | Qwerty5678  | 14-02-1991 | Female |

  #This scenario is used to test the multiple logins in facebook by passing data in scenario itself
  @MultipleloginswithExcel
  Scenario Outline: Testing facebook with multiple users
    Given I open "Chrome" and provided the url
    And I provided the "<Username>" and "<Password>"
    When I click on SignIn button
    Then I should be able to login successfully
    Then I closed the browser

    Examples: 
      | Username               | Password |
      | maheshnukala@gmail.com | Pass123  |
