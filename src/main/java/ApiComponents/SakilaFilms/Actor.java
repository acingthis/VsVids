package ApiComponents.SakilaFilms;
import javax.persistence.*;

@Entity
@Table(name = "actor")
public class Actor {
    //attributes
    @Id
    @Column(name = "actor_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int actorId;

    @Column(name = "first_name")
    String firstName;

    @Column(name = "last_name")
    String lastName;

    //Constructor
    public Actor(int id, String firstName, String lastName)
    {
        actorId = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Actor() {}

    //Methods

    public int getActorId() { return actorId;}
    public String getFirstName() { return firstName;}
    public String getLastName() { return lastName;}

    public void setActorId(int id) { actorId = id; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

}
