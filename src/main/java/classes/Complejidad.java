/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Mari
 */
public class Complejidad {
    
    String tipo;
    int complejidadSeleccionada;
    int valor;
    
     public Complejidad(String tipo, int complejidad, int valor){
       this.tipo = tipo;
       this.complejidadSeleccionada = complejidad;
       this.valor = valor;
       
    }
    public String getTipo() {
        return tipo;
    }
    
    public int getComplejidadSeleccionada() {
        return complejidadSeleccionada;
    }

    public int getValor() {
        return valor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setComplejidadSeleccionada(int complejidad) {
        this.complejidadSeleccionada = complejidad;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
}
