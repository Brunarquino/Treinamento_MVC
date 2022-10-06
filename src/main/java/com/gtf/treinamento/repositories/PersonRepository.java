package com.gtf.treinamento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gtf.treinamento.entities.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{
	

}
