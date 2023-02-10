Feature: Leaftaps Delete Lead

Background:
Given Load the Chrome browser
And Navigate to the url 'http://leaftaps.com/opentaps/'
And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on LogIn button
And Click on CRM/SFA

Scenario Outline: Delete Existing Lead
When Click on Leads
And Click on Find Leads
And Click on Phone tab
Given Area Code as <areaCode>
And Phone number <phoneNumber>
When Click on Find Leads button 
Given Get first occarance of the Lead ID and click
When Click Delete
And Click on Find Leads
Given Enter the LeadID from the first occurance of the Lead ID captured
When Click on Find Leads button 
Then No record found displayed

Examples:
|areaCode|phoneNumber|
|'123'|'1111'|
|'123'|'2222'|
