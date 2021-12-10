/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql;

/**
 *
 * @author Mari
 */

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class conexionsql {
    Connection conn = null;
    Connection conn2 = null;
    //String url = "jdbc:postgresql://localhost/complejidad";   //Maricel
    //String url2 = "jdbc:postgresql://localhost/casodeuso";    //Maricel
    String url = "jdbc:postgresql://localhost:5432/complejidad";
    String url2 = "jdbc:postgresql://localhost:5432/casodeuso";
    String usuario = "root";
    //String clave = "admin";   //Esta es la pass de Maricel
    String clave = "root";
    
        String password ="root";
  

    
public void conectar (){
    try{
        Class.forName("org.postgresql.Driver");
        conn = DriverManager.getConnection(url,usuario,clave);
       // JOptionPane.showMessageDialog(null,"conexion exitosa","conexion",JOptionPane.INFORMATION_MESSAGE);
    } catch (HeadlessException | ClassNotFoundException | SQLException e){
       // JOptionPane.showMessageDialog(null,"conexion fallida"+ e,"conexion",JOptionPane.ERROR_MESSAGE);
    }
    
    }

public void conectarCU (){
    try{
        Class.forName("org.postgresql.Driver");
        conn2 = DriverManager.getConnection(url2,usuario,clave);
       // JOptionPane.showMessageDialog(null,"conexion exitosa","conexion",JOptionPane.INFORMATION_MESSAGE);
       } catch (HeadlessException | ClassNotFoundException | SQLException e){
       // JOptionPane.showMessageDialog(null,"conexion fallida"+ e,"conexion",JOptionPane.ERROR_MESSAGE);
    }
    
}

public String consultarComplejidad(String tipo, String campo) throws SQLException{
       String SQL = "SELECT " + campo + " FROM complejidad where tipo = '" + tipo + "'";
       Statement stmt = conn.createStatement();
       ResultSet rs = stmt.executeQuery(SQL);
       
       String complejidad = "";
       while ( rs.next() ) {
           complejidad = rs.getString(campo);
       }
       return complejidad;
}

public String consultarInfluencia(String descripcion) throws SQLException{
       String SQL = "SELECT valor FROM influencia where descripcion = '" + descripcion + "'";
       Statement stmt = conn.createStatement();
       ResultSet rs = stmt.executeQuery(SQL);
       
       String influencia = "";
       while ( rs.next() ) {
           influencia = rs.getString("valor");
       }
       return influencia;
}

public String consultarActor(String tipo) throws SQLException{
       String SQL = "SELECT factor FROM actores where tipo = '" + tipo + "'";
       Statement stmt = conn2.createStatement();
       ResultSet rs = stmt.executeQuery(SQL);
       
       String actor = "";
       while ( rs.next() ) {
           actor = rs.getString("factor");
       }
       return actor;
}

public String consultarTransacciones(String tipo) throws SQLException{
       String SQL = "SELECT factor FROM transacciones where tipo = '" + tipo + "'";
       Statement stmt = conn2.createStatement();
       ResultSet rs = stmt.executeQuery(SQL);
       
       String transaccion = "";
       while ( rs.next() ) {
           transaccion = rs.getString("factor");
       }
       return transaccion;
}

public String consultarClases(String tipo) throws SQLException{
       String SQL = "SELECT factor FROM clases where tipo = '" + tipo + "'";
       Statement stmt = conn2.createStatement();
       ResultSet rs = stmt.executeQuery(SQL);
       
       String clas = "";
       while ( rs.next() ) {
           clas = rs.getString("factor");
       }
       return clas;
}

public String consultarComplejidadTecnica(String tipo) throws SQLException{
       String SQL = "SELECT peso FROM tecnica where tipo = '" + tipo + "'";
       Statement stmt = conn2.createStatement();
       ResultSet rs = stmt.executeQuery(SQL);
       
       String peso = "";
       while ( rs.next() ) {
           peso = rs.getString("peso");
       }
       return peso;
}

public String consultarRelevancia(String tipo) throws SQLException{
       String SQL = "SELECT valor FROM relevancia where tipo = '" + tipo + "'";
       Statement stmt = conn2.createStatement();
       ResultSet rs = stmt.executeQuery(SQL);
       
       String relevancia = "";
       while ( rs.next() ) {
           relevancia = rs.getString("valor");
       }
       return relevancia;
}

public String consultarAporte(Integer valor) throws SQLException{
       String SQL = "SELECT tipo FROM relevancia where tipo = '" + valor + "'";
       Statement stmt = conn2.createStatement();
       ResultSet rs = stmt.executeQuery(SQL);
       
       String aporte = "";
       while ( rs.next() ) {
           aporte = rs.getString("aporte");
       }
       return aporte;
}

public void cerrar (){
    try{
        conn.close();
        JOptionPane.showMessageDialog(null,"desconexion exitosa","desconexion",JOptionPane.INFORMATION_MESSAGE);
    } catch (HeadlessException | SQLException e){
        JOptionPane.showMessageDialog(null,"desconexion fallida"+ e,"desconexion",JOptionPane.ERROR_MESSAGE);
      }
    } 
}
