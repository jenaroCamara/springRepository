package com.ejerciciospring.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class BasicoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicoApplication.class, args);
	}

	@PostConstruct
	public void ProgramaPincipal(){
		System.out.println("Hola desde la clase inical");
	}

}
