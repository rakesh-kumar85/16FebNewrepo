Feature: Display userid with login date

  Scenario: Verify user is getting latest version of application
    Given User is having application id and date
     When Enter the app id and date
          |12345|05122019|
    Then verify it displays latest version of app.

  Scenario: verify user is getting all the versions of app when providing date
    Given user is having date
     When Enter the date
     ||05122019|
    Then verify user is getting all the versions of Application with date
    Then user enter the value "Rakesh$kumar@"
