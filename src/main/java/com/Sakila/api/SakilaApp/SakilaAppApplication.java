package com.Sakila.api.SakilaApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
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
	private FilmCategoryRepository filmCategoryRepository;

	public SakilaAppApplication(ActorRepository actorRepository, FilmRepository filmRepository, CategoryRepository categoryRepository, FilmCategoryRepository filmCategoryRepository) {
		this.actorRepository = actorRepository;
		this.filmRepository = filmRepository;
		this.categoryRepository = categoryRepository;
		this.filmCategoryRepository = filmCategoryRepository;
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

	@GetMapping("/allFilmCategories")
	public @ResponseBody
	Iterable<FilmCategories> getAllFilmCategories(){
		return filmCategoryRepository.findAll();
	}


//	@PutMapping("/AddActor")
//	@ResponseBody
//	Optional<Actor> addActor(@RequestParam Integer id, @RequestParam String first_name, @RequestParam String last_name){
//		Actor actor = actorRepository.findById(id).get();
//		actor.first_name = first_name;
//		actor.last_name = last_name;
//		actorRepository.save(actor);
//		return actorRepository.findById(id);
//	}

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

	@GetMapping("/getActorName/{first_name}")
	public @ResponseBody
	List<Actor> getByFirstName(@PathVariable String first_name){
		return actorRepository.findByFirstName(first_name);
	}

	@GetMapping("/AllFilmCategories")
	public @ResponseBody
	Iterable<FilmCategories> getFilmCategory(){
		return filmCategoryRepository.findAll();
	}



	@GetMapping("/filmsByBudget/{budget}")
	public @ResponseBody
	List<Film> getByBudget(@PathVariable double budget) { return filmRepository.findByBudget(budget); }

	@GetMapping("/getByCategory/{id}")
	public @ResponseBody
	Iterable<Film> getByCategory(@PathVariable Integer id){
		return filmRepository.findByCategory(id);
	}

	//A change for a commit
}
