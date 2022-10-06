package com.gtf.treinamento.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gtf.treinamento.entities.Person;
import com.gtf.treinamento.repositories.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	PersonRepository personRepository;
	
	public Person createPerson() {
		Person person = new Person();
		person.setName("Ana Vitoria");
		person.setAge(13);
		person.setStatus(Boolean.TRUE);
		
		return person;
	}
	
	public Person savePerson(Person person) {
		return personRepository.save(person);
	}
	
	public Person getPerson(Long id) throws Exception{
		Optional<Person> personOptional = personRepository.findById(id);
		
		Person person;
		
		if(!personOptional.isEmpty())
			person = personOptional.get();
		else
			throw new Exception("Person not found");
		
		return person;
		
	}
	
	public void deletePerson(Long id) throws Exception {
		
		Optional<Person> personOptional = personRepository.findById(id);
		
		if(!personOptional.isEmpty()) {
			personRepository.deleteById(id);
		}else {
			throw new Exception("Person not found");
		}
	}
	
	public List<Person> listPerson() {
		return personRepository.findAll();
	}

}
