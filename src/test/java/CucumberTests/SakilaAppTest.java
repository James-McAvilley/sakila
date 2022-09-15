package CucumberTests;

import com.Sakila.api.SakilaApp.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SakilaAppTest {

    @Mock
    ActorRepository actorRepository;

    @Mock
    FilmRepository filmRepository;

    @Mock
    CategoryRepository categoryRepository;

    private SakilaAppApplication sakilaAppApplication;

    @BeforeEach
    void SakilaAppTest(){
        sakilaAppApplication = new SakilaAppApplication(actorRepository, filmRepository, categoryRepository);
    }

    @Test
    void GetActorById() {
        Actor testActor = new Actor();
        when(actorRepository.findById(1)).thenReturn(Optional.of(testActor));
        Optional<Actor> actor = actorRepository.findById(1);
        Actor expected = testActor;
        Actor actual = actor.get();
        Assertions.assertEquals(expected, actual, "Error");
    }
}
