package ru.chernikov.tacocloud.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import ru.chernikov.tacocloud.data.IngredientRepository;
import ru.chernikov.tacocloud.model.Ingredient;

/**
 * @author Artem Chernikov
 * @version 1.1
 * @since 09.03.2023
 */
@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {

    private final IngredientRepository ingredientRepository;

    public IngredientByIdConverter(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public Ingredient convert(String id) {
        return ingredientRepository.findBiId(id).orElse(null);
    }
}
