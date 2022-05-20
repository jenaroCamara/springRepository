package com.ejerciciospring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/c2")
public class Controlador2 {

    @Autowired PersonService personaService;

    @GetMapping("/hola")
    public String getHola(){
        return "Hola mundo";
    }

    @GetMapping("/hola/{nombre}")
    public String whatsup(@PathVariable(value = "nombre") String nombre) {
        return ("Hello "+ nombre);
    }

    @PostMapping("/useradd")
    public Persona createUser (@RequestBody Persona persona) {
        return persona;
    }

    @GetMapping("/getPersona")
    public Persona doubleNumber() {
        personaService.setEdad(Integer.toString(Integer.parseInt(personaService.getEdad())*2));
        return personaService.getPersona();
    }

    @GetMapping("/getCiudad")
    public List<Ciudad> addCiudad(){
        return personaService.getListaCiudades();
    }

}
