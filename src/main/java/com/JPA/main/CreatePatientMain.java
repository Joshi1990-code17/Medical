package com.JPA.main;

import java.util.Calendar;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.JPA.entities.PatientEntity;
import com.JPA.repositories.PatientRepository;

public class CreatePatientMain {

	public static void main(String[] args) {

		ApplicationContext ctxt = new ClassPathXmlApplicationContext("application-context.xml");
		PatientRepository pr = (PatientRepository) ctxt.getBean("patientRepository");

//	Calendar c = new Calendar();
//	c.set(1990, 08, 08);

		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 1995);
		c.set(Calendar.MONTH, 8);
		c.set(Calendar.DAY_OF_MONTH, 15);
		Date date = c.getTime();

		PatientEntity p1 = new PatientEntity();
		p1.setName("Kishor");
		p1.setEmail("Kishor@mail.com");
		p1.setLastfourssn("3333");
		p1.setPhone("57178955555");
		p1.setDob(date);

		pr.save(p1);
	}
}
