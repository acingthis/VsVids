Feature: This will look for films with a set Rating.
  As a user, i will look for films by their film rating.

  Scenario: Successfully receives films with a set rating.

    Given a User wants to find films with a rating
    When the user searches for the films by their rating
    Then The program will return films by their rating


  Scenario Outline: Finds Films with a given rating

    Given a User wants to find films with a <rating>
    When the user searches for the films by their rating
    Then The program will return <films> by their rating

    Examples:
      | rating | films |
      |  "PG"  | "true" |
      | "NC-17" | "true" |
      |  "G"  | "true" |
      |  "N"  | "false" |
      |  "PR"  | "false" |