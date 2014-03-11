package br.ufc.quixada.npi.ui;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.ufc.quixada.npi.model.Person;
import br.ufc.quixada.npi.service.PersonService;

public class Main {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		//ContatoService cs = (ContatoService)ctx.getBean("contatoServiceImpl");
		PersonService ps = (PersonService)ctx.getBean("PersonServiceImpl");
		try {
			ps.inser();;
		} catch (Exception e) {
			System.out.println("Não foi possível realizar a inserção");
		}
		
		List<Person> l = ps.findAll();

	    for (Person p : l) {
	    	System.out.println(p);
	    }
		ctx.close();
	}
	
}
