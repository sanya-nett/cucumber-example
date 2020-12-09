Feature: Authorization

  Scenario: Success authorization in the system
    Given Open auth frame
    When Set "rahog66236@abbuzz.com" to email field
    And Set "qaz123qaz" to password field
    And Click on submit button
    Then Show Alexander in header menu

  Scenario: Show warning tooltip when email is empty
    Given Open auth frame
    When Set "" to email field
    And Click on submit button
    Then Show warning tooltip with text: "Заполните это поле."

  Scenario: Show warning tooltip when email is set and password is empty
    Given Open auth frame
    When Set "rahog66236@abbuzz.com" to email field
    And Set "" to password field
    And Click on submit button
    Then Show warning tooltip with text: "Заполните это поле."
