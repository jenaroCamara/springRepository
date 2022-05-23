package com.ejerciciospring.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Ciudad {
    String nombre;
    int numeroHabitantes;


    public Ciudad (){
    }
    public Ciudad (String nombre, int numeroHabitantes){
        this.nombre = nombre;
        this.numeroHabitantes = numeroHabitantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroHabitantes() {
        return numeroHabitantes;
    }

    public void setNumeroHabitantes(int numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }

    @Bean
    @Qualifier(value="Tercera Clase")
    CommandLineRunner ejecutame3clase(String h){
        return c->{
            System.out.println("Hola desde la tercera clase" + h);
        };
    }//Esto hay que modificarlo porque no se por donde tengo que inicializar el string h.

}
