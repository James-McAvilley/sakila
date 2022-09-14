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

    @Test
    void GetFilmYear() {
        tester.getFilm_year();
    }

    @Test
    void SetFilmYear() {
        tester.setFilm_year(2006);
    }

    @Test
    void GetFilmLanguage() {
        tester.getFilm_lang();
    }

    @Test
    void SetFilmLanguage() {
        tester.setFilm_lang(1);
    }

    @Test
    void GetFilmRentDuration() {
        tester.getFilm_rentDur();
    }

    @Test
    void SetFilmRentDuration() {
        tester.setFilm_rentDur(7);
    }

    @Test
    void GetFilmRentRate() {
        tester.getFilm_rentRate();
    }

    @Test
    void SetFilmRentRate() {
        tester.setFilm_rentRate(4.99);
    }

}
