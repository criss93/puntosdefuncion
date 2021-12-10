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
    float peso;

 
    public Peso (String tipo, float peso){
       this.tipo = tipo;
       this.peso = peso;
 
 
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public float getPeso() {
        return peso;
    }
    
    
    
}
