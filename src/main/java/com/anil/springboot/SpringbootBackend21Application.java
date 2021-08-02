package com.anil.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.anil.springboot.model.User;
import com.anil.springboot.repository.UserRepository;

/*
 * This is the test project to demostrate how React talks to Spring boot. * 
 */


@SpringBootApplication
public class SpringbootBackend21Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackend21Application.class, args);
	}
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Anil1", "Sharma1", "asharma1@gmail.com"));
		this.userRepository.save(new User("Anil2", "Sharma2", "asharma2@gmail.com"));
		this.userRepository.save(new User("Anil3", "Sharma3", "asharma3@gmail.com"));
		this.userRepository.save(new User("Anil4", "Sharma4", "asharma4@gmail.com"));
		this.userRepository.save(new User("Anil5", "Sharma5", "asharma5@gmail.com"));
		this.userRepository.save(new User("Anil6", "Sharma6", "asharma6@gmail.com"));
	}

}
