/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DB.database;
import static DB.database.GetConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PagoModel extends database {

    Connection conn;

    protected ResultSet consultarPago() {
        ResultSet rs = Read("select * from pago");
        return rs;
    }

    protected void insertarPago(int numero_cuenta, int numero_tarjeta, String descripcion_pago) {
        PreparedStatement ps = null;
        conn = GetConnection();
        try {
            ps = conn.prepareStatement("insert into pago(numero_cuenta,numero_tarjeta,descripcion_pago) values(?,?,?)");
            ps.setInt(1, numero_cuenta);
            ps.setInt(2, numero_tarjeta);
            ps.setString(3, descripcion_pago);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PagoModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Registro Insertado");
    }
     protected void modificarPago(int id, int numero_cuenta, int numero_tarjeta, String descripcion_pago){
       PreparedStatement ps = null;
       conn = GetConnection();
        try {
            ps = conn.prepareStatement("update pago set numero_cuenta=?,numero_tarjeta=?,descripcion_pago=? where id_tipo_pago=?");
            ps.setInt(1, numero_cuenta);
            ps.setInt(2, numero_tarjeta);
            ps.setString(3, descripcion_pago);
            ps.setInt(4, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            
            Logger.getLogger(PagoModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Registro Actualizado");
}
     protected void eliminarPago(int id) {
        PreparedStatement ps = null;
        conn = GetConnection();
        try {
            ps = conn.prepareStatement("delete from pago where id_tipo_pago=?");

            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {

            Logger.getLogger(PagoModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Registro Eliminado");
    }
}

