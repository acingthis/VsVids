import ApiComponents.SakilaFilms.Actor;
import ApiComponents.SakilaFilms.Film;
import ApiComponents.SakilaFilms.SakilaFilmsApplication;

public class Card {

    int Id = 0;

    Film film;
    Actor actor;

    Card(int Id)
    {
        this.Id = Id;
        setCardInfo();
    }

    public void setCardInfo()
    {
        //SakilaFilmsApplication sakila = new SakilaFilmsApplication();
    }


}
