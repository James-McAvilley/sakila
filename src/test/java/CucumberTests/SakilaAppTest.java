package CucumberTests;

import com.Sakila.api.SakilaApp.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;

import static org.junit.Assert.assertNotNull;

public class SakilaAppTest {
    ActorRepository testActorRepo;
    FilmRepository testFilmRepo;
    CategoryRepository testCategoryRepo;

    public SakilaAppTest(ActorRepository testActorRepo, FilmRepository testFilmRepo, CategoryRepository testCategoryRepo) {
        this.testActorRepo = testActorRepo;
        this.testFilmRepo = testFilmRepo;
        this.testCategoryRepo = testCategoryRepo;
    }

    @Test
    void GetAllActors() {
        assertNotNull(testActorRepo.findAll());
    }
}
