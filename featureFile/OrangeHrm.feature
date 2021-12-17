Feature: Test login functionality of Orange HRM
# Feature = Number of scenarios ---> scenario = Number of steps

Scenario:Test login fuctionality with valid username with valid password

Given as a user we launch the particular url "https://opensource-demo.orangehrmlive.com/"
When as a user we send the username "Admin" and password "admin123"
And as a user we click the login button
Then as a user we verifies title and url of the Orange HRM

