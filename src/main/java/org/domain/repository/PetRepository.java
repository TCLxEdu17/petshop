package org.domain.repository;

import org.domain.entity.Pet;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PetRepository {

    Pet save(Pet pet);
    Optional<Pet> findById(UUID id);
    List<Pet> findAll();
    Pet update(Pet pet);
    void delete(UUID id);


}



