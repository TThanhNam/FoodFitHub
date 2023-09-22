package com.example.FoodFitHub.entity;

import com.example.FoodFitHub.emun.ActivityLevel;
import com.example.FoodFitHub.emun.Gender;
import com.example.FoodFitHub.emun.Goal;
import com.example.FoodFitHub.emun.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,columnDefinition = "nvarchar(255)")
    private String name;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private LocalDate dateOfBirth;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String image;
    private double height;
    private double weight;
    @Enumerated(EnumType.STRING)
    private Goal goal;
    @Enumerated(EnumType.STRING)
    private Role role;
    @Enumerated(EnumType.STRING)
    private ActivityLevel activityLevel;
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<NutritionPlan> nutritionPlan;
}
