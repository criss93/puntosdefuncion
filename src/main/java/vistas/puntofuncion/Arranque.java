/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.puntofuncion;

/**
 *
 * @author Mari
 */
public class Arranque {

    public static void main(String[] args) {
        String title = "Bienvenidos";
        Conectar abrir = new Conectar();
        abrir.setLocationRelativeTo(null);
        abrir.setDefaultCloseOperation(java.awt.Frame.ICONIFIED);
        abrir.setResizable(false);
        abrir.setTitle(title);
        abrir.setLocationRelativeTo(null);
        abrir.setVisible(true);
                
    }
    
}
