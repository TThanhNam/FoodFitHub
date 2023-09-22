package com.example.FoodFitHub.repository;

import com.example.FoodFitHub.entity.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishRepository extends JpaRepository<Dish,Long> {
}
