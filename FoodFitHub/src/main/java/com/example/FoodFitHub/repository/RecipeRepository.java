package com.example.FoodFitHub.repository;

import com.example.FoodFitHub.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe,Long> {
}
