package com.ejerciciospring.demo.CommandLineRunner;

import org.springframework.boot.CommandLineRunner;

public class Segunda implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hola desde la clase secundaria");
    }

    /*@Bean
    @Primary
    @Qualifier(value = "Clase Secundaria")
    CommandLineRunner ejecutame() {
        return p -> {
            System.out.println("Hola desde la clase secundaria");
        };
    }*/
}
