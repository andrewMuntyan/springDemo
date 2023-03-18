package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import org.jetbrains.annotations.NotNull;
import org.springframework.data.annotation.Id;

@Entity
public class Employee {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;

    public Employee(String firstName, String lastName) {
    }

    public Employee() {

    }

    // Standard constructor, getters and setters
}
