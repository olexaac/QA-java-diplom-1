import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Bun;
import praktikum.Database;
import praktikum.Ingredient;

import java.util.List;

import static java.util.Optional.empty;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;


@RunWith(MockitoJUnitRunner.class)
public class DatabaseTest {

    @Test
    public void containsListOfBuns(){
        Database database = new Database();
        List<Bun> actualListOfBuns =  database.availableBuns();
        assertThat(actualListOfBuns, is(not(empty())));
    }

    @Test
    public void containsListOfIngredients(){
        Database database = new Database();
        List<Ingredient> actualListOfIngredients =  database.availableIngredients();
        assertThat(actualListOfIngredients, is(not(empty())));
    }
}
