package com.ejerciciospring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Persona")
public class ControladorPersona {

    @Autowired
    PersonService personaService;

    @Autowired
    List<Ciudad> ListaCiudad;

    @PostMapping("/useradd")
    public Persona createUser(@RequestBody Persona persona) {
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

    //----------Post----------
    //AÑADE LA CIUDAD Y LA DEVUELVE EN UN OBJETO JSON RS1
    @PostMapping("/addPersona2")
    public List<Persona> addCiudad(@RequestBody Persona p) {
        List<Persona> listaPersonas = personaService.getListaPersonas();
        listaPersonas.add(p);
        return listaPersonas;
    }


    //---------Put------------
    //    @PostMapping("/useradd")  hacer este primero
    //http://localhost:8080/post?var1=1&var2=2)
    @PutMapping("/actualizarRP/{nombre}/{ciudad}")
    public Persona actualizar(@RequestParam String nombre, @RequestParam String ciudad) {
        Persona persona = personaService.getPersona();
        persona.setName(nombre);
        persona.setCiudad(ciudad);

        return personaService.getPersona();
    }

    //---------Put------------
    //    @PostMapping("/useradd")  hacer este primero
    //http://localhost:8080/post?var1=1&var2=2)
    @PutMapping("/actualizar")
    public Persona actualizar2(@RequestBody Persona persona) {
        personaService.setNombre(persona.getName());
        if (persona.getCiudad() != null)
            personaService.setCiudad(persona.getCiudad());
        if (persona.getEDAD() != null)
            personaService.setEdad(persona.getEDAD());

        return personaService.getPersona();
    }

    //---------Put------------
    //    @PostMapping("/useradd")  hacer este primero
    @PutMapping("/actualizar/{nombre}/{ciudad}/{edad}")
    public Persona actualizar(@RequestBody Persona persona) {
        personaService.setNombre(persona.getName());
        if(persona.getCiudad() != null)
            personaService.setCiudad(persona.getCiudad());
        if(persona.getEDAD() != null)
            personaService.setEdad(persona.getEDAD());

        return personaService.getPersona();
    }

    //---------Delete------------
    //    @PostMapping("/useradd")  hacer este primero
    @DeleteMapping("/delete/{nombre}")
    public String borrar(@PathVariable String nombre) {
        List<Persona> lista = personaService.getListaPersonas();
        /*Persona aux = lista.stream()
                .filter(p -> p.getName().equals(nombre));*/
        for (int iterator = 0; iterator<lista.size(); iterator++){
            if(lista.get(iterator).getName().equals(nombre)){
                lista.remove(iterator);
                return "El elemento está en la lista";
            }
        }
        return "El elemento no estaba en la lista";
    }

    //-------------get----------
    @GetMapping("/{ciudad}") //no tiene id, por lo que le voy a pasar la ciudad
    public Persona personaPorId(@PathVariable ("ciudad") String ciudad) {
        for (Persona persona: personaService.getListaPersonas()){
            if (persona.getCiudad().equals(ciudad))
                return persona;
        }
        return null;
    }

    //------------get-----------
    @GetMapping("/nombre/{nombre}")
    public Persona personaPorNombre(@PathVariable String nombre) {
        for (Persona persona: personaService.getListaPersonas()){
            if (persona.getName().equals(nombre))
                return persona;
        }
        return null;
    }

}
