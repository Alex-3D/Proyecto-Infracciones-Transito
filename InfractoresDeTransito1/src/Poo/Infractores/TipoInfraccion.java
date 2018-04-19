/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poo.Infractores;

import java.math.BigInteger;

/**
 *
 * @author Alex3D
 */
public class TipoInfraccion {
   Integer cantidadPuntosDescontados;
   Integer codigo;
   String Descripcion;
   Double importe;
   String Observacion;
   Float porsentageDescuento;

    public TipoInfraccion() {
    }

    public TipoInfraccion(Integer cantidadPuntosDescontados, Integer codigo, String Descripcion, Double importe, String Observacion, Float porsentageDescuento) {
        this.cantidadPuntosDescontados = cantidadPuntosDescontados;
        this.codigo = codigo;
        this.Descripcion = Descripcion;
        this.importe = importe;
        this.Observacion = Observacion;
        this.porsentageDescuento = porsentageDescuento;
    }

    public Integer getCantidadPuntosDescontados() {
        return cantidadPuntosDescontados;
    }

    public void setCantidadPuntosDescontados(Integer cantidadPuntosDescontados) {
        this.cantidadPuntosDescontados = cantidadPuntosDescontados;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public String getObservacion() {
        return Observacion;
    }

    public void setObservacion(String Observacion) {
        this.Observacion = Observacion;
    }

    public Float getPorsentageDescuento() {
        return porsentageDescuento;
    }

    public void setPorsentageDescuento(Float porsentageDescuento) {
        this.porsentageDescuento = porsentageDescuento;
    }

    @Override
    public String toString() {
        return "TipoInfraccion{" + "cantidadPuntosDescontados=" + cantidadPuntosDescontados + ", codigo=" + codigo + ", Descripcion=" + Descripcion + ", importe=" + importe + ", Observacion=" + Observacion + ", porsentageDescuento=" + porsentageDescuento + '}';
    }
         
}
