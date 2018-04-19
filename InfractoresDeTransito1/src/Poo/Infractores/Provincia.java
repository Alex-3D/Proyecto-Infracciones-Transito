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
public class Provincia {
    String nombre;
    Pais pais;
    List<Localidad> localidades;

    public Provincia() {
        localidades= new ArrayList<>();
    }

    public Provincia(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
        localidades= new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais deQuePais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public List<Localidad> obtenerLocalidades() {
        return localidades;
    }

    public void setLocalidades(List<Localidad> localidades) {
        this.localidades = localidades;
    }
    
    public Integer cuantasLocalidades() {
        return localidades.size();
    }
}
