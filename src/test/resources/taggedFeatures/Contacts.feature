@PhaseOne
Feature: Contacts CRUD Management

@SmokeTest
Scenario: Create a new Contact
Given User is on loginpage
When User creates a new Contact

@RegressionTest
Scenario: View a Contact
Given User is on loginpage
When User views Contact details

@RegressionTest @SmokeTest
Scenario: Deletes a Contact
Given User is on loginpage
When User deletes a Contact