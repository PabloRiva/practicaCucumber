Feature: Login Sauce Demo
  Background: User login into Sauce Demo page
    Given Im in sauce demo web page

    @loginWithValidCredentials
    Scenario: Login into Sauce Demo page with valid credentials
      Given I set the user name field with "standard_user"
      And I set the password field with "secret_sauce"
      When I click on login button
      Then The home page should be displayed

    @loginInvalidCredentials
    Scenario: Login into Suce Demo page with invalid credentials
      Given I set the user name field with "wrong_user"
      And I set the password field with "wrong password"
      When I click on login button
      Then An error message that says "Epic sadface: Username and password do not match any user in this service" is displayed


    @Logout
    Scenario: Logout
      Given I set the user name field with "standard_user"
      And I set the password field with "secret_sauce"
      When I click on login button
      Then The home page should be displayed
      Given I click on menu icon
      And I click on logout link
      Then We should be in the login page

    @IncreaseCartNumber
    Scenario: IncreaseCartNumber
      Given I set the user name field with "standard_user"
      And I set the password field with "secret_sauce"
      When I click on login button
      Then The home page should be displayed
      When I click on add to cart button
      Then The cart's number should increase

    @LowToHighPrice
      Scenario: LowToHighPrice
        Given I set the user name field with "standard_user"
        And I set the password field with "secret_sauce"
        When I click on login button
        Then The home page should be displayed
        Given I select the product filter "Price (low to high)"
        Then The prices should be sorted