Feature: Create Individuals  
@functional @sanity @smoke @regression
Scenario Outline: Create Individuals with Mandatory details
When click on Individuals
And click on New individuals 
Given Enter Last name as <name>
When click on save button
And Verify the new individual created 

Examples:
|name|
|'Kumar'|








