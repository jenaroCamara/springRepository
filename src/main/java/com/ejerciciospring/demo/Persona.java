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

    public void setPersonaa(Persona p){
        name = p.getName();
        edad = p.getEDAD();
        ciudad = p.getCiudad();
    }

    public String getName(){
        return name;
    }
    public String getCiudad(){
        return ciudad;
    }
    public String getEDAD(){
        return edad;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}