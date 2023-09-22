package com.example.FoodFitHub.repository;

import com.example.FoodFitHub.entity.NutritionPlan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NutritionPlanRepository extends JpaRepository<NutritionPlan,Long> {
}
