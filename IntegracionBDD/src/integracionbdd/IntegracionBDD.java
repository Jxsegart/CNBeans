/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integracionbdd;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author JxseGart
 */
public class IntegracionBDD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        try{
         Class.forName("oracle.jdbc.OracleDriver");
         String connectionUrl = "jdbc:oracle:thin:tarea1/oracle@localhost:1521:XE";
         Connection con = DriverManager.getConnection(connectionUrl);
         Statement s = con.createStatement();
         
         ResultSet rs = s.executeQuery("Select * from emple");
         while(rs.next()){
             System.out.println("Numero de departamento: "+rs.getInt(1)+ "Nombre Empelado: "+rs.getString("ename"));
         }
        }catch(ClassNotFoundException e){
            System.out.println("No se ha encontrado la Clase");
        }
        
    }
    
}
