package ApiComponents.SakilaFilms;
import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "film_actor")
public class FilmActor {

    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "film_id")
    int filmId;

    @OneToMany(mappedBy = "filmId")
    private Collection<FilmActor> actors;

    FilmActor()
    {

    }

    public Collection<FilmActor> getActors() { return actors;}
    public int getFilmId() { return filmId;}

    public void setFilmId(int id) { filmId = id; }

}
