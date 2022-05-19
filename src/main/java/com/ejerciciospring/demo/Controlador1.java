package com.ejerciciospring.demo;

import org.springframework.web.bind.annotation.*;


@RestController
public class Controlador1 {


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

    /*@GetMapping("/persona/{name}")
    public Persona getPersona(){
        Persona p =new Persona("Jenaro",25,"Jaén");
        return p;
    }*/

}
