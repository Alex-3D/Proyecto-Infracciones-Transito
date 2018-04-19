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
class AutoridadConstatacion {
    String apellido;
    String DNI;
    LocalDate fechaNacimiento;
    Integer Legajo;
    String nombre;
    Integer NumeroPlaca;
    String Sexo;

    public AutoridadConstatacion() {
    }

    public AutoridadConstatacion(String apellido, String DNI, LocalDate fechaNacimiento, Integer Legajo, String nombre, Integer NumeroPlaca, String Sexo) {
        this.apellido = apellido;
        this.DNI = DNI;
        this.fechaNacimiento = fechaNacimiento;
        this.Legajo = Legajo;
        this.nombre = nombre;
        this.NumeroPlaca = NumeroPlaca;
        this.Sexo = Sexo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getLegajo() {
        return Legajo;
    }

    public void setLegajo(Integer Legajo) {
        this.Legajo = Legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumeroPlaca() {
        return NumeroPlaca;
    }

    public void setNumeroPlaca(Integer NumeroPlaca) {
        this.NumeroPlaca = NumeroPlaca;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    @Override
    public String toString() {
        return "AutoridadConstatacion{" + "apellido=" + apellido + ", DNI=" + DNI + ", fechaNacimiento=" + fechaNacimiento + ", Legajo=" + Legajo + ", nombre=" + nombre + ", NumeroPlaca=" + NumeroPlaca + ", Sexo=" + Sexo + '}';
    }
    
    public Integer cuantasInfraccioneslLabroEnPeriodo(LocalDate desde, LocalDate hasta) {
        return -1;
    }
}
