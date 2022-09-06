package com.Sakila.api.SakilaApp;

import javax.persistence.*;

@Table(name = "film_category")
@Entity
public class FilmCategories {
    @EmbeddedId
    FilmCategoriesKey Id;

    @ManyToOne
    @MapsId("filmId")
    @JoinColumn(name = "film_id")
    Film film;

    @ManyToOne
    @MapsId("categoryId")
    @JoinColumn(name = "category_id")
    Category category;

    public FilmCategories(FilmCategoriesKey id, Film film, Category category) {
        Id = id;
        this.film = film;
        this.category = category;
    }

    public FilmCategories(){}

    public FilmCategoriesKey getId() {
        return Id;
    }

    public void setId(FilmCategoriesKey id) {
        Id = id;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
