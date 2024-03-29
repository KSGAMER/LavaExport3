/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.CargoController;
import Utilerias.CambiaPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyEvent;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RojeruSan
 */
public class Pn_Nomina_General extends javax.swing.JPanel {

    CargoController cc = new CargoController();
    String accion;
    int id;
    String descripcion;

    /**
     * Creates new form pnlHome
     */
    public Pn_Nomina_General() {
        initComponents();
        RowApariencia();
        RowHeaderApariencia();

        

    

   

 
    }

    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator6 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_cargos = new javax.swing.JTable();
        bt_generar = new Utilerias.RSButtonMetro();
        t_empleado = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();

        jSeparator6.setBackground(new java.awt.Color(128, 128, 131));

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(128, 128, 131));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconNomGen.png"))); // NOI18N
        jLabel8.setText("Reporte Nómina General");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 860, -1));

        jSeparator2.setBackground(new java.awt.Color(128, 128, 131));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 1040, 10));

        jt_cargos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jt_cargos);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 980, 250));

        bt_generar.setBackground(new java.awt.Color(97, 212, 195));
        bt_generar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_generar.setForeground(new java.awt.Color(255, 255, 255));
        bt_generar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/plus24x24.png"))); // NOI18N
        bt_generar.setText("Generar");
        bt_generar.setColorHover(new java.awt.Color(128, 128, 131));
        bt_generar.setColorNormal(new java.awt.Color(97, 212, 195));
        bt_generar.setColorTextHover(new java.awt.Color(102, 255, 255));
        bt_generar.setColorTextNormal(new java.awt.Color(255, 255, 255));
        bt_generar.setColorTextPressed(new java.awt.Color(255, 255, 255));
        bt_generar.setIconTextGap(10);
        bt_generar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_generarMouseClicked(evt);
            }
        });
        bt_generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_generarActionPerformed(evt);
            }
        });
        add(bt_generar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 480, 130, -1));

        t_empleado.setForeground(new java.awt.Color(153, 153, 153));
        t_empleado.setText("Ingrese Número de Empleado");
        t_empleado.setBorder(null);
        t_empleado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                t_empleadoFocusLost(evt);
            }
        });
        t_empleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_empleadoMouseClicked(evt);
            }
        });
        t_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_empleadoActionPerformed(evt);
            }
        });
        add(t_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 140, 150, -1));

        jSeparator5.setBackground(new java.awt.Color(128, 128, 131));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 160, 180, 10));

        jLabel23.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(128, 128, 131));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText("Buscar Empleado");
        add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 140, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void bt_generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_generarActionPerformed
        
    }//GEN-LAST:event_bt_generarActionPerformed

    private void bt_generarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_generarMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_bt_generarMouseClicked

    private void t_empleadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_empleadoFocusLost
        if (t_empleado.getText().trim().equals("")) {
            t_empleado.setText("Ingrese Número de Empleado");
            t_empleado.setForeground(new Color(153, 153, 153));

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_t_empleadoFocusLost

    private void t_empleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_empleadoMouseClicked
        // TODO add your handling code here:

        t_empleado.setText("");
    }//GEN-LAST:event_t_empleadoMouseClicked

    private void t_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_empleadoActionPerformed
        t_empleado.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_t_empleadoActionPerformed

    public void RowApariencia() {
        jt_cargos.setFocusable(false);
        //espacio entre comulnas
        jt_cargos.setIntercellSpacing(new Dimension(0, 1));
        //altura de columnas 
        jt_cargos.setRowHeight(25);
        //margen entre filas
        jt_cargos.setRowMargin(0);
//sin lineas verticles
        jt_cargos.setShowVerticalLines(false);
        jt_cargos.setSelectionBackground(new Color(97, 212, 195));
    }

    public void RowHeaderApariencia() {
        jt_cargos.getTableHeader().setFont(new Font("Century Gothic", Font.BOLD, 14));
        jt_cargos.getTableHeader().setOpaque(false);
        jt_cargos.getTableHeader().setBackground(new Color(97, 212, 195));
        jt_cargos.getTableHeader().setForeground(new Color(255, 255, 255));

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Utilerias.RSButtonMetro bt_generar;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTable jt_cargos;
    private javax.swing.JTextField t_empleado;
    // End of variables declaration//GEN-END:variables

}
