@Login
Feature: Login Hotel Module

  Background: 
    Given User is on the OMR Branch hotel page

  @Login1
  Scenario Outline: Verifying login with valid credentials
    When User enter "<userName>" and "<password>"
    Then User should verify sucees message after login "Welcome Srini"

    Examples: 
      | userName            | password        |
      | srinipmps@gmail.com | abEuKW6S@asg3Nv |

  @Login2
  Scenario Outline: Verifying login with valid credentials
    When User enter "<userName>" and "<password>" with enter key
    Then User should verify sucees message after login "Welcome Srini"

    Examples: 
      | userName            | password        |
      | srinipmps@gmail.com | abEuKW6S@asg3Nv |

  @Login3
  Scenario Outline: Verifying login with valid credentials
    When User enter "<userName>" and "<password>"
    Then User should verify error message after login "Invalid Login details or Your Password might have expired."

    Examples: 
      | userName            | password     |
      | srinipmps@gmail.com | asdfghjkjhgf |
