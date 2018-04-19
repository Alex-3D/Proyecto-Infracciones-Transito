/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poo.Infractores;

import java.time.LocalDate;

/**
 *
 * @author Alex3D
 */
public class Vehiculo {
    LocalDate añoPatentamiento;
    String dominio;
    String color;
    Modelo modelo;

    public Vehiculo() {
    }

    public Vehiculo(LocalDate añoPatentamiento, String dominio, String color, Modelo modelo) {
        this.añoPatentamiento = añoPatentamiento;
        this.dominio = dominio;
        this.color = color;
        this.modelo = modelo;
    }
    

    public LocalDate getAñoPatentamiento() {
        return añoPatentamiento;
    }

    public void setAñoPatentamiento(LocalDate añoPatentamiento) {
        this.añoPatentamiento = añoPatentamiento;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public String toString() {
        return "Vehiculo{" + "a\u00f1oPatentamiento=" + añoPatentamiento + ", dominio=" + dominio + ", color=" + color + '}';
    }
    
    
}
