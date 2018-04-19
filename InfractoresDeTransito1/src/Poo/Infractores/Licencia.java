/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poo.Infractores;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Alex3D
 */
public class Licencia {
    LocalDate fechaVencimiento;
    LocalDate fechaDeOtorgamiento;
    Integer numero;
    List<ActaConstatacion> actas;

    public Licencia() {
    }

    public Licencia(LocalDate fechaVencimiento, Integer numero, LocalDate fechaDeOtorgamiento) {
        this.fechaVencimiento = fechaVencimiento;
        this.numero = numero;
        this.actas = new ArrayList<>();
        this.fechaDeOtorgamiento = fechaDeOtorgamiento;
    }

    public LocalDate getFechaDeOtorgamiento() {
        return fechaDeOtorgamiento;
    }

    public List<ActaConstatacion> getActas() {
        return actas;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    
    public boolean estasEnPeriodo(LocalDate desde, LocalDate hasta) {
        if(fechaDeOtorgamiento.isBefore(hasta))
            if(fechaDeOtorgamiento.isAfter(desde))
                return true;
        
        return false;
    }
    
    public Integer cuantasInfraccionesEnPeriodo(LocalDate desde, LocalDate hasta) {
        Integer infraccionesEnPeriodo = 0;
        
        for (Iterator<ActaConstatacion> it = actas.iterator(); it.hasNext();) {
            ActaConstatacion unActa = it.next();
            if(unActa.estasEnPeriodo(desde, hasta))
                infraccionesEnPeriodo += unActa.cuantasInfraccionesContiene();
        }
        
        return infraccionesEnPeriodo;
    }
    public Double cuantoDebePorInfraccionesNoPagas(LocalDate desde, LocalDate hasta) {
        Double cuantos = 0.0;
        
        for (ActaConstatacion unActa : actas) {
            if(unActa.estasEnPeriodo(desde, hasta) && !unActa.estaPagada())
                cuantos += unActa.calcularTotalInfracciones();
        }
        return cuantos;
    }
    
    @Override
    public String toString() {
        return "Licencia{" + "fechaVencimiento=" + fechaVencimiento + ", numero=" + numero + '}';
    }
    
}
