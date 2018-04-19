/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poo.Infractores;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alex3D
 */
public class Conductor {
    String apellido;
    String dni;
    LocalDate fechaNacimiento;
    String nombre;
    String Sexo;
    List<Licencia> licencias;

    public Conductor() {
        this.licencias = new ArrayList<>();
    }       

    public Conductor(String apellido, String dni, LocalDate fechaNacimiento, String nombre, String Sexo) {
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.Sexo = Sexo;
        this.licencias = new ArrayList<>();
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public List<Licencia> getLicencias() {
        return licencias;
    }
    
    public void agregarLicencia(Licencia Nueva) {
        licencias.add(Nueva);
    }
    
    public Integer cuantasActasEnPeriodo() {
        return -1;
    }
    
    public Integer cuantasInfraccionesEnPeriodo(LocalDate desde, LocalDate hasta) {
        Integer infraccionesEnPeriodo;
        infraccionesEnPeriodo = 0;
        
        for(Licencia unaLicencia: licencias) {
            if(unaLicencia.estasEnPeriodo(desde, hasta))
                infraccionesEnPeriodo += unaLicencia.cuantasInfraccionesEnPeriodo(desde, hasta);
        }
        return infraccionesEnPeriodo;
    }
    
    public List<Infraccion> obtenerInfraccionesEnPeriodo(LocalDateTime desde, LocalDateTime hasta) {
        return new ArrayList<>();
    }
    
    public OrganismoEmisor orgEmisorLicenciaVijente() {
        return new OrganismoEmisor();
    }
    
    public Double cuantoDebePorInfraccionesNoPagas(LocalDate desde, LocalDate hasta) {
        //BigDecimal cuanto = ;
        Double cuanto = 0.0;
        for(Licencia unaLicencia: licencias) {
            if(unaLicencia.estasEnPeriodo(desde, hasta))
                cuanto += unaLicencia.cuantoDebePorInfraccionesNoPagas(desde, hasta);
        }
        
        return cuanto;
    }
}
