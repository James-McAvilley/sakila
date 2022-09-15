package CucumberTests;

import com.Sakila.api.SakilaApp.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
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

    Category testCategory = new Category(1, "Testing", "Tester");

    @Test
    void CategoryConstructor(){
        Category tempCategory = new Category();
        tempCategory.setCategoryId(1);
        tempCategory.setCategoryName("Testing");
        tempCategory.setCategoryUpdate("Tester");
        assertEquals(tempCategory.getCategoryId(), testCategory.getCategoryId(), "Id failed");
        assertEquals(tempCategory.getCategoryName(), testCategory.getCategoryName(), "Name failed");
        assertEquals(tempCategory.getCategoryUpdate(), testCategory.getCategoryUpdate(), "Update failed");
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
