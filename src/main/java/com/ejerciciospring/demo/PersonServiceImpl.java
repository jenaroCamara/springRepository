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
    List<Persona> listaPersonas;

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
    @Qualifier(value="personas")
    List<Persona> instanciaPersonas(){
        listaPersonas = new ArrayList<Persona>();
        Persona p = new Persona("Jenaro","25","Jaen");
        Persona pe = new Persona("jose","24","Cordoba");
        listaPersonas.add(p);listaPersonas.add(pe);
        return listaPersonas;
    }

    @Bean
    @Qualifier("Bean1")
    public String devolverBean1(){
        return "Bean1";
    }

    @Bean
    @Qualifier("Bean2")
    public String devolverBean2(){
        return "Bean2";
    }

    @Bean
    @Qualifier("Bean3")
    public String devolverBean3(){
        return "Bean3";
    }

    public List<Ciudad> getListaCiudades() {
        return ListaCiudades;
    }
    public List<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void anadirListaCiudades(Ciudad c) {
        ListaCiudades.add(c);
    }

    public Persona getPersona() {
        return persona;
    }
    public void setPersona(Persona p){
        persona.setPersonaa(p);
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
