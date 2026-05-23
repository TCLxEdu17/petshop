package org.domain.usecase.impl;

import jakarta.enterprise.context.ApplicationScoped;
import org.domain.entity.Pet;
import org.domain.repository.PetRepository;
import org.domain.usecase.FindAllPetsUseCase;

import java.util.List;

@ApplicationScoped
public class FindAllPetsUseCaseImpl implements FindAllPetsUseCase {

    private final PetRepository petRepository;

    public FindAllPetsUseCaseImpl(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public List<Pet> execute() {
        return petRepository.findAll();
    }
}
