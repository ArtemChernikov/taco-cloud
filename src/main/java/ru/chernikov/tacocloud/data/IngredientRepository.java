package ru.chernikov.tacocloud.data;

import ru.chernikov.tacocloud.model.Ingredient;

import java.util.Collection;
import java.util.Optional;

/**
 * @author Artem Chernikov
 * @version 1.0
 * @since 09.03.2023
 */
public interface IngredientRepository {
    Collection<Ingredient> findAll();

    Optional<Ingredient> findBiId(String id);

    Ingredient save(Ingredient ingredient);
}
