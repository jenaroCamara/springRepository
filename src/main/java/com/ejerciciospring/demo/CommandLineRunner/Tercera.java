package com.ejerciciospring.demo.CommandLineRunner;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

public class Tercera  implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Soy la tercera clase");
    }
    /*@Bean
    @Qualifier(value="Tercera Clase")
    CommandLineRunner ejecutame3clase(){
        return c->{
            System.out.println("Hola desde la tercera clase");
        };
    }/*/
}
