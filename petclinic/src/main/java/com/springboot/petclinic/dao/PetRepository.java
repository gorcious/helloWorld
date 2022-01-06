package com.springboot.petclinic.dao;

import java.util.List;

import com.springboot.petclinic.model.Owner;
import com.springboot.petclinic.model.Pet;

public interface PetRepository {

	Pet findById(Long id);
	List<Pet> findByOwner(Owner owner);
	void create(Pet pet);
	Pet updatePet(Pet pet);
	void delete(Long id);
	void deleteByOwnerId(Long id);
	
}
