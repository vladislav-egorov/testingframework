#language: en

@all

Feature: Example of taking the test arguments

  Scenario: Take argument from string

    Given open system
    Given login with login and password "testuser4" "1234512345"
    Given click contr menu
    Given click create contr button

    Given set value in field Contr Description "Description"
    Given set value in field Contr Name "Contr Name"
    Given set value in field Contr Account "112344"
    Given set value in field Bank Name "Bank Name"
    Given set value in field Bank Account "123000333"
    Given set value in field Bank Bic "93128372"

    Given click elementOne
    Given click elementTwo

    Then user close session
