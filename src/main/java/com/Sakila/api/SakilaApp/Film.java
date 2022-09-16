package com.Sakila.api.SakilaApp;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "film")

public class Film {
    //Attributes
    @Id
    @Column(name = "film_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int filmId;
    @Column(name = "title")
    String film_title;
    @Column(name = "description")
    String film_desc;

    @Column(name = "release_year")
    int film_year;

    @Column(name = "language_id")
    int film_lang;

    @Column(name = "rental_duration")
    int film_rentDur;

    @Column(name = "rental_rate")
    double film_rentRate;
    @Column(name = "length")
    int film_length;

    @Column(name = "replacement_cost")
    double replacement_cost;

    @Column(name = "rating")
    String film_rating;

    //Constructor

    public Film(int filmId, String film_title, String film_desc, int film_year,
                int film_lang, int film_rentDur, double film_rentRate, int film_length,
                double replacement_cost, String film_rating){
        this.filmId = filmId;
        this.film_title = film_title;
        this.film_desc = film_desc;
        this.film_year = film_year;
        this.film_lang = film_lang;
        this.film_rentDur = film_rentDur;
        this.film_rentRate = film_rentRate;
        this.replacement_cost = replacement_cost;
        this.film_length = film_length;
        this.film_rating = film_rating;

    };
    public Film(){};

    //Getters and setters

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public String getFilmTitle() {
        return film_title;
    }

    public void setFilmTitle(String film_title) {
        this.film_title = film_title;
    }

    public String getFilmDesc() {
        return film_desc;
    }

    public void setFilmDesc(String film_desc) {
        this.film_desc = film_desc;
    }

    public int getFilmYear() {
        return film_year;
    }

    public void setFilmYear(int film_year) {
        this.film_year = film_year;
    }

    public int getFilmLang() {
        return film_lang;
    }

    public void setFilmLang(int film_lang) {
        this.film_lang = film_lang;
    }

    public int getFilmRentDur() {
        return film_rentDur;
    }

    public void setFilmRentDur(int film_rentDur) {
        this.film_rentDur = film_rentDur;
    }

    public double getFilmRentRate() {
        return film_rentRate;
    }

    public void setFilmRentRate(double film_rentRate) {
        this.film_rentRate = film_rentRate;
    }

    public int getFilmLength() {
        return film_length;
    }

    public void setFilmLength(int film_length) {
        this.film_length = film_length;
    }

    public double getReplacementCost() {
        return replacement_cost;
    }

    public void setReplacementCost(double replacement_cost) {
        this.replacement_cost = replacement_cost;
    }

    public String getFilmRating() {
        return film_rating;
    }

    public void setFilmRating(String film_rating) {
        this.film_rating = film_rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return filmId == film.filmId && film_year == film.film_year && film_lang == film.film_lang && film_rentDur == film.film_rentDur && Double.compare(film.film_rentRate, film_rentRate) == 0 && film_length == film.film_length && Double.compare(film.replacement_cost, replacement_cost) == 0 && Objects.equals(film_title, film.film_title) && Objects.equals(film_desc, film.film_desc) && Objects.equals(film_rating, film.film_rating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filmId, film_title, film_desc, film_year, film_lang, film_rentDur, film_rentRate, film_length, replacement_cost, film_rating);
    }


}
