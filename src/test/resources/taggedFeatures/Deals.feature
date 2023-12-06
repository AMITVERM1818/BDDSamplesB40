@PhaseTwo
Feature: Deals CRUD Management

@SmokeTest
Scenario: Create a new Deal
Given User is logged in
When User creates a new Deal

@RegressionTest
Scenario: View a Deal
Given User is logged in
When User views Deal details

@RegressionTest @SmokeTest
Scenario: Deletes a Deal
Given User is logged in
When User deletes a Deal