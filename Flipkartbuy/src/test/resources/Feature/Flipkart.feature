Feature: To automate the flipkart web application
  


  Scenario: TC_01 Validation of cart module by using valid credentials
    Given user Launch browser
    When user launch the flipkart web applicatons
    When user enter  the product and click search Button
    Then User select a particular product and added the product to the cart and checks wheather the product is added to the cart or not.
    Then User clicks place order Button and gets login to the application using valid credentials.
    Then User enters the shipping address and clicks the payment option.
    Then User remove the product from the cart and check whether the product is removed or not