package ApiComponents.SakilaFilms;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ActorTest {
    Actor actor = new Actor(1, "first", "last");

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
}
