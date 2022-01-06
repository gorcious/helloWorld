package com.springboot.petclinic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.petclinic.dao.OwnerRepository;
import com.springboot.petclinic.exception.OwnerNotFoundException;
import com.springboot.petclinic.model.Owner;

@Service
public class PetClinicServiceImpl implements PetClinicService{

	private OwnerRepository ownerRepository;
	
	@Autowired
	public void setOwnerRepository(OwnerRepository ownerRepository) {
		this.ownerRepository = ownerRepository;
	}
	@Override
	public List<Owner> findOwners() {

		return ownerRepository.findAll();
	}

	@Override
	public List<Owner> findOwners(String lastName) {

		return ownerRepository.findByLastName(lastName);
	}

	@Override
	public Owner findOwner(Long id) throws OwnerNotFoundException {

		Owner owner = ownerRepository.findById(id);
		if(owner  == null) throw new OwnerNotFoundException("Owner not found with id :"+owner.getId());
		return owner;
	}

	@Override
	public void createOwner(Owner owner) {

		ownerRepository.createOwner(owner);
	}

	@Override
	public void updateOwner(Owner owner) {

		ownerRepository.updateOwner(owner);
	}

	@Override
	public void deleteOwner(Long id) {

		ownerRepository.deleteOWner(id);
	}

}
