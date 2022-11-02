package ApiComponents.SakilaFilms;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;

public interface FilmRepo extends JpaRepository<Film,Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM sakila.film WHERE title = ?1")
    Film findByName(String title);

    @Query(nativeQuery = true, value = "SELECT * FROM sakila.film WHERE rating = ?1")
    ArrayList<Film> findByRating(String Rating);

    @Query(nativeQuery = true, value = "SELECT * FROM sakila.film WHERE length = ?1")
    ArrayList<Film> findByLength(String length);
}