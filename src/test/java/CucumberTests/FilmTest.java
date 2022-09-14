package CucumberTests;

import com.Sakila.api.SakilaApp.Film;
import com.Sakila.api.SakilaApp.FilmRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.mockito.Mockito.when;

public class FilmTest {
    Film testFilm = new Film();
    FilmRepository filmRepository;

    public FilmTest() {};

    @Test
    void GetFilm(){
        when(filmRepository.findById(1)).thenReturn(Optional.of(new Film()));
        Film output = filmRepository.findById(1).get();
        Film expected = new Film();
        Assertions.assertEquals(expected, output, "Film incorrect");
    }
}
