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

/**
 *
 * @author axeli
 */
public class EmpleadoModel extends database {

    Connection conn;

    protected ResultSet consultarEmpleado() {
        ResultSet rs = Read("select * from empleado");
        return rs;
    }
    
     protected ResultSet consultarEmpleadoPorId(int id_empleado) {
        ResultSet rs = Read("select * from empleado where id_empleado = "+id_empleado);
        return rs;
    }
     
     protected ResultSet consultarMaxEmpleado() {
        ResultSet rs = Read("select max(id_empleado) from empleado");
        return rs;
    }

    protected void insertarEmpleado(int id_empleado, int id_horario, int id_cargo, String nombre, String a_paterno, String a_materno, String curp,
             int id_departamento, String direccion, double salario, int sexo, int estatus, int num_seg_social, String rfc, double gratificacion) {
        PreparedStatement ps = null;
        conn = GetConnection();
        try {
            ps = conn.prepareStatement("insert into empleado(id_empleado,id_horario,id_cargo,nombre,apellido_paterno,apellido_materno,"
                    + "curp,id_departamento,direccion,salario,sexo,estatus,num_seg_social,rfc,gratificacion) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setInt(1, id_empleado);
            ps.setInt(2, id_horario);
            ps.setInt(3, id_cargo);
            ps.setString(4, nombre);
            ps.setString(5, a_paterno);
            ps.setString(6, a_materno);
            ps.setString(7, curp);
            ps.setInt(8, id_departamento);
            ps.setString(9, direccion);
            ps.setDouble(10, salario);
            ps.setInt(11, sexo);
            ps.setInt(12, estatus);
            ps.setInt(13, num_seg_social);
            ps.setString(14, rfc);
            ps.setDouble(15, gratificacion);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Registro Insertado");
    }

    protected void modificarEmpleado(int id_empleado, int id_horario, int id_cargo, String nombre, String a_paterno, String a_materno, String curp,
             int id_departamento, String direccion, double salario, int sexo, int estatus, int num_seg_social, String rfc, double gratificacion) {
        PreparedStatement ps = null;
        conn = GetConnection();
        try {
            ps = conn.prepareStatement("update empleado set id_horario=? ,id_cargo=?, nombre=?, apellido_paterno=?, apellido_materno=?,"
                    + "curp=?, id_departamento=?, direccion=?, salario=?, sexo=?, estatus=?, num_seg_social=?, rfc=? ,gratificacion=? where id_empleado=?");
            ps.setInt(1, id_empleado);
            ps.setInt(2, id_horario);
            ps.setInt(3, id_cargo);
            ps.setString(4, nombre);
            ps.setString(5, a_paterno);
            ps.setString(6, a_materno);
            ps.setString(7, curp);
            ps.setInt(8, id_departamento);
            ps.setString(9, direccion);
            ps.setDouble(10, salario);
            ps.setInt(11, sexo);
            ps.setInt(12, estatus);
            ps.setInt(13, num_seg_social);
            ps.setString(14, rfc);
            ps.setDouble(15, gratificacion);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Registro Actualizado");
    }
    
    protected void eliminarEmpleado(int id_empleado){
       PreparedStatement ps = null;
       conn = GetConnection();
        try {
            ps = conn.prepareStatement("delete from empleado where id_empleado=?");
            
            ps.setInt(1, id_empleado);
            ps.executeUpdate();
        } catch (SQLException ex) {
            
            Logger.getLogger(EmpleadoModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Registro Eliminado");
   }

}
