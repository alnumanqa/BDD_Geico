Feature: Login Page Testing

  Background: 
    * This is Login page Test

  @login @smoke
  Scenario: Create Login Page Test
    Given validate homePage title
    And click login button01
    When insert zipcode field '14215'
    And click login button02
    And input user id 'numan'
    And input user password '1234'
    Then click login button03

  @dataDriven @regression
  Scenario Outline: Login with <zipcode><userId><password>
    Given validate homePage title
    And click login button01
    When insert zipcode field <zipcode>
    When click login button02
    And input user id <userId>
    And input user password <password>
    Then click login button03

    Examples: 
      | zipcode | userId  | password |
      | '14215' | 'numan' | '1234'   |
      | '14211' | 'niyaz' | '4321'   |
      | '14225' | 'nazif' | '2133'   |
