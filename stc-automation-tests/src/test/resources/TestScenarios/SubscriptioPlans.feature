Feature: Validating Subscription Packages
  
  As a User
  I should be able to see different plan options
  So that I can choose the subscription accordingly

  Scenario Outline: Validating Subscription Packages for different countries
    Given I am on STC TV subscription home page
    When I select country as "<Country>"
    Then I should see the plan details for the type "Lite" price and currency as "<CurrencyLite>" 
    And I should see the plan details for the type "Classic" price and currency as "<CurrencyClassic>" 
    And I should see the plan details for the type "Premium" price and currency as "<CurrencyPremium>" 
    
    
    Examples:
    
    |Country|CurrencyLite	|CurrencyClassic|CurrencyPremium|
    |KSA		|15 SAR/month |25 SAR/month   |60 SAR/month   |
    |Bahrain|2 BHD/month 	|3 BHD/month    |6 BHD/month    |    
    |Kuwait	|1.2 KWD/month|2.5 KWD/month  |4.8 KWD/month  |