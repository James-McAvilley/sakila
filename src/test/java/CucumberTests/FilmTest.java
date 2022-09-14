package CucumberTests;

import com.Sakila.api.SakilaApp.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.Optional;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FilmTest {
    Film testFilm = new Film();
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
        when(filmRepository.findById(1)).thenReturn(Optional.of(new Film()));
        Film output = filmRepository.findById(1).get();
        Film expected = new Film();
        Assertions.assertEquals(expected, output, "Film incorrect");
    }
}
