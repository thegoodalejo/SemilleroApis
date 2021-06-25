#Author: julian.espitaleta@sophossolutions.com
Feature: Test GET API
  I want to test the GET endpoint of my API

  Scenario: Testing User GET API
    Given I want to test API "https://reqres.in/"
    When Send user id "2" to GET endpoint "api/users/"
    Then I should receive response code 200 and contains name "Janet" and last name "Weaver"

  #Scenario: Testing User POST API
  #  Given I want to test API "baseURL"
  #  When I send data to POST endpoint "endpointURL"
  #    | "email"    | "eve.holt@reqres.in" |
  #    | "password" | "cityslicka"         |
  #  Then I should reveive response code 200 and the response contains token "QpwL5tke4Pnpja7X4"
