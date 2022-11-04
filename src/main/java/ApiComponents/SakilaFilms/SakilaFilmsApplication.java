package ApiComponents.SakilaFilms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.ResourceAccessException;

import java.util.ArrayList;

@SpringBootApplication
@RestController
@RequestMapping("/home")
@CrossOrigin
public class SakilaFilmsApplication {

	@Autowired
	private ActorRepo actorRepo;
	@Autowired
	private FilmRepo filmRepo;


	public SakilaFilmsApplication(ActorRepo actorRepo,FilmRepo filmRepo)
	{
		this.actorRepo = actorRepo;
		this.filmRepo = filmRepo;
	}

	public static void main(String[] args) {
		SpringApplication.run(SakilaFilmsApplication.class, args);
	}

	@GetMapping("/films")
	public @ResponseBody
	Iterable<Film> getAllFilms()
	{
		return filmRepo.findAll();
	}

	@GetMapping("/filmId/{id}")
	public Film getFilmId(@PathVariable(value = "id") int filmId) throws ResourceAccessException {
		return filmRepo.findById(filmId).orElseThrow(() -> new ResourceAccessException("Film not found for this id: " + filmId));
	}

	@GetMapping("/filmTitle/{title}")
	public Film getFilmTitle(@PathVariable(value = "title") String title) throws ResourceAccessException {
		return filmRepo.findByName(title);
	}

	@GetMapping("/filmRating/{rating}")
	public ArrayList<Film> getFilmRating(@PathVariable(value = "rating") String rating) throws ResourceAccessException {
		return filmRepo.findByRating(rating);
	}

	@GetMapping("/films/{length}")
	public ArrayList<Film> getFilmLength(@PathVariable(value = "length") int length) throws ResourceAccessException {
		return filmRepo.findByLength(String.valueOf(length));
	}



	@GetMapping("/actors")
	public @ResponseBody
	Iterable<Actor> getAllActors()
	{
		return actorRepo.findAll();
	}

	@GetMapping("/actors/{id}")
	public Actor getActorId(@PathVariable(value = "id") int actorId) throws ResourceAccessException {
		return actorRepo.findById(actorId).orElseThrow(() -> new ResourceAccessException("Actor not found for this id: " + actorId));
	}

	@PutMapping("/actors/{id}")
	public ResponseEntity<Actor> updateActor(@PathVariable int id,@RequestBody Actor actorDetails) {
		Actor updateActor = actorRepo.findById(id).orElseThrow(() -> new ResourceAccessException("Actor doesn't exist with id: " + id));

		updateActor.setFirstName(actorDetails.getFirstName());
		updateActor.setLastName(actorDetails.getLastName());

		actorRepo.save(updateActor);

		return ResponseEntity.ok(updateActor);
	}

	@PostMapping("/actors")
	public ResponseEntity<Actor> save(@RequestBody Actor actorDetails) {

		try {
			return new ResponseEntity<>(actorRepo.save(actorDetails), HttpStatus.CREATED);
		}
		catch (Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/actors/{id}")
	public ResponseEntity<HttpStatus> deleteActor(@PathVariable int id) {
		try {
			Actor deleteActor = actorRepo.findById(id)
					.orElseThrow(() -> new ResourceAccessException("Actor doesn't exist with id: " + id));

			actorRepo.delete(deleteActor);

			return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
		}
		catch (Exception e)
		{
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	 @ResponseBody
	Iterable<Actor> get()
	{
		return actorRepo.findAll();
	}

}
