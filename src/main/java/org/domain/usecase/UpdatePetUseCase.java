package org.domain.usecase;

import org.domain.entity.Pet;

import java.util.UUID;

public interface UpdatePetUseCase {

    Pet execute (UUID id,
                String name,
                String species,
                String breed,
                Integer age);
}
