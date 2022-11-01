Feature: This will find a film with a name.
  As a user, i will look for films by looking for the name of the film.

  Scenario: Successfully receives films with the same name.

    Given a User wants to find films with a given name
    When the user searches for the films by using their name
    Then The program will return films with the same name