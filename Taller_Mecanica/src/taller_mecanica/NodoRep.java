/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_mecanica;

import java.time.LocalDate;

/**
 *
 * @author ander
 */
public class NodoRep {
    int Id;
    String TipoRepuestos;
    String detalle_servicio; 
    int costo;
    LocalDate fecha_Salida;
    NodoRep sigREP;
    

    NodoRep(int xced, String Tiposer, String detalle, int costo) {
    
    }

    public NodoRep(int Id, String TipoRepuestos, String detalle_servicio, int costo, LocalDate fecha_Salida) {
        this.Id = Id;
        this.TipoRepuestos = TipoRepuestos;
        this.detalle_servicio = detalle_servicio;
        this.costo = costo;
        this.fecha_Salida = fecha_Salida;
    }
    

    @Override
    public String toString() {
        return "NodoRep{" + "Id=" + Id + ", TipoRepuestos=" + TipoRepuestos + ", detalle_servicio=" + detalle_servicio + ", costo=" + costo + ", fecha_compra=" + fecha_Salida + '}';
    }

}
