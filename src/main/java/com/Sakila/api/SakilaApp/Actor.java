package com.Sakila.api.SakilaApp;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "actor")
public class Actor {
    //Attributes
    @Id
    @Column(name = "actor_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int actorId;
    @Column(name = "first_name")
    String firstName;
    @Column(name = "last_name")
    String lastName;



    //Constructors
    public Actor(int actorId, String firstName, String lastName){
        this.actorId = actorId;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Actor(){}

    //Methods

    public int getActorId() {
        return actorId;
    }

    public void setActorId(int actorId) {
        this.actorId = actorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String first_name) {
        this.firstName = first_name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String last_name) {
        this.lastName = last_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return actorId == actor.actorId && Objects.equals(firstName, actor.firstName) && Objects.equals(lastName, actor.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actorId, firstName, lastName);
    }
}
