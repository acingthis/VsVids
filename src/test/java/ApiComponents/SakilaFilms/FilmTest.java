package ApiComponents.SakilaFilms;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmTest {

    Film film = new Film(1,"Title","Desc","PG",1,1,1,1);

    //Getters
    @Test
    void testGetActorId()
    {
        Assertions.assertEquals(1, film.getFilmId(),"The Film is not getting the Id right");
    }

    @Test
    void testGetTitle()
    {
        Assertions.assertEquals("Title", film.getTitle(),"The Film is not getting the title right");
    }

    @Test
    void testGetDescription()
    {
        Assertions.assertEquals("Desc", film.getDescription(),"The Film is not getting the Description right");
    }

    @Test
    void testGetRating()
    {
        Assertions.assertEquals("PG", film.getRating(),"The Film is not getting the rating right");
    }

    @Test
    void testGetLength()
    {
        Assertions.assertEquals(1, film.getLength(),"The Film is not getting the Length right");
    }

    @Test
    void testGetRentalRate()
    {
        Assertions.assertEquals(1, film.getRentalRate(),"The Film is not getting the rental rate right");
    }

    @Test
    void testGetRentalDuration()
    {
        Assertions.assertEquals(1, film.getRentalDuration(),"The Film is not getting the rental duration right");
    }

    @Test
    void testGetReplacementCost()
    {
        Assertions.assertEquals(1, film.getReplacementCost(),"The Film is not getting the replacement cost right");
    }


    //setters
    @Test
    void testSetActorId()
    {
        Assertions.assertEquals(1, film.getFilmId(),"The Film is not getting the Id right");

        film.setFilmId(2);

        Assertions.assertEquals(2, film.getFilmId(),"The Film is not setting the Id right");
    }

    @Test
    void testSetTitle()
    {
        Assertions.assertEquals("Title", film.getTitle(),"The Film is not getting the title right");

        film.setTitle("Test");

        Assertions.assertEquals("Test", film.getTitle(),"The Film is not setting the title right");
    }

    @Test
    void testSetDescription()
    {
        Assertions.assertEquals("Desc", film.getDescription(),"The Film is not getting the description right");

        film.setDescription("Test");

        Assertions.assertEquals("Test", film.getDescription(),"The Film is not setting the description right");
    }

    @Test
    void testSetRating()
    {
        Assertions.assertEquals("PG", film.getRating(),"The Film is not getting the rating right");

        film.setRating("Test");

        Assertions.assertEquals("Test", film.getRating(),"The Film is not setting the rating right");
    }

    @Test
    void testSetLength()
    {
        Assertions.assertEquals(1, film.getLength(),"The Film is not getting the Length right");

        film.setLength(2);

        Assertions.assertEquals(2, film.getLength(),"The Film is not setting the Length right");
    }

    @Test
    void testSetRentalRate()
    {
        Assertions.assertEquals(1, film.getRentalRate(),"The Film is not getting the rental rate right");

        film.setRentalRate(2);

        Assertions.assertEquals(2, film.getRentalRate(),"The Film is not setting the rental rate right");
    }

    @Test
    void testSetRentalDuration()
    {
        Assertions.assertEquals(1, film.getRentalDuration(),"The Film is not getting the rental duration right");

        film.setRentalDuration(2);

        Assertions.assertEquals(2, film.getRentalDuration(),"The Film is not setting the rental duration right");
    }

    @Test
    void testSetReplacementCost()
    {
        Assertions.assertEquals(1, film.getReplacementCost(),"The Film is not getting the replacement cost right");

        film.setReplacementCost(2);

        Assertions.assertEquals(2, film.getReplacementCost(),"The Film is not setting the replacement cost right");
    }

}
