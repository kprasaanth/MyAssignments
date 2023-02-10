Feature: Create Accounts  
@functional @sanity @smoke @regression
Scenario Outline: Create Accounts with Mandatory details
When click on Sales
And click on Accounts
When click on New 
Given Enter Account name as <name>
And select Ownership as Public
When click on Save button
And verify the Account created 

Examples:
|name|
|'Prasaanth'|






