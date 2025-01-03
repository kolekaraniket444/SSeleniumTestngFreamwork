Feature: Application login

Scenario Outline: Verify login with valid Data
Given initialize browser
When user opens the url "https://login.salesforce.com/?locale=in" 
And enter <username> and <password> and click on login button
Then user should be able to login suceesfuly

Examples:
|username|password|
|test1|secure12|
|test2|secure56|