package org.domain.usecase;

import org.domain.entity.Pet;

import java.util.List;

public interface FindAllPetsUseCase {

    List<Pet> execute();
}
