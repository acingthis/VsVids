package ApiComponents.SakilaFilms;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepo extends JpaRepository<Film,Integer> {
}
