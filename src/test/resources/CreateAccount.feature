@CreateAccount

  Feature: Register New User

  Scenario Outline:  As a user, I want to create an account with valid credentials
    Given I go to the landing page
      And I click the SignIn link
      And I enter my email address
      And I click on the create account button
      And I click on male radio button
      And I enter a firstname "<firstname>"
      And I enter a lastname "<lastname>"
      And I enter a "<password>"
      And I enter my date of birth
      And I enter address
      And I enter city
      And I enter state
      And I enter postal code
      And I enter country
      And I enter mobile number
      When I click register button
      Then I verify that "<user>" is logged in
      And I sign out
      Examples:
        | firstname | lastname | password  |  user      |
        | switch    | Esco     | Firstjohn3 |switch Esco |
        | john      | ken      | Today01   | john ken   |
        | James     | Brown    | Fantasy1  | James Brown|
        #| addy      | blue     | Remake2   | addy blue  |
        #| matt      | film     | Filmmath3 | matt film  |


    @CreateAccount

    Scenario Outline:  As a user, I want to create an account with invalid details
      Given I go to the landing page
      And I click the SignIn link
      And I enter my email address
      And I click on the create account button
      And I click on male radio button
      And I enter a firstname "<firstname>"
      And I enter a lastname "<lastname>"
      And I enter a "<password>"
      And I enter my date of birth
      And I enter address
      And I enter city
      And I enter state
      And I enter postal code
      And I enter country
      And I enter mobile number
      When I click register button
      Then I see an error "<error message>" message details
      Examples:
        | firstname | lastname | password  | error message     |
        | 346@$$    | Esco     | FirstJohn3  | firstname is invalid. |
        | switch    | 121     | FirstJohn2  | lastname is invalid. |
         | switch    | Esco     |   #lk       | passwd is invalid.|
