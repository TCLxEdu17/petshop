package org.domain.usecase;

import org.domain.entity.Pet;

public interface CreatePetUseCase {

    Pet execute (String name,
                String species,
                String breed,
                Integer age);
}
