package org.domain.usecase.impl;

import jakarta.enterprise.context.ApplicationScoped;
import org.domain.entity.Pet;
import org.domain.repository.PetRepository;
import org.domain.usecase.UpdatePetUseCase;

import java.time.LocalDateTime;
import java.util.UUID;

@ApplicationScoped
public class UpdatePetUseCaseImpl implements UpdatePetUseCase {

    private final PetRepository petRepository;

    public UpdatePetUseCaseImpl(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Pet execute(UUID id,
                       String name,
                       String species,
                       String breed,
                       Integer age) {
        petRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Pet not Found: " +id));
        var updated = new Pet(id, name, species, breed, age, null, LocalDateTime.now());
        return petRepository.update(updated);

    }
}
