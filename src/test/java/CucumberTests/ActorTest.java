package CucumberTests;

import com.Sakila.api.SakilaApp.*;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

public class ActorTest {
    Actor tester = new Actor();
    private ActorRepository actorRepository;
    private FilmRepository filmRepository;
    private CategoryRepository categoryRepository;
    SakilaAppApplication sakilaAppApplication;

    public ActorTest(){
        actorRepository = mock(ActorRepository.class);
        filmRepository = mock(FilmRepository.class);
        categoryRepository = mock(CategoryRepository.class);
        sakilaAppApplication = new SakilaAppApplication(actorRepository, filmRepository, categoryRepository);
    }

    @Test
    void GetNewActor() {
        Actor testActor = new Actor();
    }

    @Test
    void GetActorId() {
        tester.getActorId();
    }

    @Test
    void SetActorId() {
        tester.setActorId(1);
    }

    @Test
    void GetActorFirstName() {
        tester.getFirstName();
    }

    @Test
    void SetActorFirstName() {
        tester.setFirstName("Test first");
    }

    @Test
    void GetActorLastName() {
        tester.getLastName();
    }

    @Test
    void SetActorLastName() {
        tester.setLastName("Test last");
    }

}
