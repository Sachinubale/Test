Feature: Test Demo QA Form Page

Scenario Outline: Enter details in field on demo qa page

#Given I launch browser "CHROME" and navigate to the page having url "https://demoqa.com/automation-practice-form"

When I enter the first name value as "<firstName>"
And I enter the last name value as "<lastName>"
And I enter the email address as "<email>"
And I select 'male' radio button

Examples:

|firstName|lastName|email|
|Test 1   | Test last | ab.cd@gmail.com|
|Test 2   | Test last2 | ab2.cd@gmail.com|