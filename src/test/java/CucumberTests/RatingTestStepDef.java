package CucumberTests;

import ApiComponents.SakilaFilms.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.util.Collection;

public class RatingTestStepDef {

    private ActorRepo actorRepo;
    private FilmRepo filmRepo;

    SakilaFilmsApplication sakila = new SakilaFilmsApplication(actorRepo,filmRepo);

    Collection<Film> filmRatings;

    String Rating = "";

    @Given("a User wants to find films with a rating")
    public void a_user_wants_to_find_films_with_a_rating() {

        Rating = "PG";
    }
    @When("the user searches for the films by their rating")
    public void the_user_searches_for_the_films_by_their_rating() {
        //filmRatings = sakila.getFilmRating(Rating).getBody();
    }
    @Then("The program will return films by their rating")
    public void the_program_will_return_films_by_their_rating() {
        Assertions.assertEquals("","");
    }
}
