package com.Sakila.api.SakilaApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@SpringBootApplication
@RestController
@RequestMapping("/Home")
@CrossOrigin
public class SakilaAppApplication {

	@Autowired
	private ActorRepository actorRepository;
	private FilmRepository filmRepository;
	private CategoryRepository categoryRepository;


	public SakilaAppApplication(ActorRepository actorRepository, FilmRepository filmRepository, CategoryRepository categoryRepository) {
		this.actorRepository = actorRepository;
		this.filmRepository = filmRepository;
		this.categoryRepository = categoryRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(SakilaAppApplication.class, args);
	}

	@GetMapping("/allActors")
	public @ResponseBody
	Iterable<Actor> getAllActors(){
		return actorRepository.findAll();
	}

	@GetMapping("/allFilms")
	public @ResponseBody
	Iterable<Film> getAllFilms(){
		return filmRepository.findAll();
	}

	@GetMapping("/allCategories")
	public @ResponseBody
	Iterable<Category> getAllCategories(){
		return categoryRepository.findAll();
	}

	@GetMapping("/findActorId/{id}")
	public @ResponseBody
	Optional<Actor> getByActorId(@PathVariable Integer id){
		return actorRepository.findActorId(id);
	}

	@GetMapping("/findCategoryId/{id}")
	public @ResponseBody
	Optional<Category> getByCategoryId(@PathVariable Integer id){
		return categoryRepository.findCategoryId(id);
	}

	@GetMapping("/Film/{id}")
	public @ResponseBody
	Optional<Film> getByFilmId(@PathVariable Integer id){
		return filmRepository.findById(id);
	}

	@GetMapping("/getActorName/{first_name}")
	public @ResponseBody
	List<Actor> getByFirstName(@PathVariable String first_name){
		return actorRepository.findByFirstName(first_name);
	}

	@GetMapping("/getFilmTitle/{filmTitle}")
	public @ResponseBody
	List<Film> getByTitle(@PathVariable String filmTitle){ return filmRepository.findByTitle(filmTitle);}

	@GetMapping("/filmByBudget/{budget}")
	public @ResponseBody
	List<Film> getByBudget(@PathVariable double budget) { return filmRepository.findByBudget(budget); }

	@GetMapping("/filmByDuration/{duration}")
	public @ResponseBody
	List<Film> getByDuration(@PathVariable int duration) { return filmRepository.findByDuration(duration); }


	@GetMapping("/categoryFilm/{id}")
	@ResponseBody
	public Iterable<Film> getCategoryFilm(@PathVariable String id){
		return filmRepository.getCategoryFilm(id);
	}

	@PostMapping("/addActor")
	@ResponseBody
	public String addActor(@RequestBody Actor actor)
	{
		actorRepository.save(actor);
		return ("Actor added");
	}

	@PutMapping("/editActor/{id}")
	@ResponseBody
	public String editActor(@PathVariable Integer id, @RequestBody Actor newAct)
	{

		final Actor actor = this.actorRepository.findById(id).get();
		Optional<Actor> optional = actorRepository.findById(id);
		if(optional.isEmpty()) {
			throw new NoSuchElementException();
		}
		actor.setFirstName(newAct.firstName);
		actor.setLastName(newAct.lastName);
		actorRepository.save(actor);
		return("Actor Edited");
	}

	//A change for a commit
}
