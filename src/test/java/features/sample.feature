Feature: Login Quote Testing

  @login
  Scenario: Create An Login Quote Test
    Given click login button01
    And insert zipcode field '14215'
    When click login button02
    And input user id 'numan'
    And input user password '1234'
    Then click login button03
