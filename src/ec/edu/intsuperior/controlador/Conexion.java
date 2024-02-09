/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Conexion {
    Connection con;
    String sms;

    public Conexion() {
        String url="jdbc:mysql://localhost:3307/registro";
        String user="root";
        String passwd="123456789";
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,passwd);
            sms="Si se conecto a la BDD";
            System.out.println(sms);
        } catch (Exception e) {
            sms="no hubo conexion";
            System.out.println(sms);
        }
    }
    
    public Connection getConnection(){
        return con;
    }
    
    public String mensaje(){
        return sms;
    }
    
    public void cerrarConexion(){
        try {
            con.close();
            System.out.println("Se cerro la conexion");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
}
