package com.ejerciciospring.demo;

import org.springframework.stereotype.Component;

@Component
public class Persona {
    String name;
    String edad;
    String ciudad;

    public Persona(){}
    public Persona(String name, String edad, String ciudad){
        this.name = name;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    public String getName(){
        return name;
    }
    public String getCiudad(){
        return ciudad;
    }
}