package CucumberTests;

import com.Sakila.api.SakilaApp.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.mockito.Mockito.mock;


class FilmTest {
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
        tester.getFilmTitle();
    }

    @Test
    void SetFilmTitle() {
        tester.setFilmTitle("Test title");
    }

    @Test
    void GetFilmDescription() {
        tester.getFilmDesc();
    }

    @Test
    void SetFilmDescription() {
        tester.setFilmDesc("Test Description");
    }

    @Test
    void GetFilmYear() {
        tester.getFilmYear();
    }

    @Test
    void SetFilmYear() {
        tester.setFilmYear(2006);
    }

    @Test
    void GetFilmLanguage() {
        tester.getFilmLang();
    }

    @Test
    void SetFilmLanguage() {
        tester.setFilmLang(1);
    }

    @Test
    void GetFilmRentDuration() {
        tester.getFilmRentDur();
    }

    @Test
    void SetFilmRentDuration() {
        tester.setFilmRentDur(7);
    }

    @Test
    void GetFilmRentRate() {
        tester.getFilmRentRate();
    }

    @Test
    void SetFilmRentRate() {
        tester.setFilmRentRate(4.99);
    }

    @Test
    void GetFilmLength() {
        tester.getFilmLength();
    }

    @Test
    void SetFilmLength() {
        tester.setFilmLength(60);
    }

    @Test
    void GetReplacementCost() {
        tester.getReplacementCost();
    }

    @Test
    void SetReplacementCost() {
        tester.setReplacementCost(10);
    }

    @Test
    void GetFilmRating() {
        tester.getFilmRating();
    }

    @Test
    void SetFilmRating() {
        tester.setFilmRating("PG");
    }

}
