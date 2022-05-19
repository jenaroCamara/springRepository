package com.ejerciciospring.demo;

public interface PersonService {
    String getNombre();
    String getCiudad();
    String getEdad();

    Persona getPersona();
    void setNombre(String nombre);
    void setCiudad(String ciudad);
    void setEdad(String edad);

}
