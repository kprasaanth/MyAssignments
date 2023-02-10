Feature: Leaftaps Duplicate Lead

Background:
Given Load the Chrome browser
And Navigate to the url 'http://leaftaps.com/opentaps/'
And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on LogIn button
And Click on CRM/SFA

Scenario Outline: Perform Duplicate operation.
When Click on Leads
And Click on Find Leads
And Click on Email
Given Enter mail ID as <mailID>
When Click on Find Leads button 
Given Get the name of the First Occurance of the list obtained and print it
When Click on First Occurance of the list obtained
And Click on Duplicate Lead 
And Verify the title of Duplicate Lead
When Click on Create lead button
And Verify the name of First name with the First occurance of the list obtained

Examples:
|mailID|
|'abc@gmail.com'|
|'def@gmail.com'|
