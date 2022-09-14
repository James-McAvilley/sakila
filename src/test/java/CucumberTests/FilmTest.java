package CucumberTests;

import com.Sakila.api.SakilaApp.Film;
import com.Sakila.api.SakilaApp.FilmRepository;
import com.Sakila.api.SakilaApp.SakilaAppApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FilmTest {
    Film testFilm = new Film();
    FilmRepository filmRepository;
    SakilaAppApplication sakilaAppApplication;

    public FilmTest(Film testFilm, FilmRepository filmRepository, SakilaAppApplication sakilaAppApplication) {
        this.testFilm = testFilm;
        this.filmRepository = filmRepository;
        this.sakilaAppApplication = sakilaAppApplication;
    }

    @Test
    void GetFilm(){
        when(filmRepository.findById(1)).thenReturn(Optional.of(new Film()));
        Film output = filmRepository.findById(1).get();
        Film expected = new Film();
        Assertions.assertEquals(expected, output, "Film incorrect");
    }
}
