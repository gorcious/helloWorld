package com.springboot.petclinic.dao.mem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.springboot.petclinic.dao.OwnerRepository;
import com.springboot.petclinic.model.Owner;

@Repository
public class OwnerRepositoryInMemoryImp implements OwnerRepository {

	private Map<Long, Owner> ownersMap = new HashMap<>();

	public OwnerRepositoryInMemoryImp() {

		Owner owner1 = new Owner();
		owner1.setId(1L);
		owner1.setName("Red");
		owner1.setLastName("Kit");
		Owner owner2 = new Owner();
		owner2.setId(2L);
		owner2.setName("Ali");
		owner2.setLastName("Veli");
		Owner owner3 = new Owner();
		owner3.setId(3L);
		owner3.setName("Kazım");
		owner3.setLastName("Kızım");
		Owner owner4 = new Owner();
		owner4.setId(4L);
		owner4.setName("Yapma");
		owner4.setLastName("Etme");
		ownersMap.put(owner1.getId(),owner1);
		ownersMap.put(owner2.getId(),owner2);
		ownersMap.put(owner3.getId(),owner3);
		ownersMap.put(owner4.getId(),owner4);
	}

	@Override
	public List<Owner> findAll() {

		return new ArrayList<>(ownersMap.values()) ;
	}

	@Override
	public Owner findById(Long id) {
		
		return ownersMap.get(id);
	}

	@Override
	public List<Owner> findByLastName(String lastName) {
		
		return ownersMap.values().stream()
				.filter(o -> o.getLastName().equalsIgnoreCase(lastName)).collect(Collectors.toList());
	}

	@Override
	public void createOwner(Owner owner) {
		// TODO Auto-generated method stub

	}

	@Override
	public Owner updateOwner(Owner owner) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteOWner(Long id) {
		// TODO Auto-generated method stub

	}

}
