package CucumberTests;

import com.Sakila.api.SakilaApp.ActorRepository;
import com.Sakila.api.SakilaApp.CategoryRepository;
import com.Sakila.api.SakilaApp.FilmRepository;
import com.Sakila.api.SakilaApp.SakilaAppApplication;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

public class SakilaAppTest {
    private ActorRepository actorRepository;
    private FilmRepository filmRepository;
    private CategoryRepository categoryRepository;
    SakilaAppApplication sakilaAppApplication;

    public SakilaAppTest(){
        actorRepository = mock(ActorRepository.class);
        filmRepository = mock(FilmRepository.class);
        categoryRepository = mock(CategoryRepository.class);
        sakilaAppApplication = new SakilaAppApplication(actorRepository, filmRepository, categoryRepository);
    }

    @Test
    void GetAllActors() {
        assertNotNull(actorRepository.findAll());
    }
}
