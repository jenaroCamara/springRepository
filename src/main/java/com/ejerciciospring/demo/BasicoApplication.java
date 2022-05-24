package com.ejerciciospring.demo;

import com.ejerciciospring.demo.CommandLineRunner.Segunda;
import com.ejerciciospring.demo.CommandLineRunner.Tercera;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@SpringBootApplication
public class BasicoApplication {
	public static String[] valores;
	public static void main(String[] args) {
		valores = args;
		SpringApplication.run(BasicoApplication.class, args);
	}

	@PostConstruct
	public void ProgramaPincipal(){
		System.out.println("Hola desde la clase inical");
	}

	@Bean
	Segunda saludo2(){
		return new Segunda();
	}
	@Bean
	Tercera saludo3(){
		Arrays.asList(valores).forEach(System.out::println);
		return new Tercera();
	}

}
