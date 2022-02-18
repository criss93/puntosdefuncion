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

public class Factor {
    
    String tipo;
    int valor;
    int factorSeleccionado;
    

    public Factor (String tipo,int valor,int factor){
       this.tipo = tipo;
       this.valor = valor;
       this.factorSeleccionado = factor;
 
    }

    public String getTipo() {
        return tipo;
    }

    public int getValor() {
        return valor;
    }

    public int getFactorSeleccionado() {
        return factorSeleccionado;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setFactorSeleccionado(int factor) {
        this.factorSeleccionado = factor;
    }

    
}

