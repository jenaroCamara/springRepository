package com.ejerciciospring.demo;

import org.springframework.beans.factory.annotation.Autowired;
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
        personaService.setPersona(persona);
        return persona;
    }

    @GetMapping("/addPersona")
    public Persona doubleNumber(@RequestHeader("nombre") String name, @RequestHeader("ciudad") String ciudad, @RequestHeader("edad") String edad) {
        personaService.setEdad(edad);
        personaService.setNombre(name);
        personaService.setCiudad(ciudad);
        return personaService.getPersona();
    }

    //AÑADE LA CIUDAD Y LA DEVUELVE EN UN OBJETO JSON RS1
    @PostMapping("/addCiudad")
    public List<Ciudad> addCiudad(@RequestBody Ciudad c){
        personaService.anadirListaCiudades(c);
        List<Ciudad> l = personaService.getListaCiudades();
        return l;
    }

    //OBTIENE UNA CIUDAD CUALQUIERA, PASADA POR LA URL RS1
    @GetMapping("/getCiudad/{nombre}")
    public Ciudad getCity(@PathVariable("nombre") String name) {
        List<Ciudad> lista = personaService.getListaCiudades();
        for (int i=0; i< lista.size(); i++){
            if (lista.get(i).getNombre().equals(name)){
                return lista.get(i);
            }
        }
        return null;
    }

    //-----------Devolver Beans------------------
    @GetMapping("/bean/{bean}")
    public String obtenerBean(@PathVariable String bean) {
        if(bean.equals("Bean1")){
            return personaService.devolverBean1();
        }else{
            if(bean.equals("Bean2")){
                return personaService.devolverBean2();
            }
        }
        return personaService.devolverBean3();
    }

}
