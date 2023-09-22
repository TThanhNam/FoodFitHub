package com.example.FoodFitHub.repository;

import com.example.FoodFitHub.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food,Long> {
}
