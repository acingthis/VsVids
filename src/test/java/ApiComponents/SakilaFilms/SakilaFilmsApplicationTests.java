package ApiComponents.SakilaFilms;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import static org.mockito.Mockito.*;

@SpringBootTest
class SakilaFilmsApplicationTests {

    @Test
    void testGetAllFilms()
    {
        SakilaFilmsApplication testSakila = mock(SakilaFilmsApplication.class);

        Assertions.assertNotNull(testSakila.getAllFilms());

        verify(testSakila).getAllFilms();
    }

    @Test
    void testGetFilmId()
    {
        SakilaFilmsApplication testSakila = mock(SakilaFilmsApplication.class);

        testSakila.getFilmId(1);

        verify(testSakila).getFilmId(1);
    }

    @Test
    void testGetFilmTitle()
    {
        SakilaFilmsApplication testSakila = mock(SakilaFilmsApplication.class);

        testSakila.getFilmTitle("ENCINO ELF");

        verify(testSakila).getFilmTitle("ENCINO ELF");
    }

    @Test
    void testGetFilmRating()
    {
        SakilaFilmsApplication testSakila = mock(SakilaFilmsApplication.class);

        testSakila.getFilmRating("PG");

        verify(testSakila).getFilmRating("PG");
    }

    @Test
    void testGetFilmLength()
    {
        SakilaFilmsApplication testSakila = mock(SakilaFilmsApplication.class);

        testSakila.getFilmLength(101);

        verify(testSakila).getFilmLength(101);
    }

    @Test
    void testGetAllActors()
    {
        SakilaFilmsApplication testSakila = mock(SakilaFilmsApplication.class);

        testSakila.getAllActors();

        verify(testSakila).getAllActors();
    }

    @Test
    void testGetActorId()
    {
        SakilaFilmsApplication testSakila = mock(SakilaFilmsApplication.class);

        testSakila.getActorId(1);

        verify(testSakila).getActorId(1);
    }

    @Test
    void testUpdateActor()
    {
        SakilaFilmsApplication testSakila = mock(SakilaFilmsApplication.class);

        Actor testActor = new Actor(1,"First","Last",new ArrayList<>());

        testSakila.updateActor(1,testActor);

        verify(testSakila).updateActor(1,testActor);
    }

    @Test
    void testSave()
    {
        SakilaFilmsApplication testSakila = mock(SakilaFilmsApplication.class);

        Actor testActor = new Actor(1,"First","Last",new ArrayList<>());

        testSakila.save(testActor);

        verify(testSakila).save(testActor);
    }

    @Test
    void testDeleteActor()
    {
        SakilaFilmsApplication testSakila = mock(SakilaFilmsApplication.class);

        testSakila.deleteActor(1);

        verify(testSakila).deleteActor(1);
    }

    @Test
    void testGet()
    {
        SakilaFilmsApplication testSakila = mock(SakilaFilmsApplication.class);

        testSakila.get();

        verify(testSakila).get();
    }



	/*
	@Test
	void contextLoads() {
	}
	*/

}
