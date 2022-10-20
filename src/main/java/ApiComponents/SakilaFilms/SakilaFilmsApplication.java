package ApiComponents.SakilaFilms;

import org.apache.maven.wagon.ResourceDoesNotExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.ResourceAccessException;

@SpringBootApplication
@RestController
@RequestMapping("/home")
@CrossOrigin
public class SakilaFilmsApplication {

	@Autowired
	private ActorRepo actorRepo;
	private FilmRepo filmRepo;

	public SakilaFilmsApplication(ActorRepo actorRepo,FilmRepo filmRepo)
	{
		this.actorRepo = actorRepo;
		this.filmRepo = filmRepo;
	}

	public static void main(String[] args) {
		SpringApplication.run(SakilaFilmsApplication.class, args);
	}

	@GetMapping("/allFilms")
	public @ResponseBody
	Iterable<Film> getAllFilms()
	{
		return filmRepo.findAll();
	}

	@GetMapping("/actors")
	public @ResponseBody
	Iterable<Actor> getAllActors()
	{
		return actorRepo.findAll();
	}

	@PostMapping("/actors")
	public Actor createActor(@RequestBody Actor actor) {
		return actorRepo.save(actor);
	}

	@PutMapping("/actors/{id}")
	public ResponseEntity<Actor> updateActor(@PathVariable int id,@RequestBody Actor actorDetails) {
		Actor updateEmployee = actorRepo.findById(id)
				.orElseThrow(() -> new ResourceAccessException("Actor doesn't exist with id: " + id));

		updateEmployee.setFirstName(actorDetails.getFirstName());
		updateEmployee.setLastName(actorDetails.getLastName());
		updateEmployee.setActorId(actorDetails.getActorID());

		actorRepo.save(updateEmployee);

		return ResponseEntity.ok(updateEmployee);
	}



	 @ResponseBody
	Iterable<Actor> get()
	{
		return actorRepo.findAll();
	}

}
