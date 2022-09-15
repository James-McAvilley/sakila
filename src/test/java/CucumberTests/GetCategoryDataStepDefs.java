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

public class GetCategoryDataStepDefs {
    private SakilaAppApplication sakilaAppApplication;

    @Mock
    private ActorRepository actorRepository;

    @Mock
    private FilmRepository filmRepository;

    @Mock
    private CategoryRepository categoryRepository;

    public GetCategoryDataStepDefs(){
        actorRepository = mock(ActorRepository.class);
        filmRepository = mock(FilmRepository.class);
        categoryRepository = mock(CategoryRepository.class);
        sakilaAppApplication = new SakilaAppApplication(actorRepository, filmRepository, categoryRepository);
    }

    Category testCategory;
    Category expected;

    @Given("Category has an ID")
    public void i_have_an_id() {
        int id = 1;
        expected = new Category();
        expected.setCategoryId(1);
        expected.setCategoryName("I'M A TEST");
    }

    @Given("The ID has a Category in the database")
    public void the_id_has_a_movie_in_the_database() {
        when(categoryRepository.findById(1)).thenReturn(Optional.of(expected));
        categoryRepository.findById(1).get();
    }
    @When("A request is made for the Category data")
    public void a_request_is_made_for_the_data() {
        when(categoryRepository.findById(1)).thenReturn(Optional.of(expected));
        testCategory = categoryRepository.findById(1).get();
    }

    @Then("Return the correct Category data")
    public void return_the_correct_data() {
        Assertions.assertEquals(expected, testCategory, "incorrect category");
    }
}
