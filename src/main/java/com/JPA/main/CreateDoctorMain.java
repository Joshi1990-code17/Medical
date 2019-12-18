package com.JPA.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.JPA.entities.DoctorEntity;
import com.JPA.repositories.DoctorRepository;

public class CreateDoctorMain {

	public static void main(String[] args) {

		ApplicationContext ctxt = new ClassPathXmlApplicationContext("application-context.xml");

		DoctorRepository dr = (DoctorRepository) ctxt.getBean("doctorRepository");

		DoctorEntity d1 = new DoctorEntity();

		d1.setName("Dr.Jay");
		d1.setPhoneno("5717894367");
		d1.setSpeciality("Heart");
		d1.setDepartment("Surgery");

		dr.save(d1);
	}
}
