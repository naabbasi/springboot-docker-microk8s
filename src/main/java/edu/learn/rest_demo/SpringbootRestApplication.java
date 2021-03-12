package edu.learn.rest_demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import edu.learn.rest_demo.repos.UserRepo;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@EnableJpaRepositories
@ComponentScan(basePackages = {"edu.learn.rest_demo.controller", "edu.learn.rest_demo.entities"})
@SpringBootApplication
public class SpringbootRestApplication {

	@Bean
	public CommandLineRunner execute(UserRepo userRepo) {
		return args -> {
			/* userRepo.save(new User(UUID.randomUUID(), "nabbasi", "x"));
			userRepo.save(new User(UUID.randomUUID(), "fabbasi", "x"));
			userRepo.save(new User(UUID.randomUUID(), "aabbasi", "x"));
			log.info("Couting users ... {}", userRepo.count()); */
			log.info("I started before application");
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestApplication.class, args);
	}

}
