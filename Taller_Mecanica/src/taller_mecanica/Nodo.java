
package taller_mecanica;


import java.util.Date;


public class Nodo {
    
    int cedula;
    String nombre;
    String direccion;
    String telefono;
    String placa;
    String marca;
    String modelo;
    String motivo_i;
    Date fec_Ingreso;
    Nodo sig, ant;
    NodoRep priRep;
    public Nodo(int cedula, String nombre, String direccion, String telefono, String placa, String marca, String modelo, String motivo_i, Date fec_Ingreso) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.motivo_i = motivo_i;
        this.priRep = null;
        this.fec_Ingreso = fec_Ingreso;
        
        this.sig = null;
        this.ant = null;
    }

    @Override
    public String toString() {
        return "Nodo{" + "cedula=" + cedula + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", motivo_i=" + motivo_i + ", fec_Ingreso=" + fec_Ingreso + '}';
    }

  
   
   

   

    

    
    
    
    
}
