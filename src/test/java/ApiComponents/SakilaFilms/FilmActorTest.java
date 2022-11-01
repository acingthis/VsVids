package ApiComponents.SakilaFilms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collection;

public class FilmActorTest {

    FilmActor Link = new FilmActor();

    @Test
    void testGetActors()
    {
        Link.getActors();
    }

    @Test
    void testSetFilmId()
    {
        Link.setFilmId(1);

        Assertions.assertEquals(1, Link.getFilmId(),"The ActorFilm film id is not right");
    }

    @Test
    void testSetActors()
    {
        Collection<FilmActor> testActor = null;

        Link.setActors(testActor);

        Assertions.assertEquals(testActor, Link.getActors(),"The ActorFilm film id is not right");
    }
}
