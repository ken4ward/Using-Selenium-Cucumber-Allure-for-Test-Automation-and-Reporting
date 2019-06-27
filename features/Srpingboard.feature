@UATTesting
  Feature: Springboard page https://springboardretail.github.io/qa-recruiting/

      Scenario: Input Springboard github page
        Given I navigate to https://springboardretail.github.io/qa-recruiting/
        And I fill in firstname
        And I fill in lastname
        And I select  the country
        And I fill in the message
        And I click the submit button
        Then It should display the filled in details
