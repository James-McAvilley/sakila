package CucumberTests;

import com.Sakila.api.SakilaApp.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SakilaAppTest {

    @Mock
    ActorRepository actorRepository;

    @Mock
    FilmRepository filmRepository;

    @Mock
    CategoryRepository categoryRepository;

    private SakilaAppApplication sakilaAppApplication;

    @BeforeEach
    void SakilaAppTest(){
        sakilaAppApplication = new SakilaAppApplication(actorRepository, filmRepository, categoryRepository);
    }

    @Test
    public void testEquals_SymmetricFilm() {
        Film x = new Film();  // equals and hashCode check name field value
        Film y = new Film();
        x.setFilmTitle("1");
        y.setFilmTitle("1");
        Assertions.assertTrue(x.equals(y) && y.equals(x));
        Assertions.assertTrue(x.hashCode() == y.hashCode());
    }

    @Test
    public void testEquals_SymmetricCategory() {
        Category x = new Category();  // equals and hashCode check name field value
        Category y = new Category();
        x.setCategoryName("1");
        y.setCategoryName("1");
        Assertions.assertTrue(x.equals(y) && y.equals(x));
        Assertions.assertTrue(x.hashCode() == y.hashCode());
    }

    @Test
    public void testEquals_SymmetricActor() {
        Actor x = new Actor();  // equals and hashCode check name field value
        Actor y = new Actor();
        x.setFirstName("1");
        y.setFirstName("1");
        Assertions.assertTrue(x.equals(y) && y.equals(x));
        Assertions.assertTrue(x.hashCode() == y.hashCode());
    }

    //Testing getmapping method calls
    @Test
    void testGetAnActor(){
        sakilaAppApplication.getAllActors();
        sakilaAppApplication.getByActorId(1);
        sakilaAppApplication.getByFirstName("Test");
        when(actorRepository.findById(1)).thenReturn(Optional.of(new Actor()));
        Actor output = actorRepository.findById(1).get();
        Actor expected = new Actor();
        Assertions.assertEquals(expected, output, "Error");
    }

    @Test
    void testGetAFilm(){
        sakilaAppApplication.getAllFilms();
        sakilaAppApplication.getByFilmId(1);
        sakilaAppApplication.getByTitle("Test");
        sakilaAppApplication.getByBudget(5);
        sakilaAppApplication.getByDuration(90);
        sakilaAppApplication.getCategoryFilm("1");
        when(filmRepository.findById(1)).thenReturn(Optional.of(new Film()));
        Film output = filmRepository.findById(1).get();
        Film expected = new Film();
        Assertions.assertEquals(expected, output, "Error");
    }

    @Test
    void testGetACategory(){
        sakilaAppApplication.getAllCategories();
        sakilaAppApplication.getByCategoryId(1);
        when(categoryRepository.findById(1)).thenReturn(Optional.of(new Category()));
        Category output = categoryRepository.findById(1).get();
        Category expected = new Category();
        Assertions.assertEquals(expected, output, "Error");
    }





}
