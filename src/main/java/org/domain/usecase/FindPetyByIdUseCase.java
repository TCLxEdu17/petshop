package org.domain.usecase;

import org.domain.entity.Pet;

import java.util.List;
import java.util.UUID;

public interface FindPetyUseCase {

    Pet findByID(UUID id);
    List<Pet> findAll();
}
