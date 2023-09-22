package com.example.FoodFitHub.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.DayOfWeek;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "nutrition_plans")
public class NutritionPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Define a @ManyToOne relationship to User
    @ManyToOne
    @JoinColumn(name = "user_id",referencedColumnName = "id")
    private User user;

    // Define a @ManyToOne relationship to Meal
    @ManyToMany
    @JoinTable(
            name = "nutritionPlan_meal",
            joinColumns = @JoinColumn(name = "nutritionPlan_id"),
            inverseJoinColumns = @JoinColumn(name = "meal_id")
    )
    Set<Meal> meals;

    private DayOfWeek dayOfWeek;
}
