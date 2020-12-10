Feature: Authorization

  Background:
    Given Open main page

  Scenario: Success authorization in the system
    Given Open auth frame
    When Set "rahog66236@abbuzz.com" to email field
    And Set "qaz123qaz" to password field
    And Click on submit button
    Then Sign form was closed
    And Show "Alexander" in header menu

  Scenario: Sign form was not closed when email is empty
    Given Open auth frame
    When Set "" to email field
    And Click on submit button
    Then Sign form was not closed

  Scenario: Sign form was not closed when email is set and password is empty
    Given Open auth frame
    When Set "rahog66236@abbuzz.com" to email field
    And Set "" to password field
    And Click on submit button
    Then Sign form was not closed
