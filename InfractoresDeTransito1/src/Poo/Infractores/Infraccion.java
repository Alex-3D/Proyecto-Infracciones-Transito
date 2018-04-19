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
public class Infraccion {
    Integer cantidadDePuntosDescontados;
    Double Monto; //Usar  BigInteger (Fixed Point)
    String Observacion;
    TipoInfraccion tipo;

    public Infraccion() {
    }

    public Infraccion(Integer cantidadDePuntosDescontados, Double Monto, String Observacion, TipoInfraccion tipo) {
        this.cantidadDePuntosDescontados = cantidadDePuntosDescontados;
        this.Monto = Monto;
        this.Observacion = Observacion;
        this.tipo = tipo;
    }

    public Integer getCantidadDePuntosDescontados() {
        return cantidadDePuntosDescontados;
    }

    public void setCantidadDePuntosDescontados(Integer cantidadDePuntosDescontados) {
        this.cantidadDePuntosDescontados = cantidadDePuntosDescontados;
    }

    public Double getMonto() {
        return Monto;
    }

    public void setMonto(Double Monto) {
        this.Monto = Monto;
    }

    public String getObservacion() {
        return Observacion;
    }

    public void setObservacion(String Observacion) {
        this.Observacion = Observacion;
    }

    public TipoInfraccion getTipo() {
        return tipo;
    }

    public void setTipo(TipoInfraccion tipo) {
        this.tipo = tipo;
    }
    
    public Double calcularMontoConDescuento() {        
        return 1.0;
    }
}
