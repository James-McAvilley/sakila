package com.Sakila.api.SakilaApp;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "actor")
public class Actor {
    //Attributes
    @Id
    @Column(name = "actor_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int actorId;
    @Column(name = "first_name")
    String first_name;
    @Column(name = "last_name")
    String last_name;



    //Constructors
    public Actor(int actorId, String first_name, String last_name){
        this.actorId = actorId;
        this.first_name = first_name;
        this.last_name = last_name;
    };
    public Actor(){};

    //Methods

    public int getActorId() {
        return actorId;
    }

    public void setActorId(int actorId) {
        this.actorId = actorId;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }



}
