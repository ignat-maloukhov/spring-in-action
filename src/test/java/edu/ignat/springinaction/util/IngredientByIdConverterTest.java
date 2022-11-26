package edu.ignat.springinaction.util;

import edu.ignat.springinaction.model.Ingredient;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IngredientByIdConverterTest {

    private final IngredientByIdConverter ingredientByIdConverter = new IngredientByIdConverter();

    @Test
    @DisplayName("Successful IngredientByIdConverter test")
    public void convertTest() {
        Ingredient expectedIngredient = new Ingredient("FLTO", "Flour Tortilla", Ingredient.Type.WRAP);

        assertEquals(expectedIngredient, ingredientByIdConverter.convert("FLTO"));

    }
}