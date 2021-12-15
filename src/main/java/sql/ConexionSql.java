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

public class ConexionSql {
    Connection conn = null;
    Connection conn2 = null;
    //String url = "jdbc:postgresql://localhost/complejidad";   //Maricel
    //String url2 = "jdbc:postgresql://localhost/casodeuso";    //Maricel
    String url = "jdbc:postgresql://localhost:5432/complejidad";
    String url2 = "jdbc:postgresql://localhost:5432/casodeuso";
    String usuario = "root";//CRIS
    //String clave = "admin";   //Esta es la pass de Maricel
    String clave = "root";//CRIS
    
    String pswd ="root";//CRIS
  

    
public void conectar (){
    try{
        conn = DriverManager.getConnection(url,usuario,clave);
    } catch (HeadlessException | SQLException e){
        System.out.println(e);
    }
    
}

public void conectarCU (){
    try{
        conn2 = DriverManager.getConnection(url2,usuario,clave);
       } catch (HeadlessException | SQLException e){
        System.out.println(e);
    }
    
}

public String consultarComplejidad(String tipo, String campo) throws SQLException{
    String query = "SELECT " + campo + " FROM complejidad where tipo = '" + tipo + "'";
    String complejidad = "";
    try(Statement stmt = conn.createStatement()){
        ResultSet rs = stmt.executeQuery(query);

        while ( rs.next() ) {
           complejidad = rs.getString(campo);
        }
    } catch (HeadlessException | SQLException e){
        System.out.println(e);
    } 
    return complejidad;
}

public String consultarInfluencia(String descripcion) throws SQLException{
    String query = "SELECT valor FROM influencia where descripcion = '" + descripcion + "'";
    String influencia = "";
    try(Statement stmt = conn.createStatement()){
       ResultSet rs = stmt.executeQuery(query);
        
       while ( rs.next() ) {
        influencia = rs.getString("valor");
       }
    } catch (HeadlessException | SQLException e){
        System.out.println(e);
    }
    return influencia;
}

public String consultarActor(String tipo) throws SQLException{
       String query = "SELECT factor FROM actores where tipo = '" + tipo + "'";
       String actor = "";
       try(Statement stmt = conn2.createStatement();){
        ResultSet rs = stmt.executeQuery(query);

       while ( rs.next() ) {
           actor = rs.getString("factor");
       }
    } catch (HeadlessException | SQLException e){
        System.out.println(e);
    }
    return actor;
}

public String consultarTransacciones(String tipo) throws SQLException{
    String query = "SELECT factor FROM transacciones where tipo = '" + tipo + "'";
    String transaccion = "";
    try(Statement stmt = conn2.createStatement();){
       ResultSet rs = stmt.executeQuery(query);
        
       while ( rs.next() ) {
           transaccion = rs.getString("factor");
       }
    } catch (HeadlessException | SQLException e){
        System.out.println(e);
    }
    return transaccion;
}

public String consultarClases(String tipo) throws SQLException{
    String query = "SELECT factor FROM clases where tipo = '" + tipo + "'";
    String clas = "";
    try(Statement stmt = conn2.createStatement();){
       ResultSet rs = stmt.executeQuery(query);
       
       while ( rs.next() ) {
           clas = rs.getString("factor");
       }
    } catch (HeadlessException | SQLException e){
        System.out.println(e);
    }
    return clas;
}

public String consultarComplejidadTecnica(String tipo) throws SQLException{
    String peso = "";
    try{
       peso = this.obtenerPesoPorTipoDeComplejidad("tecnica", tipo);
    } catch (HeadlessException | SQLException e){
        System.out.println(e);
    }
    return peso;
}

public String consultarRelevancia(String tipo) throws SQLException{
    String query = "SELECT valor FROM relevancia where tipo = '" + tipo + "'";
    String relevancia = "";
    try(Statement stmt = conn2.createStatement();){
       ResultSet rs = stmt.executeQuery(query);
       
       while ( rs.next() ) {
           relevancia = rs.getString("valor");
       }
    } catch (HeadlessException | SQLException e){
        System.out.println(e);
    }
    return relevancia;
}

public String consultarAporte(Integer valor) throws SQLException{
    String query = "SELECT tipo FROM relevancia where tipo = '" + valor + "'";
    String aporte = "";
    try(Statement stmt = conn2.createStatement();){
       ResultSet rs = stmt.executeQuery(query);
       
       while ( rs.next() ) {
           aporte = rs.getString("aporte");
       }
    } catch (HeadlessException | SQLException e){
        System.out.println(e);
    }
    return aporte;
}

public String consultarComplejidadAmbiental(String tipo) throws SQLException{
    String peso = "";
    try{
       peso = this.obtenerPesoPorTipoDeComplejidad("ambiental", tipo);
    } catch (HeadlessException | SQLException e){
        System.out.println(e);
    }
    return peso;
}

    public String obtenerPesoPorTipoDeComplejidad(String nombreBd, String tipo) throws SQLException{
    String query = "SELECT peso FROM " + nombreBd + " where tipo = '" + tipo + "'";
    String peso = "";
    try(Statement stmt = conn2.createStatement();){
       ResultSet rs = stmt.executeQuery(query);
       
        while ( rs.next() ) {
            peso = rs.getString("peso");
        }
    } catch (HeadlessException | SQLException e){
        System.out.println(e);
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
