package br.ufc.quixada.npi.ui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import br.ufc.quixada.npi.model.Person;
import br.ufc.quixada.npi.service.PersonService;

@Component
public class Main2 {

	@Autowired
	private PersonService ps;

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Main2 main = (Main2) ctx.getBean("main2");
		try {
			main.ps.inser();
			;
		} catch (Exception e) {
			System.out.println("Não foi possível realizar a inserção");
		}

		List<Person> l = main.ps.findAll();

		for (Person p : l) {
			System.out.println(p);
		}
		ctx.close();
	}

}
