package com.ejerciciospring.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService{

    Persona persona = new Persona();
    List<Ciudad> ListaCiudades;

    @Bean
    @Qualifier(value="ciudad")
    List<Ciudad> instanciaCiudad(){
        ListaCiudades = new ArrayList<Ciudad>();
        Ciudad c = new Ciudad("Jaen",500);
        Ciudad p = new Ciudad("Cordoba",600);
        ListaCiudades.add(c);ListaCiudades.add(p);
        return ListaCiudades;
    }
    @Bean
    @Qualifier(value="Bean1")
    public String devolverBean1(){
        return "Bean1";
    }

    @Bean
    @Qualifier(value="Bean2")
    public String devolverBean2(){
        return "Bean2";
    }

    @Bean
    @Qualifier(value="Bean3")
    public String devolverBean3(){
        return "Bean3";
    }

    public List<Ciudad> getListaCiudades() {
        return ListaCiudades;
    }

    public void anadirListaCiudades(Ciudad c) {
        ListaCiudades.add(c);
    }

    public Persona getPersona() {
        return persona;
    }

    public String getNombre(){
        return persona.getName();
    }

    public String getNombreCiudad(){
        return persona.getName();
    }

    public String getCiudad(){
        return persona.getCiudad();
    }
    public String getEdad(){
        return persona.getEDAD();
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
