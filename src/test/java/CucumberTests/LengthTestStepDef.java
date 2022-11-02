package CucumberTests;

import ApiComponents.SakilaFilms.ActorRepo;
import ApiComponents.SakilaFilms.Film;
import ApiComponents.SakilaFilms.FilmRepo;
import ApiComponents.SakilaFilms.SakilaFilmsApplication;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Objects;

public class LengthTestStepDef {

    @Autowired
    private ActorRepo actorRepo;
    @Autowired
    private FilmRepo filmRepo;

    @Autowired
    SakilaFilmsApplication testSakila = new SakilaFilmsApplication(actorRepo,filmRepo);

    ArrayList<Film> films;

    int Length;

    @Before
    public void init() {
        Length = 0;
        films = new ArrayList<>();
    }

    @Given("a User wants to find films with a length")
    public void a_user_wants_to_find_films_with_a_length() {
        Length = 143;
    }
    @When("the user searches for the films by their length")
    public void the_user_searches_for_the_films_by_their_length() {
        films = testSakila.getFilmLength(Length);
    }
    @Then("The program will return films by their length")
    public void the_program_will_return_films_by_their_length() {
        Assertions.assertEquals(Length,films.get(1).getLength(),"The Length of the film is incorrect");
    }


    @Given("a User wants to find films with a set {int}")
    public void aUserWantsToFindFilmsWithASetLength(int Length) {
        this.Length = Length;
    }

    @Then("The program will return {string} by their length")
    public void theProgramWillReturnFilmsByTheirLength(String film) {
        if (film.equals("true"))
        {
            Assertions.assertNotEquals(0,films.size(), "The film length haven't been Added");
            Assertions.assertEquals(Length,films.get(1).getLength(), "The Resulting film doesn't have the right length");
        }
        else
        {
            Assertions.assertEquals(0,films.size(), "The resulting length for films doesn't exist");
        }
    }
}
