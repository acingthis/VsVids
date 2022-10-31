package ApiComponents.SakilaFilms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmActorTest {

    FilmActor Link = new FilmActor();

    @Test
    void testGetActors()
    {
        Link.getActors();
    }

    @Test
    void testGetFilmId()
    {
        Link.getFilmId();
    }

    @Test
    void testSetFilmId()
    {
        Link.setFilmId(1);

        Assertions.assertEquals(1, Link.getFilmId(),"The ActorFilm film id is not right");
    }
}
