package com.springboot.petclinic.model;

import java.util.HashSet;
import java.util.Set;

public class Owner {

	private Long id;
	private String name;
	private String lastName;
	private Set<Pet> pets = new HashSet<>();
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Set<Pet> getPets() {
		return pets;
	}
	public void setPets(Set<Pet> pets) {
		this.pets = pets;
	}
	@Override
	public String toString() {
		return "Owner [id=" + id + ", name=" + name + ", lastName=" + lastName + "]";
	}
	
}
