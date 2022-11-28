package edu.ignat.springinaction.util;

import edu.ignat.springinaction.model.Ingredient;
import jakarta.persistence.AttributeConverter;

public class IngredientTypeConverter implements AttributeConverter<Ingredient.Type, Integer> {

    @Override
    public Integer convertToDatabaseColumn(Ingredient.Type type) {
        return switch (type) {
            case WRAP -> 1;
            case PROTEIN -> 2;
            case VEGGIES -> 3;
            case CHEESE -> 4;
            case SAUCE -> 5;
        };
    }

    @Override
    public Ingredient.Type convertToEntityAttribute(Integer typeVal) {
        return switch (typeVal) {
            case 1 -> Ingredient.Type.WRAP;
            case 2 -> Ingredient.Type.PROTEIN;
            case 3 -> Ingredient.Type.VEGGIES;
            case 4 -> Ingredient.Type.CHEESE;
            case 5 -> Ingredient.Type.SAUCE;
            default -> throw new IllegalStateException("Unexpected value: " + typeVal);
        };
    }


    public static void main(String[] args) {

        IngredientTypeConverter converter = new IngredientTypeConverter();
        System.out.println(converter.convertToDatabaseColumn(Ingredient.Type.SAUCE));
    }
}
