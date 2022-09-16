/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.TransaccionController;
import dto.dtoTransaccion;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class frmReportes extends javax.swing.JFrame {

    private TransaccionController controller;
    
    public frmReportes(TransaccionController controller) {
        initComponents();
        setLocationRelativeTo(null);
        this.controller = controller;
        cargarPromedio();
    }
    
    private void cargarPromedio(){
        String total = String.valueOf(controller.porcentajeTransaccion()*100);
        txtPorcentaje.setText(total+"%");
    }
    
    private void transaccionesRegistradas() {
        DefaultTableModel model = new DefaultTableModel();
        ArrayList<dtoTransaccion> todos = controller.obtenerTransacciones();
        model.setColumnIdentifiers(new String[]{"Fecha", "id Vendedor", "Tipo Operacion", "Tipo Inmueble", "Monto"});
        for (dtoTransaccion s : todos) {
            model.addRow(s.toArray());
        }

        tableTransacciones.setModel(model);

    }
    
     private void tipoOficina() {
        DefaultTableModel model = new DefaultTableModel();
        ArrayList<dtoTransaccion> todos = controller.tipoOfina();
        model.setColumnIdentifiers(new String[]{"Fecha", "id Vendedor", "Tipo Operacion", "Tipo Inmueble", "Monto"});
        for (dtoTransaccion s : todos) {
            model.addRow(s.toArray());
        }

        tableTransacciones.setModel(model);

    }

    private void ventaMator() {
        DefaultTableModel model = new DefaultTableModel();
        dtoTransaccion t = controller.mayorTransaccion();
        model.setColumnIdentifiers(new String[]{"Fecha","id Vendedor","Tipo Operacion","Tipo Inmueble","Monto"});

        model.addRow(t.toArray());

        tableTransacciones.setModel(model);

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableTransacciones = new javax.swing.JTable();
        btnTransacciones = new javax.swing.JButton();
        btnMayor = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtPorcentaje = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableTransacciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableTransacciones);

        btnTransacciones.setText("Transacciones Registradas");
        btnTransacciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransaccionesActionPerformed(evt);
            }
        });

        btnMayor.setText("Transaccion Mayor Monto");
        btnMayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMayorActionPerformed(evt);
            }
        });

        jButton4.setText("Transacciones Oficina");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setText("Porcentaje de transacciones tipo Alquiler:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnMayor, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                        .addComponent(btnTransacciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(btnTransacciones)
                        .addGap(49, 49, 49)
                        .addComponent(btnMayor)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(jButton4)))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTransaccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransaccionesActionPerformed
        transaccionesRegistradas();
    }//GEN-LAST:event_btnTransaccionesActionPerformed

    private void btnMayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMayorActionPerformed
        ventaMator();
    }//GEN-LAST:event_btnMayorActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        tipoOficina();
    }//GEN-LAST:event_jButton4ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMayor;
    private javax.swing.JButton btnTransacciones;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableTransacciones;
    private javax.swing.JTextField txtPorcentaje;
    // End of variables declaration//GEN-END:variables
}