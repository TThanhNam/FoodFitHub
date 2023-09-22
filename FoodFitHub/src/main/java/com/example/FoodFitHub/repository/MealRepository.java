package com.example.FoodFitHub.repository;

import com.example.FoodFitHub.entity.Meal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MealRepository extends JpaRepository<Meal,Long> {
}
