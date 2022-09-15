package com.Sakila.api.SakilaApp;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

public interface ActorRepository extends CrudRepository<Actor, Integer> {

    @Query(nativeQuery = true, value =" SELECT actor.* FROM Actor WHERE actor.first_name LIKE :Name%")
    List<Actor> findByFirstName(String Name);

    @Query("FROM Actor WHERE actor_id = ?1")
    Optional<Actor> findActorId(@PathVariable Integer actor_id);

    @Query("INSERT INTO actor (first_name, last_name VALUES (?firstName, ?lastName")
    List<Actor> addActor(@PathVariable String firstName, @PathVariable String lastName);

}
