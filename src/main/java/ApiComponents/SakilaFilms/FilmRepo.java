package ApiComponents.SakilaFilms;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FilmRepo extends JpaRepository<Film,Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM sakila.film WHERE title = ?1")
    Film findByName(String title);

}
