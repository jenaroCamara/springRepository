package com.ejerciciospring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/c1")
public class Controlador1 {

    @Autowired PersonService personaService;

    @Autowired List<Ciudad> ListaCiudad;
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

    @GetMapping("/addPersona")
    public void doubleNumber(@RequestHeader("name") String name, @RequestHeader("ciudad") String ciudad, @RequestHeader("edad") String edad) {
        personaService.setEdad(edad);
        personaService.setNombre(name);
        personaService.setCiudad(ciudad);
    }

    @PostMapping("/addCiudad")
    public List<Ciudad> addCiudad(@RequestBody Ciudad c){
        personaService.anadirListaCiudades(c);
        List<Ciudad> l = personaService.getListaCiudades();
        return l;
    }
}
