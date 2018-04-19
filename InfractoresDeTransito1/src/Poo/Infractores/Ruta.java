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
public class Ruta {
    String nombre;
    Integer numero;
    TipoDeRuta tipo;

    public Ruta() {
    }

    public Ruta(String nombre, Integer numero, TipoDeRuta tipo) {
        this.nombre = nombre;
        this.numero = numero;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setTipo(TipoDeRuta tipo) {
        this.tipo = tipo;
    }

    public boolean esNacional() {
        return true;
    }
    
    public boolean esProvincial() {
        return true;
    }
    
    public boolean esInternacional() {
        return true;
    }   

    @Override
    public String toString() {
        return "Ruta{" + "nombre=" + nombre + ", numero=" + numero + ", tipo=" + tipo + '}';
    }
        
}
