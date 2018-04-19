/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poo.Infractores;

/**
 *
 * @author Alex3D
 */
public class Localidad {
    String nombre;
    Provincia provincia;

    public Localidad() {
    }

    public Localidad(String nombre, Provincia provincia) {
        this.nombre = nombre;
        this.provincia = provincia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Provincia deQueProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }        

    @Override
    public String toString() {
        return "Localidad{" + "nombre=" + nombre + ", provincia=" + provincia + '}';
    }
        
}
