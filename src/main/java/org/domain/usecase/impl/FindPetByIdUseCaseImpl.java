package org.domain.usecase.impl;

import jakarta.enterprise.context.ApplicationScoped;
import org.domain.entity.Pet;
import org.domain.repository.PetRepository;
import org.domain.usecase.FindPetyByIdUseCase;

import java.util.Optional;
import java.util.UUID;

@ApplicationScoped
public class FindPetByIdUseCaseImpl implements FindPetyByIdUseCase {

    private final PetRepository petRepository;

    public FindPetByIdUseCaseImpl(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Pet execute(UUID id) {
        return petRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pet not found: " + id));
    }
}
