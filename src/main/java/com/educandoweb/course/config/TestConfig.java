package com.educandoweb.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

@Configuration
@Profile("test") 
public class TestConfig implements CommandLineRunner {
	
	@Autowired // automaticamente o Spring irá resolver a dependência e instanciar uma instância de UserRepository aqui dentro 
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception { // tudo dentro desse metodo será iniciado quando o programa rodar
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1,u2)); // Irá salvar a lista de u1 e u2 dentro do userRepository
		
	}
	
	
	
	
	
	

}
