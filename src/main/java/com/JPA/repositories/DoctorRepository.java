package com.JPA.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.JPA.entities.DoctorEntity;

@Repository
public class DoctorRepository {

	
	private EntityManager em;
	
	@Transactional
	public void save(DoctorEntity doctor) {
		em.persist(doctor);
	}

	public EntityManager getEm() {
		return em;
	}
	
	@PersistenceContext
	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	
}
