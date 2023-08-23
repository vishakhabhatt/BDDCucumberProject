Feature :Customer

Scenario Outline: Add New Csutomer
    Given User launch Chrome Browser
    When User open url "https://admin-democommerce.com/login"
    And User enter Email as "admin@yourstore.com" and password as "admin"
    And User click on login button
    Then User can view Dashboard
    When User click on csutomers menu
    And User can click on customer menu item
    And User click on new add button
    Then User can view add customer page
    When User enter customer info "<newEmail>" and "<newPass>" and "<fname>" and "<lname>" and "<gender>" and "<conName>" and "<adminComment>"
    And User can view confirmation msg "The new customer has been added successfully"
    Then close browser
    
    Examples:
    |newEmail|newPass|fname|lname|gander|conName|adminComment|
    |braj11@gmail.com|1234|Bali17|Bali17|Raj|Male|ABC|Test1|
    |radha11@gmail.com|4567|Bali17|Radha|Yewale|Feale|xyz|Test1|
    |madhu11@gmail.com|8910|Bali17|Madhu|Patil|Female|opa|Test1|
    