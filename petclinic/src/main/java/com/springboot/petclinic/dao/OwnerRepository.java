package com.springboot.petclinic.dao;

import java.util.List;

import com.springboot.petclinic.model.Owner;

public interface OwnerRepository {
	
	List<Owner> findAll();
	Owner findById(Long id);
	List<Owner> findByLastName(String lastName);
	void createOwner(Owner owner);
	Owner updateOwner(Owner owner);
	void deleteOWner(Long id);
	
}
