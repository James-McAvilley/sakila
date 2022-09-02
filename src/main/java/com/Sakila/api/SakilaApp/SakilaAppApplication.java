package com.Sakila.api.SakilaApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

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


	@PutMapping(value = "/AddActor/{id}")
	@ResponseBody
	Optional<Actor> addActor(@PathVariable Integer id, @RequestParam String first_name, @RequestParam String last_name){
		Actor actor = actorRepository.findById(id).get();
		actor.first_name = first_name;
		actor.last_name = last_name;
		actorRepository.save(actor);
		return actorRepository.findById(id);
	}

	@GetMapping("/Actor/{id}")
	public @ResponseBody
	Optional<Actor> getActor(@PathVariable Integer id){
		return actorRepository.findById(id);
	}

	@GetMapping("/Film/{id}")
	public @ResponseBody
	Optional<Film> getFilm(@PathVariable Integer id){
		return filmRepository.findById(id);
	}

	//A change for a commit
}
