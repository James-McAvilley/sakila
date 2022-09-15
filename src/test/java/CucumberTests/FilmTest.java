package CucumberTests;

import com.Sakila.api.SakilaApp.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
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

    Film testFilm = new Film(1, "Test", "Test", 1, 1, 1, 1.0, 1, 1, "Test");

    @Test
    void FilmConstructor() {
        Film tempFilm = new Film(1, "Test", "Test", 1, 1, 1, 1.0, 1, 1, "Test");
        assertEquals(tempFilm.getFilmId(), tempFilm.getFilmId(), "Id failed");
        assertEquals(tempFilm.getFilmTitle(), tempFilm.getFilmTitle(), "Title failed");
        assertEquals(tempFilm.getFilmDesc(), testFilm.getFilmDesc(), "Description failed");
        assertEquals(tempFilm.getFilmYear(), testFilm.getFilmYear(), "Year failed");
        assertEquals(tempFilm.getFilmLang(), testFilm.getFilmLang(), "Language failed");
        assertEquals(tempFilm.getFilmRentDur(), testFilm.getFilmRentDur(), "Rent duration failed");
        assertEquals(tempFilm.getFilmRentRate(), tempFilm.getFilmRentRate(), "Rent rate failed");
        assertEquals(tempFilm.getReplacementCost(), testFilm.getReplacementCost(), "Replacement cost failed");
        assertEquals(tempFilm.getFilmLength(), testFilm.getFilmLength(), "Length failed");
        assertEquals(tempFilm.getFilmRating(), testFilm.getFilmRating(), "Rating failed");
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
