package ApiComponents.SakilaFilms;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

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

    @ManyToMany
    @JoinTable(name = "film_actor",
            joinColumns = @JoinColumn(name = "actor_id"),
            inverseJoinColumns = @JoinColumn(name = "film_id"))
    @JsonIgnore
    Collection<Film> films;

    //Constructor
    public Actor(int id, String firstName, String lastName,Collection<Film> films)
    {
        actorId = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.films = films;
    }

    public Actor() {}

    //Methods

    public int getActorId() { return actorId;}
    public String getFirstName() { return firstName;}
    public String getLastName() { return lastName;}
    public Collection<Film> getFilms() { return films; }

    public void setActorId(int id) { actorId = id; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setFilms(Collection<Film> films) { this.films = films; }

}
