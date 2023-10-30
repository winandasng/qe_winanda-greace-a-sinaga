Feature: Register

  Scenario: Verify that users can successfully register with valid data.
    Given I set POST method R1
    When I set URL R1
    And I input the HTTP Body R1
    And I click the Test Request R1
    Then The verify result is Response Code 200 R1

  Scenario: Verify that users failed to register with an email that is already exist.
    Given I set POST method R2
    When I set URL R2
    And I input the HTTP Body R2
    And I click the Test Request R2
    Then The verify result is Response Code 400 R2

  Scenario: Verify that users failed to register with Empty Field data.
    Given I set POST method R3
    When I set URL R3
    And I input the HTTP Body R3
    And I click the Test Request R3
    Then The verify result is Response Code 400 R3