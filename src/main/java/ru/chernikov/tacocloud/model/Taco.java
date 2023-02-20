package ru.chernikov.tacocloud.model;

import lombok.Data;

import java.util.List;

/**
 * @author Artem Chernikov
 * @version 1.0
 * @since 20.02.2023
 */
@Data
public class Taco {
    private String name;
    private List<Ingredient> ingredients;
}
