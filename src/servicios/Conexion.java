/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.sql.*;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author Universidad
 */


public class Conexion {
    Connection con;
    String bd = "almacen";
    
   /* private String url = "jdvc.mysql://localhost:3306/"+ bd +"?usedUnicode=true&use"
            +"JDBCCompilantTimezoneShift=true&useLegaciDateTimeCode=false&"
            +"serverTimezone=UTC";*/
    private String url = "jdbc:postgresql://localhost:5432/almacen";
    String user = "postgres";
    public Conexion(){
       
       try{
           Class.forName("org.postgresql.Driver");
           con = DriverManager.getConnection(url,user,"");
       }
       catch(ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(null,"Error : " + 
                    ex.getMessage());
        }
   }
   public Connection getConnection(){
       
      return con;
   }
   
}
