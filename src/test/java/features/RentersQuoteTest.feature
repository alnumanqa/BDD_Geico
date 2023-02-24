Feature: Title of your feature

  Background: 
    *This is Renters Quote Test


  @renters 
  Scenario: Creating Renters Quote
    Given validate homePage title
    And insert zipcode '14215'
    When click go button
    Then select renters LOB
    When click start my quote
    Given validate renters about you page title
    And insert first name 'Al'
    And insert last name 'Numan'
    Then insert date of birth '02271993'
