/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;



import servicios.Conexion;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Universidad
 */
public class ClienteDAO {
        
        Conexion cc = new Conexion(); 
        
        public int insertar(Cliente cliente){
        Cliente cl = new Cliente();
        int resultado = 0;    
        //Conexion cc = new Conexion();  
        Connection con;
        PreparedStatement ps;
        String sql = "insert into cliente (id, nombre, alpellidoo, direccion, correo, razonSocial)values (?,?,?,?,?,?,?)";
        
            try {
                con = cc.getConnection();
                ps = con.prepareStatement(sql);
                
                ps.setInt(1, cl.getId());
                ps.setString(2, cl.getNombre());
                ps.setString(3, cl.getApellido());
                ps.setString(4, cl.getDireccion());
                ps.setString(5, cl.getTelefono());
                ps.setString(6, cl.getCorreo());
                ps.setString(7, cl.getRazonSocial());
                
            } catch (Exception e) {
            }
            return resultado;
        }
        
        public ArrayList<Cliente>lista(){
         ArrayList <Cliente> lista = new ArrayList();   
        
         String sql = "select * from cliente";   
            try {
                Connection con;
                PreparedStatement ps;
                ResultSet rs;
                con = cc.getConnection();
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                
                while(rs.next()){
                  Cliente cliente = new Cliente();
                  cliente.setId(rs.getInt("id"));
                  cliente.setNombre(rs.getString("nombre"));
                  cliente.setApellido(rs.getString("apellido"));
                  cliente.setDireccion(rs.getString("direccion"));
                  cliente.setTelefono(rs.getString("telefono"));
                  cliente.setCorreo(rs.getString("correo"));
                  cliente.setRazonSocial(rs.getString("razonSocial"));
                   lista.add(cliente);
                
                }
            } catch (Exception e) {
            }
         
         return lista;
        }
}

