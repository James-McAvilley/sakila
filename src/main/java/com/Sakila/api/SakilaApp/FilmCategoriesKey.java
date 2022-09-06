package com.Sakila.api.SakilaApp;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class FilmCategoriesKey implements Serializable {
    @Column(name = "film_id")
    int film_Id;

    @Column(name = "category_id")
    int category_Id;

    public FilmCategoriesKey(int filmId, int categoryId) {
        this.film_Id = filmId;
        this.category_Id = categoryId;
    }

    public FilmCategoriesKey(){}

    public int getFilmId() {
        return film_Id;
    }

    public void setFilmId(int filmId) {
        this.film_Id = filmId;
    }

    public int getCategoryId() {
        return category_Id;
    }

    public void setCategoryId(int categoryId) {
        this.category_Id = categoryId;
    }
}
