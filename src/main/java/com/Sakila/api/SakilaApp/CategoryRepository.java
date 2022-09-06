package com.Sakila.api.SakilaApp;

import org.springframework.data.repository.CrudRepository;

import javax.persistence.ManyToMany;
import java.util.Set;

public interface CategoryRepository extends CrudRepository<Category, Integer>{

}
