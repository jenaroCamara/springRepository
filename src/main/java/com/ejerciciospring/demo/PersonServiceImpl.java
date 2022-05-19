package com.ejerciciospring.demo;

import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService{

    Persona persona = new Persona();

    public Persona getPersona() {
        return persona;
    }

    public String getNombre(){
        return persona.getName();
    }
    public String getCiudad(){
        return persona.getCiudad();
    }
    public String getEdad(){
        return persona.edad;
    }

    public void setNombre(String nombre){
        persona.name = nombre;
    }
    public void setCiudad(String ciudad){
        persona.ciudad = ciudad;
    }
    public void setEdad(String edad){
        persona.edad = edad;
    }
}
