package CucumberTests;

import com.Sakila.api.SakilaApp.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mock;

import java.util.Optional;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GetActorDataStepDefs {

    private SakilaAppApplication sakilaAppApplication;

    @Mock
    private ActorRepository actorRepository;

    @Mock
    private FilmRepository filmRepository;

    @Mock
    private CategoryRepository categoryRepository;

    public GetActorDataStepDefs(){
        actorRepository = mock(ActorRepository.class);
        filmRepository = mock(FilmRepository.class);
        categoryRepository = mock(CategoryRepository.class);
        sakilaAppApplication = new SakilaAppApplication(actorRepository, filmRepository, categoryRepository);
    }

    Actor testActor;
    Actor expected;



    @Given("Actor has an ID")
    public void i_have_an_id() {
        int id = 1;
        expected = new Actor();
        expected.setActorId(1);
        expected.setFirst_name("I'M A TEST");
    }
    @Given("The ID has a Actor in the database")
    public void the_id_has_a_movie_in_the_database() {
        when(actorRepository.findById(1)).thenReturn(Optional.of(expected));
        actorRepository.findById(1).get();
    }
    @When("A request is made for the actors data")
    public void a_request_is_made_for_the_data() {
        when(actorRepository.findById(1)).thenReturn(Optional.of(expected));
        testActor = actorRepository.findById(1).get();
    }
    @Then("Return the correct actor data")
    public void return_the_correct_data() {
        Assertions.assertEquals(expected, testActor, "incorrect actor");
    }
}
