package apiComponentsSakilaFilms;

import javax.persistence.Column;
import javax.persistence.ManyToMany;

public class ActorModel {

    int actorId;
    String firstName;

    String lastName;

    ActorModel(int id, String Fname, String LName)
    {
        actorId = id;
        firstName = Fname;
        lastName = LName;
    }

    public int getActorId() {
        return actorId;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

}
