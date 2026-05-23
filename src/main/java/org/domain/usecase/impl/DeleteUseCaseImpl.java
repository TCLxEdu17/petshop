package org.domain.usecase.impl;

import jakarta.enterprise.context.ApplicationScoped;
import org.domain.repository.PetRepository;
import org.domain.usecase.DeletePetUseCase;

import java.util.UUID;


@ApplicationScoped
public class DeleteUseCaseImpl implements DeletePetUseCase {

    private final PetRepository petRepository;

    public DeleteUseCaseImpl(final PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public void execute(final UUID id) {
        petRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pet not found: " + id));
        petRepository.delete(id);
    }
}
