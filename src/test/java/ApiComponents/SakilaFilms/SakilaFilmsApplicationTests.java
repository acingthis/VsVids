package ApiComponents.SakilaFilms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import static org.mockito.Mockito.*;

@SpringBootTest
class SakilaFilmsApplicationTests {

    @Autowired
    ActorRepo actorRepo;
    @Autowired
    FilmRepo filmRepo;

    @Mock
    SakilaFilmsApplication testSakila = new SakilaFilmsApplication(actorRepo,filmRepo);

    @Test
    void testGetAllFilms()
    {
        Assertions.assertNotNull(testSakila.getAllFilms(),"can't retrieve all films");

        verify(testSakila).getAllFilms();
    }

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



	/*
	@Test
	void contextLoads() {
	}
	*/

}
