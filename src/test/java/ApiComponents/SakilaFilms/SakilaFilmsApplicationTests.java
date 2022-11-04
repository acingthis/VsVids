package ApiComponents.SakilaFilms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.*;

class SakilaFilmsApplicationTests {


    ActorRepo actorRepo = mock(ActorRepo.class);
    FilmRepo filmRepo = mock(FilmRepo.class);
    SakilaFilmsApplication testSakila = new SakilaFilmsApplication(actorRepo,filmRepo);

    //Test Objects
    Film testFilm = new Film(1,"Title","DESC","PG",1,1,1,1,new ArrayList<>());
    Film testFilm2 = new Film(2,"Test","DESC","G",1,1,1,1,new ArrayList<>());
    List<Film> allFilmsReturn = Arrays.asList(testFilm,testFilm2);
    Actor testactor = new Actor(1,"First","last",new ArrayList<>());
    Actor testactor2 = new Actor(1,"Test","this",new ArrayList<>());
    List<Actor> allActors = Arrays.asList(testactor,testactor2);


    //Film Tests
    @Test
    void testGetAllFilms()
    {
        when(filmRepo.findAll()).thenReturn(allFilmsReturn);

        Iterable<Film> actualResult = testSakila.getAllFilms();

        Assertions.assertEquals(allFilmsReturn,actualResult,"can't retrieve all films");
    }

    @Test
    void testGetFilmId()
    {
        when(filmRepo.findById(1)).thenReturn(Optional.ofNullable(testFilm));

        Film actualResult = testSakila.getFilmId(1).getBody();

        Assertions.assertEquals(testFilm,actualResult,"can't retrieve set film");
    }

    @Test
    void testGetFilmTitle()
    {

        when(filmRepo.findByName("Test")).thenReturn(testFilm);

        Film actualResult = testSakila.getFilmTitle("Test").getBody();

        Assertions.assertEquals(testFilm,actualResult,"can't retrieve film from title");
    }

    @Test
    void testGetFilmRating()
    {
        ArrayList<Film> films = new ArrayList<>();
        films.add(testFilm);
        films.add(testFilm2);

        when(filmRepo.findByRating("PG")).thenReturn(films);

        ArrayList<Film> actualResult = testSakila.getFilmRating("PG");

        Assertions.assertEquals(actualResult,films,"can't retrieve film from rating");
    }

    @Test
    void testGetFilmLength()
    {
        ArrayList<Film> films = new ArrayList<>();
        films.add(testFilm);
        films.add(testFilm2);

        when(filmRepo.findByLength("101")).thenReturn(films);

        ArrayList<Film> actualResult = testSakila.getFilmLength(101);

        Assertions.assertEquals(actualResult,films,"can't retrieve film from length");
    }


    //Actor Tests
    @Test
    void testGetAllActors()
    {
        when(actorRepo.findAll()).thenReturn(allActors);

        Iterable<Actor> actualResult = testSakila.getAllActors();

        Assertions.assertEquals(actualResult,allActors,"can't retrieve all Actors");
    }

    @Test
    void testGetActorId()
    {
        when(actorRepo.findById(1)).thenReturn(Optional.ofNullable(testactor));

        Actor actualResult = testSakila.getActorId(1).getBody();

        Assertions.assertEquals(actualResult,testactor,"can't retrieve all Actors");
    }

    @Test
    void testUpdateActor()
    {
        when(actorRepo.findById(1)).thenReturn(Optional.ofNullable(testactor));

        testSakila.updateActor(1, testactor);

        verify(actorRepo).save(testactor);
    }
    //TODO
    @Test
    void testSave()
    {
        when(actorRepo.save(testactor)).thenReturn(testactor);

        testSakila.save(testactor);

        verify(actorRepo).save(testactor);
    }

    @Test
    void testDeleteActor()
    {
        when(actorRepo.findById(1)).thenReturn(Optional.ofNullable(testactor));

        testSakila.deleteActor(1);

        verify(actorRepo).delete(testactor);
    }

    @Test
    void testGet()
    {
        when(actorRepo.findAll()).thenReturn(allActors);

        Iterable<Actor> actualResult =testSakila.get();

        Assertions.assertEquals(allActors,actualResult,"can't retrieve all Actors");
    }


	/*
	@Test
	void contextLoads() {
	}
	*/

}
