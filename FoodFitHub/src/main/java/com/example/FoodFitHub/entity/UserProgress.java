//package com.example.FoodFitHub.entity;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import java.time.LocalDate;
//
//@Entity
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@Table(name = "user_progress")
//public class UserProgress {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    // Define a @ManyToOne relationship to User
//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private User user;
//
//    private LocalDate measurementDate;
//    private double weight;
//    private double measurementResult;
//}
