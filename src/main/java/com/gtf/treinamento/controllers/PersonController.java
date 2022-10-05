package com.gtf.treinamento.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gtf.treinamento.entities.Person;
import com.gtf.treinamento.services.PersonService;

@Controller
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	PersonService personService;
	
	@GetMapping
	public ModelAndView getPerson() {
		
		
		ModelAndView mv = new ModelAndView("person.html");
		
		Person person = personService.createPerson();
		
		mv.addObject("person", person);
		
		return mv;
		
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/cadastrar")
	public ModelAndView formPerson() {
		ModelAndView mv = new ModelAndView("formperson.html");
		mv.addObject("person", new Person());
		
		return mv;
	}
	
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView newPerson(Person person) {

		ModelAndView mv = new ModelAndView("person.html");
		mv.addObject("person", person);
		
		return mv;
		
		
	}
	
	

}
