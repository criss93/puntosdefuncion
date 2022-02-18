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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConexionSql {
    Connection conn = null;
    Connection conn2 = null;
    //String url = "jdbc:postgresql://localhost/complejidad";   //Maricel
    //String url2 = "jdbc:postgresql://localhost/casodeuso";    //Maricel
    String url = "jdbc:postgresql://localhost:5432/complejidad";
    String url2 = "jdbc:postgresql://localhost:5432/casodeuso";
    String usuario = "root";//CRIS
    //String clave = "admin";   //Esta es la pass de Maricel
    
    String pswd ="root";//CRIS
  

    
public void conectar (){
    try{
        conn = DriverManager.getConnection(url,usuario,pswd);
    } catch (HeadlessException | SQLException e){
        Logger.getLogger(ConexionSql.class.getName()).log(Level.SEVERE, null, e);
    }
    
}

public void conectarCU (){
    try{
        conn2 = DriverManager.getConnection(url2,usuario,pswd);
       } catch (HeadlessException | SQLException e){
        Logger.getLogger(ConexionSql.class.getName()).log(Level.SEVERE, null, e);
    }
    
}

public String consultarComplejidad(String tipo, String campo) throws SQLException{
    String complejidad = ""; 
    Statement stmt1 = null;
    PreparedStatement pstmt = null;
    String query = "SELECT " + campo.toLowerCase() +" FROM complejidad where tipo = ? ";
    try(Statement stmt = conn.createStatement()){
        pstmt = conn.prepareStatement(query);
        pstmt.setString(1, tipo);
        ResultSet rs = pstmt.executeQuery();

        while ( rs.next() ) {
            complejidad = rs.getString(campo.toLowerCase());
        }
    } catch (HeadlessException | SQLException e){
        Logger.getLogger(ConexionSql.class.getName()).log(Level.SEVERE, null, e);
    } 
    return complejidad;
}

public String consultarInfluencia(String descripcion) throws SQLException{
    String influencia = "";
    PreparedStatement pstmt = null;
    String query = "SELECT valor FROM influencia where descripcion = ?";
    try(Statement stmt = conn.createStatement()){
       pstmt = conn.prepareStatement(query);
       pstmt.setString(1, descripcion);
       ResultSet rs2 = pstmt.executeQuery();
       while ( rs2.next() ) {
           influencia = rs2.getString("valor");
       }
    } catch (HeadlessException | SQLException e){
        Logger.getLogger(ConexionSql.class.getName()).log(Level.SEVERE, null, e);
    }
    return influencia;
}

public String consultarActor(String tipo) throws SQLException{
    String actor = "";
    PreparedStatement pstmt = null;
    String query = "SELECT factor FROM actores where tipo = ?";
    try(Statement stmt = conn2.createStatement();){
        pstmt = conn2.prepareStatement(query);
        pstmt.setString(1, tipo);
        ResultSet rs2 = pstmt.executeQuery();
        while ( rs2.next() ) {
            actor = rs2.getString("factor");
        }
    } catch (HeadlessException | SQLException e){
        Logger.getLogger(ConexionSql.class.getName()).log(Level.SEVERE, null, e);
    }
    return actor;
}

public String consultarTransacciones(String tipo) throws SQLException{
    String transaccion = "";
    PreparedStatement pstmt = null;
    String query = "SELECT factor FROM transacciones where tipo = ?";
    try(Statement stmt = conn2.createStatement();){
      pstmt = conn2.prepareStatement(query);
      pstmt.setString(1, tipo);
      ResultSet rs2 = pstmt.executeQuery();
      while ( rs2.next() ) {
        transaccion = rs2.getString("factor");
      }
    } catch (HeadlessException | SQLException e){
        Logger.getLogger(ConexionSql.class.getName()).log(Level.SEVERE, null, e);
    }
    return transaccion;
}

public String consultarClases(String tipo) throws SQLException{
    String clas = "";
    PreparedStatement pstmt = null;
    String query = "SELECT factor FROM clases where tipo = ?";
    try(Statement stmt = conn2.createStatement();){
       pstmt = conn2.prepareStatement(query);
       pstmt.setString(1, tipo);
       ResultSet rs2 = pstmt.executeQuery();
       while ( rs2.next() ) {
           clas = rs2.getString("factor");
       }
    } catch (HeadlessException | SQLException e){
        Logger.getLogger(ConexionSql.class.getName()).log(Level.SEVERE, null, e);
    }
    return clas;
}

public String consultarComplejidadTecnica(String tipo) throws SQLException{
    String peso = "";
    try(Statement stmt = conn2.createStatement();){
        peso = this.consultarComplejidadPorTipo("tecnica", tipo);
    } catch (HeadlessException | SQLException e){
        Logger.getLogger(ConexionSql.class.getName()).log(Level.SEVERE, null, e);
    }
    return peso;
}

public String consultarRelevancia(String tipo) throws SQLException{
    String relevancia = "";
    PreparedStatement pstmt = null;
    String query = "SELECT valor FROM relevancia where tipo = ?";
    try(Statement stmt = conn2.createStatement();){
        pstmt = conn2.prepareStatement(query);
        pstmt.setString(1, tipo);
        ResultSet rs2 = pstmt.executeQuery();
        while ( rs2.next() ) {
            relevancia = rs2.getString("valor");
       }
    } catch (HeadlessException | SQLException e){
        Logger.getLogger(ConexionSql.class.getName()).log(Level.SEVERE, null, e);
    }
    return relevancia;
}

public String consultarAporte(Integer valor) throws SQLException{
    String aporte = "";
    PreparedStatement pstmt = null;
    String query = "SELECT tipo FROM relevancia where tipo = ?";
    try(Statement stmt = conn2.createStatement();){
        pstmt = conn2.prepareStatement(query);
        pstmt.setString(1, Integer.toString(valor));
        ResultSet rs2 = pstmt.executeQuery();
        while ( rs2.next() ) {
            aporte = rs2.getString("valor");
        }
    } catch (HeadlessException | SQLException e){
        Logger.getLogger(ConexionSql.class.getName()).log(Level.SEVERE, null, e);
    }
    return aporte;
}

public String consultarComplejidadAmbiental(String tipo) throws SQLException{
    String peso = "";
    try(Statement stmt = conn2.createStatement();){
        peso = this.consultarComplejidadPorTipo("ambiental", tipo);
    } catch (HeadlessException | SQLException e){
        Logger.getLogger(ConexionSql.class.getName()).log(Level.SEVERE, null, e);
    }
    return peso;
}

public String consultarComplejidadPorTipo(String tipoDeComplejidad, String tipo) throws SQLException{
    String peso = "";
    PreparedStatement pstmt = null;
    String query = ""; 
    if (tipoDeComplejidad.equals("ambiental")) {
        query = "SELECT peso FROM ambiental where tipo = ?";
    } else {
        query = "SELECT peso FROM tecnica where tipo = ?";
    }
    
    try(Statement stmt = conn2.createStatement();){
       pstmt = conn2.prepareStatement(query);
        pstmt.setString(1, tipo);
        ResultSet rs2 = pstmt.executeQuery();
        while ( rs2.next() ) {
            peso = rs2.getString("peso");
        }
    } catch (HeadlessException | SQLException e){
        Logger.getLogger(ConexionSql.class.getName()).log(Level.SEVERE, null, e);
    }
    return peso;
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
