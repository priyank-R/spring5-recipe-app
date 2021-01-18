package guru.springframework.recipe.repositories;

import guru.springframework.recipe.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepositories extends CrudRepository<Recipe,Long> {

}
