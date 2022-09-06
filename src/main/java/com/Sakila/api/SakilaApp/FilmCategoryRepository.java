package com.Sakila.api.SakilaApp;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FilmCategoryRepository extends CrudRepository<FilmCategories, Integer> {
    @Query("SELECT Film.title, Category.name FROM Film INNER JOIN Category ON Film.categoryId = Category.categoryId")
    List<Film> findByCategory(String category);

}
