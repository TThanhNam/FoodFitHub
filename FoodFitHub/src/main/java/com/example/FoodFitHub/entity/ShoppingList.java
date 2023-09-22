//package com.example.FoodFitHub.entity;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import java.util.HashSet;
//import java.util.Set;
//
//@Entity
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@Table(name = "shopping_lists")
//public class ShoppingList {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    // Define a @ManyToOne relationship to User
//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private User user;
//
//    // Define a @ManyToMany relationship to Food
//    @ManyToMany
//    @JoinTable(name = "shopping_list_foods",
//            joinColumns = @JoinColumn(name = "shopping_list_id"),
//            inverseJoinColumns = @JoinColumn(name = "food_id"))
//    private Set<Food> foods = new HashSet<>();
//}
