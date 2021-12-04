package com.rlsp.springandangular12;


import com.rlsp.springandangular12.model.Program;
import com.rlsp.springandangular12.repository.ProgramsRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Springandangular12Application {

	public static void main(String[] args) {
		SpringApplication.run(Springandangular12Application.class, args);
	}

	/**
	 * Apenas para exemplo de DB
	 */
	@Bean
	CommandLineRunner initMockDataBase(ProgramsRepository programRepository) {
		return args -> {
			programRepository.deleteAll();
			Program program = new Program();

			program.setName("Jboss Management");
			program.setCategory("DevOps");

			programRepository.save(program);

			
		};
	}

}
