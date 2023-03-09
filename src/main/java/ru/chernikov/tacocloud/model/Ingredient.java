package ru.chernikov.tacocloud.model;

import lombok.Data;

/**
 * @author Artem Chernikov
 * @version 1.1
 * @since 09.03.2023
 */
@Data
public class Ingredient {
    private final String id;
    private final String name;
    private final Type type;

    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
