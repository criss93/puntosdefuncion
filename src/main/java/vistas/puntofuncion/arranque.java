/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.puntofuncion;

import javax.swing.JFrame;
import vistas.puntofuncion.conectar;

/**
 *
 * @author Mari
 */
public class arranque {

    public static void main(String[] args) {
        String title = "Bienvenidos";
        conectar abrir = new conectar ();
        abrir.setLocationRelativeTo(null);
        abrir.setDefaultCloseOperation(JFrame.ICONIFIED);
        abrir.setResizable(false);
        abrir.setTitle(title);
        abrir.setLocationRelativeTo(null);
        abrir.setVisible(true);
                
    }
    
}
