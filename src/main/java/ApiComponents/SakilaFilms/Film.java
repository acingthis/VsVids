package ApiComponents.SakilaFilms;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "film")
public class Film {
    //attributes
    @Id
    @Column(name = "film_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int filmId;

    @Column(name = "title")
    String title;

    @Column(name = "description")
    String desc;

    @Column(name = "rating")
    String rating;

    @Column(name = "length")
    int length;

    @Column(name = "rental_rate")
    double rentalRate;

    @Column(name = "rental_duration")
    int rentalDuration;

    @Column(name = "replacement_cost")
    double replacementCost;

    @ManyToMany
    @JoinTable(name = "film_actor",
            joinColumns = @JoinColumn(name = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "actor_id"))
    @JsonIgnore
    Collection<Actor> actors;

    //Constructors
    public Film(int id, String title, String description,String rating, int length, double rentalRate, int rentalDuration, double replacementCost, Collection<Actor> actors)
    {
        this.filmId = id;
        this.title = title;
        this.desc = description;
        this.rating = rating;
        this.length = length;
        this.rentalRate = rentalRate;
        this.rentalDuration = rentalDuration;
        this.replacementCost = replacementCost;
        this.actors = actors;
    }

    public Film() {}

    //Methods
    public int getFilmId() { return filmId; }
    public String getTitle() { return title; }
    public String getDescription() { return desc; }
    public String getRating() { return rating; }
    public int getLength() { return length; }
    public double getRentalRate() { return rentalRate; }
    public int getRentalDuration() { return rentalDuration; }
    public double getReplacementCost() { return replacementCost; }
    public Collection<Actor> getActors() { return actors; }

    public void setFilmId(int id) { filmId = id; }
    public void setTitle(String title) { this.title = title; }
    public void setDescription(String description) { this.desc = description; }
    public void setRating(String rating) { this.rating = rating; }
    public void setLength(int length) { this.length = length; }
    public void setRentalRate(double rentalRate) { this.rentalRate = rentalRate; }
    public void setRentalDuration(int rentalDuration) { this.rentalDuration = rentalDuration; }
    public void setReplacementCost(double replacementCost) { this.replacementCost = replacementCost; }
    public void setActor(Collection<Actor> actors) { this.actors = actors; }
}
