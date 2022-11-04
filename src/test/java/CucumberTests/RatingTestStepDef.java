package CucumberTests;

import apiComponentsSakilaFilms.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class RatingTestStepDef {

    @Autowired
    private ActorRepo actorRepo;
    @Autowired
    private FilmRepo filmRepo;

    @Autowired
    SakilaFilmsApplication testSakila = new SakilaFilmsApplication(actorRepo,filmRepo);

    ArrayList<Film> filmRatings;

    String Rating = "";

    @Before
    public void init() {
        Rating = "";
        filmRatings = new ArrayList<>();
    }

    @Given("a User wants to find films with a rating")
    public void a_user_wants_to_find_films_with_a_rating() {
        Rating = "PG";
    }
    @When("the user searches for the films by their rating")
    public void the_user_searches_for_the_films_by_their_rating() {
        filmRatings = testSakila.getFilmRating(Rating);
    }
    @Then("The program will return films by their rating")
    public void the_program_will_return_films_by_their_rating() {
        Assertions.assertEquals(Rating,filmRatings.get(1).getRating(),"The rating on the film is incorrect");
    }

    @Given("a User wants to find films with a {string}")
    public void aUserWantsToFindFilmsWithARating(String Rating) {
        this.Rating = Rating;
    }

    @Then("The program will return {string} by their rating")
    public void theProgramWillReturnFilmsByTheirRating(String film) {
        if (film.equals("true"))
        {
            Assertions.assertNotEquals(0,filmRatings.size(), "The film Rating haven't been Added");
            Assertions.assertEquals(Rating,filmRatings.get(1).getRating(), "The Resulting film doesn't have the right rating");
        }
        else
        {
            Assertions.assertEquals(0,filmRatings.size(), "The resulting rating for films don't exist");
        }
    }
}
