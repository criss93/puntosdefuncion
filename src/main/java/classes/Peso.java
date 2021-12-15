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
public class Peso {
    String tipo;
    float valor;

 
    public Peso (String tipo, float valor){
       this.tipo = tipo;
       this.valor = valor;
 
 
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public float getValor() {
        return valor;
    }
    
    
    
}
