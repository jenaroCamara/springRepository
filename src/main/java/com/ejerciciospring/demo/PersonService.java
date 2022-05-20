package com.ejerciciospring.demo;

import java.util.List;

public interface PersonService {
    String getNombre();
    String getCiudad();
    String getEdad();

    Persona getPersona();
    void setNombre(String nombre);
    void setCiudad(String ciudad);
    void setEdad(String edad);
    public List<Ciudad> getListaCiudades();
    public void anadirListaCiudades(Ciudad c);
    public String devolverBean1();
    public String devolverBean2();
    public String devolverBean3();
    public String getNombreCiudad();

}
