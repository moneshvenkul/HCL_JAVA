package com.hcl.pp.actions.dao;

import java.util.List;

import com.hcl.pp.actions.entity.Pet;

public interface PetDAO {

	public Pet getPetById(int id);

	public Pet savePet(Pet pet);

	public List<Pet> fetchAll();

}
