package ApiComponents.SakilaFilms;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmTest {

    Film film = new Film(1,"Title","Desc","PG",1,1,1,1);

    //Getters
    @Test
    public void testGetActorId()
    {
        Assertions.assertEquals(1, film.getFilmId(),"The Film is not getting the Id right");
    }

    @Test
    public void testGetTitle()
    {
        Assertions.assertEquals("Title", film.getTitle(),"The Film is not getting the title right");
    }

    @Test
    public void testGetDescription()
    {
        Assertions.assertEquals("Desc", film.getDescription(),"The Film is not getting the Description right");
    }

    @Test
    public void testGetRating()
    {
        Assertions.assertEquals("PG", film.getRating(),"The Film is not getting the rating right");
    }

    @Test
    public void testGetLength()
    {
        Assertions.assertEquals(1, film.getLength(),"The Film is not getting the Length right");
    }

    @Test
    public void testGetRentalRate()
    {
        Assertions.assertEquals(1, film.getRentalRate(),"The Film is not getting the rental rate right");
    }

    @Test
    public void testGetRentalDuration()
    {
        Assertions.assertEquals(1, film.getRentalDuration(),"The Film is not getting the rental duration right");
    }

    @Test
    public void testGetReplacementCost()
    {
        Assertions.assertEquals(1, film.getReplacementCost(),"The Film is not getting the replacement cost right");
    }


    //setters
    @Test
    public void testSetActorId()
    {
        Assertions.assertEquals(1, film.getFilmId(),"The Film is not getting the Id right");

        film.setFilmId(2);

        Assertions.assertEquals(2, film.getFilmId(),"The Film is not setting the Id right");
    }

    @Test
    public void testSetTitle()
    {
        Assertions.assertEquals("Title", film.getTitle(),"The Film is not getting the title right");

        film.setTitle("Test");

        Assertions.assertEquals("Test", film.getTitle(),"The Film is not setting the title right");
    }

    @Test
    public void testSetDescription()
    {
        Assertions.assertEquals("Desc", film.getDescription(),"The Film is not getting the description right");

        film.setDescription("Test");

        Assertions.assertEquals("Test", film.getDescription(),"The Film is not setting the description right");
    }

    @Test
    public void testSetRating()
    {
        Assertions.assertEquals("PG", film.getRating(),"The Film is not getting the rating right");

        film.setRating("Test");

        Assertions.assertEquals("Test", film.getRating(),"The Film is not setting the rating right");
    }

    @Test
    public void testSetLength()
    {
        Assertions.assertEquals(1, film.getLength(),"The Film is not getting the Length right");

        film.setLength(2);

        Assertions.assertEquals(2, film.getLength(),"The Film is not setting the Length right");
    }

    @Test
    public void testSetRentalRate()
    {
        Assertions.assertEquals(1, film.getRentalRate(),"The Film is not getting the rental rate right");

        film.setRentalRate(2);

        Assertions.assertEquals(2, film.getRentalRate(),"The Film is not setting the rental rate right");
    }

    @Test
    public void testSetRentalDuration()
    {
        Assertions.assertEquals(1, film.getRentalDuration(),"The Film is not getting the rental duration right");

        film.setRentalDuration(2);

        Assertions.assertEquals(2, film.getRentalDuration(),"The Film is not setting the rental duration right");
    }

    @Test
    public void testSetReplacementCost()
    {
        Assertions.assertEquals(1, film.getReplacementCost(),"The Film is not getting the replacement cost right");

        film.setReplacementCost(2);

        Assertions.assertEquals(2, film.getReplacementCost(),"The Film is not setting the replacement cost right");
    }

}
