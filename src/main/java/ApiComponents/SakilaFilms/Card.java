package ApiComponents.SakilaFilms;

import ApiComponents.SakilaFilms.*;

import java.util.ArrayList;

public class Card {

    int Id = 0;

    Film film;
    ArrayList<Actor> actors;

    Card(int Id)
    {
        this.Id = Id;
        setCardInfo();
    }

    public void setCardInfo()
    {
        ActorRepo actorRepo = null;
        FilmRepo filmRepo = null;

        SakilaFilmsApplication sakila = new SakilaFilmsApplication(actorRepo,filmRepo);

        film = sakila.getFilmId(Id).getBody();
    }

}
