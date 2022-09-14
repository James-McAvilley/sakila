package CucumberTests;

import com.Sakila.api.SakilaApp.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.Optional;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FilmTest {
    Film tester = new Film();
    private ActorRepository actorRepository;
    private FilmRepository filmRepository;
    private CategoryRepository categoryRepository;
    SakilaAppApplication sakilaAppApplication;

    public FilmTest(){
        actorRepository = mock(ActorRepository.class);
        filmRepository = mock(FilmRepository.class);
        categoryRepository = mock(CategoryRepository.class);
        sakilaAppApplication = new SakilaAppApplication(actorRepository, filmRepository, categoryRepository);
    }

    @Test
    void GetFilm(){
        Film testFilm = new Film();
    }

    @Test
    void GetFilmId(){
        tester.getFilmId();
    }

    @Test
    void SetFilmId(){
        tester.setFilmId(1);
    }

    @Test
    void GetFilmTitle() {
        tester.getFilm_title();
    }

    @Test
    void SetFilmTitle() {
        tester.setFilm_title("Test title");
    }

    @Test
    void GetFilmDescription() {
        tester.getFilm_desc();
    }

    @Test
    void SetFilmDescription() {
        tester.setFilm_desc("Test Description");
    }

}
