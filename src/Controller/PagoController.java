/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.PagoModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Victor
 */
public class PagoController extends PagoModel{
    
    public DefaultTableModel tablaPago(){
        String [] titulo = {"Id","cuenta","tarjeta","pago"};
        DefaultTableModel tb = new DefaultTableModel(null, titulo);
        
        Object[] fila = new Object[4];
        
        ResultSet rs = consultarPago();
         try {
            while (rs.next()) {
                fila[0] = rs.getInt("id_tipo_pago");
                fila[1] = rs.getInt("numero_cuenta");
                fila[2] = rs.getInt("numero_tarjeta");
                fila[3] = rs.getString("descripcion_pago");
                tb.addRow(fila);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PagoController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return tb;
        
    }
    public void guardar(String accion, int id, int numero_cuenta, int numero_tarjeta, String descripcion_pago){
        if (accion == "I"){
            insertarPago(numero_cuenta, numero_tarjeta, descripcion_pago);
        } else{
            modificarPago(id, numero_cuenta, numero_tarjeta, descripcion_pago);
        }
    }
    public void eliminar(int id){
        eliminarPago(id);
    }
}
