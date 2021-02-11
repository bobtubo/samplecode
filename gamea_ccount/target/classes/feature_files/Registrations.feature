Feature:
  As a new moneygaming.com player
  I want to be able to register using my full details
  So that I can play online casino games
@TestToRun
  Scenario: I want to be able to I want to be able to register using my full details
    Given I am on "https://moneygaming.qa.gameaccount.com/"
    When I go to the Sign up page
    And I select title as "Mr" from the dropdown menu
    And I enter firstname as "Sally" and surname as "Tubo"
   And I select "1", "June" and "1995" from the dropdown menu
  And I enter the Address details as Number "Flat 405", Building "Boulton House", Street "Conington" County "London", Postcode "SE13 7LH" and Country as "UNITED KINGDOM"
    And I Check the tickbox with text 'I accept the Terms and Conditions and certify that I am over the age of 18.'
    And I submit the form by clicking the  JOIN NOW button
    Then text "This field is required" appears under the date of birth box