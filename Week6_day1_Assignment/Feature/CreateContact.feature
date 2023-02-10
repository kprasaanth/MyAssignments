Feature: Leaftaps Create Lead

Background:
Given Load the Chrome browser
And Navigate to the url 'http://leaftaps.com/opentaps/'
And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on LogIn button
And Click on CRM/SFA

Scenario Outline: Create Contact with Mandatory information
When Click Contacts 
And Click Create Lead
Given Enter Firstname <FirstName>
And Enter Lastname <LastName>
And Enter FirstLocalname <FirstLocalName>
And Enter SecondLocalname <SecondLocalName>
And Enter DepartmentName <DepartmentName>
And Enter Description <Description>
And Enter Email <Email>
And Enter PhoneAreaCode <PhoneAreaCode>
And Enter PhoneNumber <PhoneNumber>
And Select Country
When Click Submit
Then Lead Created Successfully

Examples:
|FirstName|LastName|FirstLocalName|SecondLocalName|DepartmentName|Description|Email|PhoneAreaCode|PhoneNumber|
|'FirstName1'|'Lastname1'|'FirstLocalName1'|'SecondLocalName1'|'DepartmentName1'|'Description1'|'abc@gmail.com'|'123'|'1111'|
|'FirstName2'|'Lastname2'|'FirstLocalName2'|'SecondLocalName2'|'DepartmentName2'|'Description2'|'def@gmail.com'|'123'|'2222'|

