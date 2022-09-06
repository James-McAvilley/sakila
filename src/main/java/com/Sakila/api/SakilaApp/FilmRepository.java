package com.Sakila.api.SakilaApp;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
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




}
