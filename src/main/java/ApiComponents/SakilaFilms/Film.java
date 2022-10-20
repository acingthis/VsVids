package ApiComponents.SakilaFilms;

import javax.persistence.*;

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

    //Constructors
    public Film(int ID, String title, String description, int length, double rentalRate, int rentalDuration, double replacementCost)
    {
        this.filmId = ID;
        this.title = title;
        this.desc = description;
        this.length = length;
        this.rentalRate = rentalRate;
        this.rentalDuration = rentalDuration;
        this.replacementCost = replacementCost;
    }

    public Film()
    {

    }

    //Methods
    public int getFilmId() { return filmId; }
    public String getTitle() { return title; }
    public String getDescription() { return desc; }
    public int getLength() { return length; }
    public double getRentalRate() { return rentalRate; }
    public int getRentalDuration() { return rentalDuration; }
    public double getReplacementCost() { return replacementCost; }

    public void setFilmId(int ID) { filmId = ID; }
    public void setTitle(String title) { this.title = title; }
    public void setDescription(String description) { this.desc = description; }
    public void setLength(int length) { this.length = length; }
    public void setRentalRate(double rentalRate) { this.rentalRate = rentalRate; }
    public void setRentalDuration(int rentalDuration) { this.rentalDuration = rentalDuration; }
    public void setReplacementCost(double replacementCost) { this.replacementCost = replacementCost; }
}
