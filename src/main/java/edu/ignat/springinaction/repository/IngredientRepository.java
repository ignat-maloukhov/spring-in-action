package edu.ignat.springinaction.repository;

import edu.ignat.springinaction.model.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
