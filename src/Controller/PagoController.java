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
    
<<<<<<< HEAD
    public DefaultTableModel tablaPago(){
        String [] titulo = {"Id","cuenta","tarjeta","pago"};
=======
    public DefaultTableModel tablapago(){
        String [] titulo = {"Codigo","Nombre","Departamento","Numero de cuenta","Descripción"};
>>>>>>> 833296939785e2691f761c8658b89473e047ab53
        DefaultTableModel tb = new DefaultTableModel(null, titulo);
        
        Object[] fila = new Object[5];
        
        ResultSet rs = consultarPago();
         try {
            while (rs.next()) {
<<<<<<< HEAD
                fila[0] = rs.getInt("id_tipo_pago");
                fila[1] = rs.getInt("numero_cuenta");
                fila[2] = rs.getInt("numero_tarjeta");
                fila[3] = rs.getString("descripcion_pago");
=======
                fila[0] = rs.getInt("id_empleado");
                fila[1] = rs.getString("nombre")+" "+rs.getString("apellido_paterno")+" "+rs.getString("apellido_materno");
                fila[2] = rs.getString("numero_cuenta");
                fila[3] = rs.getString("numero_tarjeta");
                fila[4] = rs.getString("descripcion_pago");
                
               
               
>>>>>>> 833296939785e2691f761c8658b89473e047ab53
                tb.addRow(fila);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PagoController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return tb;
        
    }
    
    public ResultSet consultar_user_pago(String id_empleado){
        ResultSet rs=consultarPagoporempleado(id_empleado);
        return rs;
        
    }
    
    public void guardar(String id_empleado,String  accion, String numero_cuenta, String numero_tarjeta, String descripcion_pago){
        if (accion == "I"){
            insertarPago(id_empleado,numero_cuenta, numero_tarjeta, descripcion_pago);
        } else{
            modificarPago(id_empleado,numero_cuenta, numero_tarjeta, descripcion_pago);
        }
    }
    public void eliminar(String id){
        eliminarPago(id);
    }
}
