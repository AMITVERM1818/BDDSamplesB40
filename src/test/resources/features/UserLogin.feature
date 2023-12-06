Feature: User Login Function

#Case-1 - Passing Data directly in Step Def File
#Scenario: Valid Login
#Given User is on Login Page
#When User enters credentials
#Then Should display Success Msg

#Case-2 - Passing Data from Feature File
#Scenario: Valid Login
#Given User is on Login Page
#When User enters "tomsmith" and "SuperSecretPassword!"
#Then Should display Success Msg

#Case-3 - Running scripts for multiple set of Test Data(TDD Approach - Scenario Outline) using 'Examples' keyword
#Scenario Outline: Valid Login
#Given User is on Login Page
#When User enters "<username>" and "<password>"
#Then Should display Success Msg
#
#Examples: 
#	|	username	|	password	|
#	|	tomsmith	|	SuperSecretPassword!	|
#	|	tomsmith1	|	SuperSecretPassword123	|
#	|	tomsmith2	|	SuperSecretPassword123	|	
	
	
#Case-4 - Running scripts using Data Table - Passing Test Data in Test Steps(Data Table as Lists) - Feasible for small set of Test Data
#Scenario: Valid Login
#Given User is on Login Page
#When User enters credentials
#	|	tomsmith	|	SuperSecretPassword!	|
#Then Should display Success Msg


#Case-4 - Running scripts using Data Table - Passing Test Data in Test Steps(Data Table as Maps)- Feasible for large set of Test Data
Scenario: Valid Login
Given User is on Login Page
When User enters credentials
	|	username	|	password	|
	|	tomsmith	|	SuperSecretPassword!	|
Then Should display Success Msg
	





