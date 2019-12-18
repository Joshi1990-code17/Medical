package com.JPA.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.JPA.entities.PatientEntity;

@Repository
public class PatientRepository {

	
	private EntityManager em;
	
	@Transactional
	public void save(PatientEntity patient) {
		em.persist(patient);
		
	}

	public EntityManager getEm() {
		return em;
	}

	@PersistenceContext
	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	
	
	
}
