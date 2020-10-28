package com.hcl.pp.actions.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hcl.pp.actions.dao.PetDAO;
import com.hcl.pp.actions.entity.Pet;

public class PetDAOImpl implements PetDAO {

	private static final Logger logger = LoggerFactory.getLogger(PetDAOImpl.class);
	private SessionFactory sessionFactory;

	@Override
	public Pet getPetById(int id) {
		return null;

	}

	@Override
	public Pet savePet(Pet pet) {

		Session session = this.sessionFactory.getCurrentSession();
		session.persist(pet);
		logger.info("Pet saved successfully, Pet Details=" + pet);
		return pet;

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Pet> fetchAll() {
		Session session = this.sessionFactory.getCurrentSession();
		Query createQuery = session.createQuery("from Pet");
		Query query = createQuery;
		List<Pet> list = query.list();
		logger.info("Pet loaded from database successfully");
		return list;

	}

}
