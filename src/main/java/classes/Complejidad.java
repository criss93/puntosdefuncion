/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;

/**
 *
 * @author Mari
 */
public class Complejidad {
    
    String tipo;
    int complejidad;
    int valor;
    
     public Complejidad(String tipo, int complejidad, int valor){
       this.tipo = tipo;
       this.complejidad = complejidad;
       this.valor = valor;
       
    }
    public String getTipo() {
        return tipo;
    }
    
    public int getComplejidad() {
        return complejidad;
    }

    public int getValor() {
        return valor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setComplejidad(int complejidad) {
        this.complejidad = complejidad;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
}
