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
public class Pais {
    String nombre;
    List<Provincia> provincias;

    public Pais() {
        provincias= new ArrayList<>();
    }

    public Pais(String nombre, List<Provincia> provincias) {
        this.nombre = nombre;
        this.provincias = provincias;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Provincia> obtenerProvincias() {
        return provincias;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProvincias(List<Provincia> provincias) {
        this.provincias = provincias;
    }
    
    public Integer cuantasProvincias() {
        return provincias.size();
    }
}
