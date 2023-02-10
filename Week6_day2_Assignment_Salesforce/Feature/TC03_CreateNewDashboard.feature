Feature: Create New Dashboard 
@functional @sanity @smoke @regression
Scenario Outline: Create New Dashboard with Mandatory details
When click on Dashboards 
And click on New Dashboards button 
Given Enter Name as <name>
When Click on Create button 
And Verify the Created Dashboard
 
Examples:
|name|
|'Prasaanth'|



