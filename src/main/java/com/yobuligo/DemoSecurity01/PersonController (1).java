package com.yobuligo.DemoSecurity01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PersonController {

	// Wenn Sprint Security genutzt wird, dann wird automatisch ein Passwort erzeugt
	// und dem Standarduser "user" zugeordnet

	@GetMapping("/persons")
	public Person getPerson() {
		Person person = new Person();
		person.setFirstname("Max");
		person.setLastname("Müller");
		person.setAge(36);
		return person;
	}

	@GetMapping("/sendGreetings")
	public String sendGreetings() {
		GreetingService greetingService = new GreetingService();
		return greetingService.sendGreetings();
	}

}
