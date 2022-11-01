package ApiComponents.SakilaFilms;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FilmRepo extends JpaRepository<Film,Integer> {

//    public Film findByName(String name);
}
