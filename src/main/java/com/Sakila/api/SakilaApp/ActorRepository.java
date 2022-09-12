package com.Sakila.api.SakilaApp;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface ActorRepository extends CrudRepository<Actor, Integer> {

    @Query("FROM Actor WHERE first_name = ?1")
    List<Actor> findByFirstName(String first_name);

    @Query("FROM Actor WHERE actor_id = ?1")
    List<Actor> findActorId(@PathVariable Integer actor_id);

}
