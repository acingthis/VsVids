package CucumberTests;

import ApiComponents.SakilaFilms.ActorRepo;
import ApiComponents.SakilaFilms.Film;
import ApiComponents.SakilaFilms.FilmRepo;
import ApiComponents.SakilaFilms.SakilaFilmsApplication;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;

public class TitleTestStepDef {

    @Autowired
    private ActorRepo actorRepo;
    @Autowired
    private FilmRepo filmRepo;

    @Autowired
    SakilaFilmsApplication testSakila = new SakilaFilmsApplication(actorRepo,filmRepo);

    String Title;
    Film Result;

    @Given("a User wants to find films with a given name")
    public void a_user_wants_to_find_films_with_a_given_name() {
        Title = "ACADEMY DINOSAUR";
    }
    @When("the user searches for the films by using their name")
    public void the_user_searches_for_the_films_by_using_their_name() {
        Result = testSakila.getFilmTitle(Title).getBody();
    }
    @Then("The program will return films with the same name")
    public void the_program_will_return_films_with_the_same_name() {
        Assertions.assertEquals("ACADEMY DINOSAUR",Result.getTitle(), "The Resulting film doesn't have the right name");
    }
}
