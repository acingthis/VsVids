package ApiComponents.SakilaFilms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

class SakilaFilmsApplicationTests {


    ActorRepo actorRepo = mock(ActorRepo.class);
    FilmRepo filmRepo = mock(FilmRepo.class);
    SakilaFilmsApplication testSakila = new SakilaFilmsApplication(actorRepo,filmRepo);

    Film testFilm = new Film(1,"Title","DESC","PG",1,1,1,1,new ArrayList<>());
    Film testFilm2 = new Film(2,"Test","DESC","G",1,1,1,1,new ArrayList<>());
    List<Film> allFilmsReturn = Arrays.asList(testFilm,testFilm2);

    @Test
    void testGetAllFilms()
    {
        when(filmRepo.findAll()).thenReturn(allFilmsReturn);

        Iterable<Film> actualResult = testSakila.getAllFilms();

        Assertions.assertEquals(allFilmsReturn,actualResult,"can't retrieve all films");
    }
/*
    @Test
    void testGetFilmId()
    {
        testSakila.getFilmId(1);

        verify(testSakila).getFilmId(1);
    }

    @Test
    void testGetFilmTitle()
    {
        testSakila.getFilmTitle("ENCINO ELF");

        verify(testSakila).getFilmTitle("ENCINO ELF");
    }

    @Test
    void testGetFilmRating()
    {
        testSakila.getFilmRating("PG");

        verify(testSakila).getFilmRating("PG");
    }

    @Test
    void testGetFilmLength()
    {
        testSakila.getFilmLength(101);

        verify(testSakila).getFilmLength(101);
    }

    @Test
    void testGetAllActors()
    {
        testSakila.getAllActors();

        verify(testSakila).getAllActors();
    }

    @Test
    void testGetActorId()
    {
        testSakila.getActorId(1);

        verify(testSakila).getActorId(1);
    }

    @Test
    void testUpdateActor()
    {
        Actor testActor = new Actor(1,"First","Last",new ArrayList<>());

        testSakila.updateActor(1,testActor);

        verify(testSakila).updateActor(1,testActor);
    }

    @Test
    void testSave()
    {
        Actor testActor = new Actor(1,"First","Last",new ArrayList<>());

        testSakila.save(testActor);

        verify(testSakila).save(testActor);
    }

    @Test
    void testDeleteActor()
    {
        testSakila.deleteActor(1);

        verify(testSakila).deleteActor(1);
    }

    @Test
    void testGet()
    {
        testSakila.get();

        verify(testSakila).get();
    }

 */



	/*
	@Test
	void contextLoads() {
	}
	*/

}
