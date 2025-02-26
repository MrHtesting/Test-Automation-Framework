Feature: API Feature

  @API_Test1 @Regression
  Scenario: Verify Oldest person API
    When User sends GET request to "https://whoistheoldest.com/api/oldest-person-ever" and see status code is 200
