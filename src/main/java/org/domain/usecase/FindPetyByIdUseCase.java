package org.domain.usecase;

import org.domain.entity.Pet;

import java.util.UUID;

public interface FindPetyByIdUseCase {
    Pet execute(UUID id);
}
