package org.domain.usecase;

import org.domain.entity.Pet;
import org.domain.repository.PetRepository;

import java.time.LocalDateTime;
import java.util.UUID;

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
