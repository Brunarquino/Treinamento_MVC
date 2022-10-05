package com.gtf.treinamento.services;

import org.springframework.stereotype.Service;

import com.gtf.treinamento.entities.Person;

@Service
public class PersonService {
	
	public Person createPerson() {
		Person person = new Person();
		person.setName("Ana Vitoria");
		person.setAge(13);
		person.setStatus(Boolean.TRUE);
		
		return person;
	}

}
