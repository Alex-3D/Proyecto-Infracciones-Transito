/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poo.Infractores;

import java.lang.Integer;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 *joaquinlrobles@gmail.com
 * @author Alex3D
 */
public class ActaConstatacion {    
    LocalDate fechaVencimientoPagoVoluntario;
    LocalDateTime fechaConstatacionHoraGeneracion;
    Ruta lugarConstatacion; 
    Integer numero; 
    String observaciones;
    Vehiculo unVehiculo;
    EstadoActa estado;
    List<Infraccion> infracciones;
    Licencia unaLicencia;
    AutoridadConstatacion autoridad;

    public ActaConstatacion() {
        this.infracciones = new ArrayList<>();
    }

    public ActaConstatacion(LocalDate fechaVencimientoPagoVoluntario, LocalDateTime fechaConstatacionHoraGeneracion, Ruta lugarConstatacion, Integer numero, String observaciones, Vehiculo unVehiculo, EstadoActa estado, List<Infraccion> infracciones, Licencia unaLicencia, AutoridadConstatacion autoridad) {
        this.fechaVencimientoPagoVoluntario = fechaVencimientoPagoVoluntario;
        this.fechaConstatacionHoraGeneracion = fechaConstatacionHoraGeneracion;
        this.lugarConstatacion = lugarConstatacion;
        this.numero = numero;
        this.observaciones = observaciones;
        this.unVehiculo = unVehiculo;
        this.estado = estado;
        this.infracciones = infracciones;
        this.unaLicencia = unaLicencia;
        this.autoridad = autoridad;
    }

    public LocalDateTime getFechaConstatacionHoraGeneracion() {
        return fechaConstatacionHoraGeneracion;
    }

    public void setFechaConstatacionHoraGeneracion(LocalDateTime fechaConstatacionHoraGeneracion) {
        this.fechaConstatacionHoraGeneracion = fechaConstatacionHoraGeneracion;
    }


    public LocalDate getFechaVencimientoPagoVoluntario() {
        return fechaVencimientoPagoVoluntario;
    }

    public void setFechaVencimientoPagoVoluntario(LocalDate fechaVencimientoPagoVoluntario) {
        this.fechaVencimientoPagoVoluntario = fechaVencimientoPagoVoluntario;
    }
   
    public Ruta getLugarConstatacion() {
        return lugarConstatacion;
    }

    public void setLugarConstatacion(Ruta lugarConstatacion) {
        this.lugarConstatacion = lugarConstatacion;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Vehiculo getUnVehiculo() {
        return unVehiculo;
    }

    public void setUnVehiculo(Vehiculo unVehiculo) {
        this.unVehiculo = unVehiculo;
    }

    public EstadoActa getEstado() {
        return estado;
    }

    public void setEstado(EstadoActa estado) {
        this.estado = estado;
    }

    public List<Infraccion> getInfracciones() {
        return infracciones;
    }

    public void setInfracciones(List<Infraccion> infracciones) {
        this.infracciones = infracciones;
    }

    public Licencia getUnaLicencia() {
        return unaLicencia;
    }

    public void setUnaLicencia(Licencia unaLicencia) {
        this.unaLicencia = unaLicencia;
    }

    public AutoridadConstatacion getAutoridad() {
        return autoridad;
    }

    public void setAutoridad(AutoridadConstatacion autoridad) {
        this.autoridad = autoridad;
    }
    
    public void agregarInfraccion(Infraccion nueva) {
        infracciones.add(nueva);
    }
    
    public Integer contarInfracciones(){
        return infracciones.size();
    }
    
    public Integer cuantasInfraccionesContiene() {
        return contarInfracciones();
    }
    
    public Double calcularTotalInfracciones(){                      
        return sumarMontoInfracciones();
    }
    
    public boolean fueLabradaEnPeriodo(){
        return true;
    }
    
    private Double sumarMontoInfracciones() {
        Double total = 0.0;
        
        for(Infraccion unaInfraccion : infracciones) 
            total += unaInfraccion.getMonto();        
        
        return total;
    }
    
    public boolean estaPagada() {
        return this.estado.EstaPago();
    }
    
    public boolean estaEnFechaDePagoVoluntario() {
        return true;
    }
    
    public boolean estasEnPeriodo(LocalDate desde, LocalDate hasta) {
        if(fechaConstatacionHoraGeneracion.isBefore(hasta.atTime(LocalTime.MIN)))
            if(fechaConstatacionHoraGeneracion.isAfter(desde.atTime(LocalTime.MIN)))
                return true;
        
        return false;
    }

    @Override
    public String toString() {
        return "ActaConstatacion{" + "fechaVencimientoPagoVoluntario=" + fechaVencimientoPagoVoluntario + ", fechaConstatacionHoraGeneracion=" + fechaConstatacionHoraGeneracion + ", lugarConstatacion=" + lugarConstatacion + ", numero=" + numero + ", observaciones=" + observaciones + ", unVehiculo=" + unVehiculo + ", estado=" + estado + ", infracciones=" + infracciones + ", unaLicencia=" + unaLicencia + ", autoridad=" + autoridad + '}';
    }
    
}
