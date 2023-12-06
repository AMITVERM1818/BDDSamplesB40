Feature: Tasks CRUD Management

@SmokeTest
Scenario: Create a new Task
Given User is logged in
When User creates a new Task

@RegressionTest
Scenario: View a Task
Given User is logged in
When User views Task details

@RegressionTest @SmokeTest
Scenario: Deletes a Task
Given User is logged in
When User deletes a Task

 