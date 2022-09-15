package CucumberTests;

import com.Sakila.api.SakilaApp.Actor;
import com.Sakila.api.SakilaApp.ActorRepository;
import com.Sakila.api.SakilaApp.CategoryRepository;
import com.Sakila.api.SakilaApp.FilmRepository;
import org.junit.jupiter.api.Test;

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
    Iterable<Actor> GetAllActors() {
        return testActorRepo.findAll();
    }
}
