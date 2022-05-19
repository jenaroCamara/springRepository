package com.ejerciciospring.demo;

public class Persona {
    String name;
    int edad;
    String ciudad;

    public Persona(){}
    public Persona(String name, int edad, String ciudad){
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