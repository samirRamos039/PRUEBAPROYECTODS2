/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;



import modelo.Cliente;
import modelo.ClienteDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import vista.panelCliente;
/**
 *
 * @author Steven
 */
public class ControladorClientes implements ActionListener{
    
    private final ClienteDAO cd;
    private final panelCliente pc;
    
    public ControladorClientes (ClienteDAO CD, panelCliente PC){
    
        this.cd = CD;
        this.pc = PC;
        this.pc.Bcreate.addActionListener(this);
        this.pc.Bdelete.addActionListener(this);
        this.pc.Bread.addActionListener(this);
        this.pc.Bupdate.addActionListener(this);
    
    }
     
    public void llenarTabla(JTable tabla){
         DefaultTableModel modelo = new DefaultTableModel();
         tabla.setModel(modelo);
         
         modelo.addColumn("ID");
         modelo.addColumn("APELLIDO");
         modelo.addColumn("APELLIDO");
         modelo.addColumn("DIRECCION");
         modelo.addColumn("TELEFONO");
         modelo.addColumn("CORREO");
         modelo.addColumn("RAZON SOCIAL");
    
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }
    
   
}


