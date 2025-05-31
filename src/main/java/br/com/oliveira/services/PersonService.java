package br.com.oliveira.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.oliveira.models.Person;
import br.com.oliveira.repositories.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	PersonRepository repository;
	
	public List<Person> findAll(){
		return repository.findAll();
	}
	
	public Person create(Person person) {
		return repository.save(person);
	}
}
