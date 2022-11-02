Feature: This will look for films with a set length.
  As a user, i will look for films by their film length.

  Scenario: Successfully receives films with a set length.

    Given a User wants to find films with a length
    When the user searches for the films by their length
    Then The program will return films by their length


  Scenario Outline: Finds Films with a given length

    Given a User wants to find films with a set <length>
    When the user searches for the films by their length
    Then The program will return <films> by their length

    Examples:
      | length | films |
      |  62  | "true" |
      |  62  | "true" |
      |  101 | "true" |
      |  1   | "false" |
      |  10  | "false" |