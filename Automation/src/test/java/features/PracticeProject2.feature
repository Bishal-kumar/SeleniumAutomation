Feature: Application Login

@RahulShettyLogin
Scenario Outline: Validate that user is successfully logged in after entering valid credentials in rahul sheety url.
Given User launches "<url>" website
When User enters valid userid "<userid>" , password "<password>" in rahul shetty login page.
And Clicks on Signon button
Then User is logged in successfully
And Close Selenium webdriver.

Examples:
|url|userid|password|
|https://sso.teachable.com/secure/9521/users/sign_in?clean_login=true&reset_purchase_session=1|bishal.darkfantasy@gmail.com|Bish@l2021|

@RadioButtonValidation
Scenario Outline: Validate that user has selected radion button2 successfully.
Given User launches "<url>" website
When User clicks on radio button two
Then User has selected radion button two successfully.
And Close Selenium webdriver.

Examples:
|url|
|https://rahulshettyacademy.com/AutomationPractice/|

@SuggestionsTextBoxExample
Scenario Outline: Validate that user has entered text in suggestions text box.
Given User launches "<url>" website
When User clicks on suggestions text box and enters text
Then text is entered successfully in suggestions text box
And Close Selenium webdriver.

Examples:
|url|
|https://rahulshettyacademy.com/AutomationPractice/|
