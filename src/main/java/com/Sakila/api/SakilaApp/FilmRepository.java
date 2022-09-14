package com.Sakila.api.SakilaApp;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface FilmRepository extends CrudRepository<Film, Integer> {

    @Query("FROM Film WHERE rental_rate < ?1")
    List<Film> findByBudget(double budget);

    @Query("FROM Film WHERE length <= ?1")
    List<Film> findByDuration(int duration);

    @Query("FROM Film WHERE rental_rate < ?1 AND length <= ?2")
    List<Film> findByAll(double budget, int duration);

    @Query(nativeQuery = true, value = "SELECT film.* FROM film INNER JOIN film_category ON film.film_id = film_category.film_id INNER JOIN category ON film_category.category_id = category.category_id WHERE category.name = :id")
    Iterable<Film> getCategoryFilm(@PathVariable String id);

    @Query(nativeQuery = true, value = "SELECT film.* FROM Film WHERE film.title LIKE :Title%" )
    List<Film> findByTitle(@PathVariable String Title);


}
