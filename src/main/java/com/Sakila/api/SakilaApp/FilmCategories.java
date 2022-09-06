package com.Sakila.api.SakilaApp;

import javax.persistence.*;

@Table(name = "film_category")
@Entity
public class FilmCategories {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @MapsId("filmId")
    @JoinColumn(name = "film_id")
    Film film;

    @ManyToOne
    @MapsId("categoryId")
    @JoinColumn(name = "category_id")
    Category category;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FilmCategories(Film film, Category category) {
        this.film = film;
        this.category = category;
    }

    public FilmCategories(){}

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
