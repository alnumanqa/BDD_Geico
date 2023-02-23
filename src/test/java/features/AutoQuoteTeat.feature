Feature: Auot Quote Testing

  Background: 
    * This is Auto Quote Test

  @auto @smoke
  Scenario: Creating Auto Quote Test
    Given validate homePage title
    And insert zipcode '14215'
    When click go button
    Then select auto LOB
    When click start my quote
    And click coutinue button
    Given validate about you page title
    Then insert date of birth '02271993'

  @dataDriven @regression
  Scenario Outline: Auto quote with<zipcode><dob>
    Given validate homePage title
    And insert zipcode <zipcode>
    When click go button
    Then select auto LOB
    When click start my quote
    And click coutinue button
    Given validate about you page title
    Then insert date of birth <dob>

    Examples: 
      | zipcode | dob        |
      | '14215' | '02241996' |
      | '14211' | '06241989' |
      | '14225' | '02241993' |
