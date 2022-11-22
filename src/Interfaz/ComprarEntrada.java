/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaz;

import java.sql.*;
/**
 *
 * @author Cris Hernandez
 */
public class ComprarEntrada extends javax.swing.JPanel {
    
    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    /**
     * Creates new form ComprarEntrada
     */
    public ComprarEntrada() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelCedula = new javax.swing.JLabel();
        txtCedulaCompraEntrada = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        btnComprarEntrada = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtEmailCompraEntrada = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTelefonoCompraEntrada = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNombreCompraEntrada = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(930, 540));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Comprar Entrada General");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(jLabel1)
                .addContainerGap(250, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, -1));

        labelCedula.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        labelCedula.setText("Cédula");
        add(labelCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        txtCedulaCompraEntrada.setBorder(null);
        txtCedulaCompraEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaCompraEntradaActionPerformed(evt);
            }
        });
        add(txtCedulaCompraEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 250, -1));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 250, 20));

        btnComprarEntrada.setBackground(new java.awt.Color(0, 102, 102));
        btnComprarEntrada.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnComprarEntrada.setForeground(new java.awt.Color(255, 255, 255));
        btnComprarEntrada.setText("Comprar Entrada");
        btnComprarEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarEntradaActionPerformed(evt);
            }
        });
        add(btnComprarEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 188, 72));

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel9.setText("Email");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        txtEmailCompraEntrada.setBorder(null);
        txtEmailCompraEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailCompraEntradaActionPerformed(evt);
            }
        });
        add(txtEmailCompraEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 250, -1));

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel10.setText("Telefono");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, -1, -1));

        txtTelefonoCompraEntrada.setBorder(null);
        txtTelefonoCompraEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoCompraEntradaActionPerformed(evt);
            }
        });
        add(txtTelefonoCompraEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 250, -1));

        jLabel11.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel11.setText("Nombre Completo");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, -1, -1));

        txtNombreCompraEntrada.setBorder(null);
        txtNombreCompraEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreCompraEntradaActionPerformed(evt);
            }
        });
        add(txtNombreCompraEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 250, -1));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 250, 20));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 250, 20));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 250, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 200, 110));
    }// </editor-fold>//GEN-END:initComponents

    private void txtCedulaCompraEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaCompraEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaCompraEntradaActionPerformed

    private void btnComprarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarEntradaActionPerformed
        try{
            con = DbConnection.ConnectionDB();
            String sql = "INSERT INTO entradas (cedula, email, telefono, nombre) VALUES (?,?,?,?);";
            pst = con.prepareStatement(sql);
            pst.setString(1, txtCedulaCompraEntrada.getText());
            pst.setString(2, txtEmailCompraEntrada.getText());
            pst.setString(3, txtTelefonoCompraEntrada.getText());
            pst.setString(4, txtNombreCompraEntrada.getText());
            pst.execute();
            con.close();
        }catch(Exception e){
            System.out.println("Baneo fallido "+e);
        }

    }//GEN-LAST:event_btnComprarEntradaActionPerformed

    private void txtEmailCompraEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailCompraEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailCompraEntradaActionPerformed

    private void txtTelefonoCompraEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoCompraEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoCompraEntradaActionPerformed

    private void txtNombreCompraEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreCompraEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreCompraEntradaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprarEntrada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel labelCedula;
    private javax.swing.JTextField txtCedulaCompraEntrada;
    private javax.swing.JTextField txtEmailCompraEntrada;
    private javax.swing.JTextField txtNombreCompraEntrada;
    private javax.swing.JTextField txtTelefonoCompraEntrada;
    // End of variables declaration//GEN-END:variables
}
