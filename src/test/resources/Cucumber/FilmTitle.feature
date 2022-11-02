Feature: This will find a film with a name.
  As a user, i will look for films by looking for the name of the film.

  Scenario: Successfully receives films with the same name.

    Given a User wants to find films with a given name
    When the user searches for the films by using their name
    Then The program will return films with the same name

  Scenario Outline: Finds films with set names

    Given a User wants to find films with a given name <title>
    When the user searches for the films by using their name
    Then The program will return <film> with the same name

    Examples:
      | title | film |
      | "ACADEMY DINOSAUR" | "true" |
      |  "ACE GOLDFINGER"  | "true" |
      | "ADAPTATION HOLES" | "true" |
      | "AFFAIR PREJUDICE" | "true" |
      |      "Random"      | "false" |
      |    "Not A Film"    | "false" |
      |   "Doesn't Exist"  | "false" |
