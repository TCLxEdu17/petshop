package org.domain.usecase.impl;

import jakarta.enterprise.context.ApplicationScoped;
import org.domain.entity.Pet;
import org.domain.repository.PetRepository;
import org.domain.usecase.CreatePetUseCase;

import java.time.LocalDateTime;
import java.util.UUID;


@ApplicationScoped
public class CreatePetUseCaseImpl implements CreatePetUseCase {

    private final PetRepository petRepository;

    public CreatePetUseCaseImpl(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Pet execute(String name, String species, String breed, Integer age) {
       var pet = new Pet (UUID.randomUUID(), name, species, breed, age,
               LocalDateTime.now(), LocalDateTime.now());
       return petRepository.save(pet);
    }
}
