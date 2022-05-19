package com.ejerciciospring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BasicoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicoApplication.class, args);
	}
	/*@Bean
	PersonService getPersonalservice(){
		PersonService p = new PersonServiceImpl();
		p.setNombre("Jenaro");
		return p;
	}*/
}
