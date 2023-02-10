Feature: Create new Opportunity
@functional @sanity @smoke @regression
Scenario Outline: Create new Opportunity with Mandatory details
When click on Sales
And click on Opportunities  
And click on New Opportunities 
Given Enter Opportunity name as <OpportunityName>
And choose date <date>
And Select Stage as Need Analysis
When click on Save button
And validate the newly created Opportunity
Then Opportunity created Successfully

Examples:
|OpportunityName|date|
|'Salesforce Automation by Prasaanth'|'02/10/2023'|
|'Salesforce Automation by Kumar'|'03/10/2023'|