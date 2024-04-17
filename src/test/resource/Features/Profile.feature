Feature: To test the profile module
Background:
Given User should be logged in


@profile
Scenario Outline: To validate profile and personal details
When User hovers on profile drop down in the menu bar
And User clicks on profile 
And User enters <name> and <email address>
And User clicks the link to verify email
And User clicks on the link to reset password
And User clicks on the toggle button
Then User clicks on save profile

Examples:
|name|email address|
|Deepika Ghildiyal|deepikaghildiyal2001@gmail.com|


@feedback
Scenario Outline: To validate that the user is able to give feedback
When User hovers on the profile button
And User clicks on dashboard dropdown 
And User clicks on the timeline button
And User clicks on Write a testimonial
And User writes <feedback>
Then User clicks on submit button to give feedback

Examples:
|feedback|
|amazing website with almost all localities covered|

@packersandmovers
Scenario Outline: To validate within city functionality of packers and movers
When user scrolls down the home page 
And user clicks on packers and movers option
And user scrolls down packers and movers page
And user selects city
And user searches the locality "<locality1>" and "<locality2>"
And user clicks on check prices button
Then user gets navigated to select pickup date and time

Examples:
|locality1|locality|
|Vik|Air|

@tenantdetails
Scenario: To validate tenant detail functionality of rental agreement section
When User is on menu drop down and clicks on rental agreement button
And clicks on rental agreements with adhaar
And clicks on tenant details option
And scrolls down to fill details and fills details
|22|123456789098|ABCDE1234F|Bluemen | 1701|17| Lokmanya Nagar|452009|Mumbai|Thane|Maharashtra|
And clicks on save and proceed
Then user gets navigated to next page of the form

@invalid
Scenario: User clicks on AboutUs
When user scroll down on home page
#And user clicks on terms and conditions option and redirects to career tab
And user comes back to home page and clicks on AboutUs option
Then user should redirect to AboutUs tab









