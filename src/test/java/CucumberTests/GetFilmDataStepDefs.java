package CucumberTests;

import com.Sakila.api.SakilaApp.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GetFilmDataStepDefs {

    private SakilaAppApplication sakilaAppApplication;

    @Mock
    private ActorRepository actorRepository;

    @Mock
    private FilmRepository filmRepository;

    @Mock
    private CategoryRepository categoryRepository;

    public GetFilmDataStepDefs(){
        actorRepository = mock(ActorRepository.class);
        filmRepository = mock(FilmRepository.class);
        categoryRepository = mock(CategoryRepository.class);
        sakilaAppApplication = new SakilaAppApplication(actorRepository, filmRepository, categoryRepository);
    }

    Film testFilm;
    Film expected;

//    @Given("the application is running")
//    public void the_application_is_running() {
//
//        throw new io.cucumber.java.PendingException();
//    }
//    @When("the {string} loads")
//    public void the_loads(String string) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @When("the api connects")
//    public void the_api_connects() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("display a list of films")
//    public void display_a_list_of_films() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }

    @Given("I have an ID")
    public void i_have_an_id() {
        int id = 1;
        expected = new Film();
        expected.setFilmId(1);
        expected.setFilmTitle("I'M A TEST");
    }
    @Given("The ID has a movie in the database")
    public void the_id_has_a_movie_in_the_database() {
        when(filmRepository.findById(1)).thenReturn(Optional.of(expected));
        filmRepository.findById(1).get();
    }
    @When("A request is made for the data")
    public void a_request_is_made_for_the_data() {
        when(filmRepository.findById(1)).thenReturn(Optional.of(expected));
        testFilm = filmRepository.findById(1).get();
    }
    @Then("Return the correct data")
    public void return_the_correct_data() {
        Assertions.assertEquals(expected, testFilm, "incorrect film");
    }

}
