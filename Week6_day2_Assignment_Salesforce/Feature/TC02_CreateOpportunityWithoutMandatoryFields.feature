Feature: Create new Opportunity
@functional @sanity @smoke @regression
Scenario Outline: Create Opportunity Without Mandatory Fields
When click on Sales
And click on Opportunities  
And click on New Opportunities  
And choose date <date>
When click on Save button
But Alert message displayed for Name and Stage

Examples:
|date|
|'02/14/2023'|
|'16/15/2023'|
