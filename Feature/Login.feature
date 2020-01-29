Feature: Login Action

 Scenario Outline: Successfull login with Valid Credentials
 Given User is on Home Page
 When User Navigate to Login page
 And  user enters "<username>" and "<password>"
 Then Message displayed Login Successfully
 
 Examples:
 | username  | password |
 | lalitha   | password123 |
 | admin     | password456 |