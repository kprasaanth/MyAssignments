Feature: Leaftaps Edit Lead

Background: 
Given Load the Chrome browser
And Navigate to the url 'http://leaftaps.com/opentaps/'
And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on LogIn button
And Click on CRM/SFA

Scenario Outline: Edit Lead with updated information
When Click on Leads
And Click on Find Leads
Given Enter FirstName as <FirstName>
When Click on Find Leads button 
And Click on First Occurance of the list <FirstName>
And Click on Edit
Given update the Company name as <CompanyName>
When Click on update
Then Company name updated successfully

Examples:
|FirstName|CompanyName|
|'Srinivasan'|'ABC'|
|'Vinothini'|'ABC'|
