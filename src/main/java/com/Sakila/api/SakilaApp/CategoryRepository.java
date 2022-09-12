package com.Sakila.api.SakilaApp;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.persistence.ManyToMany;
import java.util.Set;

public interface CategoryRepository extends CrudRepository<Category, Integer>{
    @Query(value = "SELECT Film.film_id, Film.title, Film.description, Film.release_year\n" +
            "Film.language_id, Film.rental_duration, Film.rental_rate, Film.length, Film.replacement_cost\n" +
            "Film.rating, Film.category_id FROM sakila.film\n" +
            "INNER JOIN film_category ON film_category.category_id = category.category_id\n" +
            "INNER JOIN film ON film.film_id = film_category.film_id\n" +
            "WHERE film.film_id = :id ;",
            nativeQuery = true)
    Iterable<Film> findByCategory(@Param("id") Integer id);

}
