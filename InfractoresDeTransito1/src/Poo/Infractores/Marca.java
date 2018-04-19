/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poo.Infractores;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alex3D
 */
public class Marca {
    String nombre;
    List<Modelo> Modelos; 

    public Marca() {
        Modelos = new ArrayList<>();
    }

    public Marca(String nombre) {
        this.nombre = nombre;
        Modelos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Modelo> getModelos() {
        return Modelos;
    }

    public void setModelos(List<Modelo> Modelos) {
        this.Modelos = Modelos;
    }
    
    public void agregarModelo(Modelo nuevo) {
        Modelos.add(nuevo);
    }

    @Override
    public String toString() {
        return "Marca{" + "nombre=" + nombre + '}';
    }
}
