package CucumberTests;

import com.Sakila.api.SakilaApp.*;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

public class CategoryTest {
    Category tester = new Category();
    private ActorRepository actorRepository;
    private FilmRepository filmRepository;
    private CategoryRepository categoryRepository;
    SakilaAppApplication sakilaAppApplication;

    public CategoryTest(){
        actorRepository = mock(ActorRepository.class);
        filmRepository = mock(FilmRepository.class);
        categoryRepository = mock(CategoryRepository.class);
        sakilaAppApplication = new SakilaAppApplication(actorRepository, filmRepository, categoryRepository);
    }

    @Test
    void GetCategory() {
        Category testCategory = new Category();
    }

    @Test
    void GetCategoryId() {
        tester.getCategoryId();
    }

    @Test
    void SetCategoryId() {
        tester.setCategoryId(1);
    }

    @Test
    void GetCategoryName() {
        tester.getCategoryName();
    }

    @Test
    void SetCategoryName() {
        tester.setCategoryName("Test");
    }

    @Test
    void GetCategoryUpdate() {
        tester.getCategoryUpdate();
    }

    @Test
    void SetCategoryUpdate() {
        tester.setCategoryUpdate("Test");
    }
}
