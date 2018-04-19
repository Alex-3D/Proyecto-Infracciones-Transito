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
public class RutaNacional implements TipoDeRuta {
    String nombre;
    String Descripcion;

    public RutaNacional() {
    }

    public RutaNacional(String nombre, String Descripcion) {
        this.nombre = nombre;
        this.Descripcion = Descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
       
    @Override
    public boolean esRutaNacional() {
        return true;
    }

    @Override
    public boolean esRutaProvincial() {
        return false;
    }

    @Override
    public boolean esRutaInternacional() {
        return false;
    }
}
