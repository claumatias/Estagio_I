package br.ufc.quixada.npi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.ufc.quixada.npi.model.Person;
import br.ufc.quixada.npi.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository personRepository;

	public PersonServiceImpl() {
	}
	
	/* (non-Javadoc)
	 * @see br.ufc.quixada.npi.service.PersonService#inser()
	 */
	@Transactional
	public void inser(){
		personRepository.save(new Person ("Claudio", "Matias"));
		personRepository.save(new Person ("Antonio", "Oliveira"));
		personRepository.save(new Person ("Adss", "Tres"));
	}
	
	/* (non-Javadoc)
	 * @see br.ufc.quixada.npi.service.PersonService#findAll()
	 */
	public List <Person> findAll(){
		List<Person> l =  personRepository.findAll();
		return l;
	}
	
	
	
}
