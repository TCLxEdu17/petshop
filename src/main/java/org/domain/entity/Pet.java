package org.domain.entity;

import java.time.LocalDateTime;
import java.util.UUID;

public class Pet {

    private UUID id;
    private String name;
    private String species;
    private String breed;
    private Integer age;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public String getBreed() {
        return breed;
    }

    public Integer getAge() {
        return age;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }


    public Pet(UUID id, String name, String species, String breed, Integer age,
               LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.age = age;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    }
