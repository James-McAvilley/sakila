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
    String filmTitle;
    @Column(name = "description")
    String filmDesc;

    @Column(name = "release_year")
    int filmYear;

    @Column(name = "language_id")
    int filmLang;

    @Column(name = "rental_duration")
    int filmRentDur;

    @Column(name = "rental_rate")
    double filmRentRate;
    @Column(name = "length")
    int filmLength;

    @Column(name = "replacement_cost")
    double replacementCost;

    @Column(name = "rating")
    String filmRating;

    //Constructor

    public Film(int filmId, String filmTitle, String filmDesc, int filmYear,
                int filmLang, int filmRentDur, double filmRentRate, int filmLength,
                double replacementCost, String filmRating){
        this.filmId = filmId;
        this.filmTitle = filmTitle;
        this.filmDesc = filmDesc;
        this.filmYear = filmYear;
        this.filmLang = filmLang;
        this.filmRentDur = filmRentDur;
        this.filmRentRate = filmRentRate;
        this.replacementCost = replacementCost;
        this.filmLength = filmLength;
        this.filmRating = filmRating;

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
        return filmTitle;
    }

    public void setFilmTitle(String filmTtitle) {this.filmTitle = filmTitle;}

    public String getFilmDesc() {
        return filmDesc;
    }

    public void setFilmDesc(String filmDesc) {
        this.filmDesc = filmDesc;
    }

    public int getFilmYear() {
        return filmYear;
    }

    public void setFilmYear(int film_year) {
        this.filmYear = filmYear;
    }

    public int getFilmLang() {
        return filmLang;
    }

    public void setFilmLang(int filmLang) {
        this.filmLang = filmLang;
    }

    public int getFilmRentDur() {
        return filmRentDur;
    }

    public void setFilmRentDur(int filmRentDur) {
        this.filmRentDur = filmRentDur;
    }

    public double getFilmRentRate() {
        return filmRentRate;
    }

    public void setFilmRentRate(double filmRentRate) {
        this.filmRentRate = filmRentRate;
    }

    public int getFilmLength() {
        return filmLength;
    }

    public void setFilmLength(int filmLength) {
        this.filmLength = filmLength;
    }

    public double getReplacementCost() {
        return replacementCost;
    }

    public void setReplacementCost(double replacementCost) {
        this.replacementCost = replacementCost;
    }

    public String getFilmRating() {
        return filmRating;
    }

    public void setFilmRating(String filmRating) {
        this.filmRating = filmRating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return filmId == film.filmId && filmYear == film.filmYear && filmLang == film.filmLang && filmRentDur == film.filmRentDur && Double.compare(film.filmRentRate, filmRentRate) == 0 && filmLength == film.filmLength && Double.compare(film.replacementCost, replacementCost) == 0 && Objects.equals(filmTitle, film.filmTitle) && Objects.equals(filmDesc, film.filmDesc) && Objects.equals(filmRating, film.filmRating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filmId, filmTitle, filmDesc, filmYear, filmLang, filmRentDur, filmRentRate, filmLength, replacementCost, filmRating);
    }


}
