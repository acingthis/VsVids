package ApiComponents.SakilaFilms;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;

public class ActorTest {

    Collection<Film> films = new ArrayList<>();
    Actor actor = new Actor(1, "first", "last",films);

    @Test
    void testActor()
    {
        Actor testActor = new Actor();
    }

    //Getters
    @Test
    void testGetActorId()
    {
        Assertions.assertEquals(1, actor.getActorId(),"The Actor is not getting the Id right");
    }

    @Test
    void testGetFirstName()
    {
        Assertions.assertEquals("first", actor.getFirstName(),"The Actor is not getting the first name right");
    }

    @Test
    void testGetLastName()
    {
        Assertions.assertEquals("last", actor.getLastName(),"The Actor is not getting the last name right");
    }

    @Test
    void testGetFilms()
    {
        Assertions.assertEquals(0, actor.getFilms().size(),"The Actor is not getting the size of the films right");
    }

    //Setters
    @Test
    void testSetActorId()
    {
        Assertions.assertEquals(1, actor.getActorId(),"The Actor is not getting the Id right");

        actor.setActorId(2);

        Assertions.assertEquals(2, actor.getActorId(),"The ActorId is not getting set right");
    }

    @Test
    void testSetFirstName()
    {
        Assertions.assertEquals("first", actor.getFirstName(),"The Actor is not getting the first name right");

        actor.setFirstName("Test");

        Assertions.assertEquals("Test", actor.getFirstName(),"The First name is not getting set right");
    }

    @Test
    void testSetLastName()
    {
        Assertions.assertEquals("last", actor.getLastName(),"The Actor is not getting the last name right");

        actor.setLastName("Test");

        Assertions.assertEquals("Test", actor.getLastName(),"The Last name is not getting set right");
    }

    @Test
    void testSetActors()
    {
        Assertions.assertEquals(0, actor.getFilms().size(),"The Actor is not getting the size of the films right");

        actor.films.add(new Film());

        Assertions.assertEquals(1, actor.getFilms().size(),"The Actor is not getting the size of the films right");
    }
}
