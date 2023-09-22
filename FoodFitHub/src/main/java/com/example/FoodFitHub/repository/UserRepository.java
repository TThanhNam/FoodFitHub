package com.example.FoodFitHub.repository;

import com.example.FoodFitHub.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
