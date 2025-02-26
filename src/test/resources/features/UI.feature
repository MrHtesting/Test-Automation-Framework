Feature: UI Feature

  Background:
    Given User is on home Page

@UI_Test1 @Regression
  Scenario: Verify User can enter random string in Text Field
    When User enters random string in text field
    And User clicks submit button
    Then User should see "Form submitted" text is displayed

  @UI_Test2 @Regression
  Scenario Outline: Verify I select option from dropdown
    When User selects <Option Index> from dropdown
    And User clicks submit button
    Then User should see "Form submitted" text is displayed

    Examples:
      | Option Index |
      | 1            |
      | 2            |
      | 3            |

  @UI_Test3 @Regression
  Scenario: Verify Disable and read only field
    Then User can see that disabled field is "disabled"
    Then User can see that readonly field is "readonly"