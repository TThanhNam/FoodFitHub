package com.example.FoodFitHub.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "dishes")
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private double calories;
    private double protein;
    private double carbohydrates;
    private double fat;
    @ManyToMany(mappedBy = "dishes")
    private Set<Meal> meals;
    @OneToOne(mappedBy = "dish")
    private Recipe recipe;
}
