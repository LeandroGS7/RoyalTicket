/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaz;

/**
 *
 * @author leang
 */
public class ComprarPalco extends javax.swing.JPanel {

    /**
     * Creates new form ComprarPalco
     */
    public ComprarPalco() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelCedula = new javax.swing.JLabel();
        txtCedulaCompraEntrada = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        txtEmailCompraEntrada = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTelefonoCompraEntrada = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNombreCompraEntrada = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        txtEmailCompraEntrada1 = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Comprar Palco");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(jLabel1)
                .addContainerGap(294, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, -1));

        labelCedula.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        labelCedula.setText("Cédula");
        jPanel1.add(labelCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        txtCedulaCompraEntrada.setBorder(null);
        txtCedulaCompraEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaCompraEntradaActionPerformed(evt);
            }
        });
        jPanel1.add(txtCedulaCompraEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 180, -1));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 210, 20));

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jLabel9.setText("Email");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        txtEmailCompraEntrada.setBorder(null);
        txtEmailCompraEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailCompraEntradaActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmailCompraEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 180, -1));

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jLabel10.setText("Telefono");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, -1, -1));

        txtTelefonoCompraEntrada.setBorder(null);
        txtTelefonoCompraEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoCompraEntradaActionPerformed(evt);
            }
        });
        jPanel1.add(txtTelefonoCompraEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 140, -1));

        jLabel11.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jLabel11.setText("Nombre Completo");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, -1));

        txtNombreCompraEntrada.setBorder(null);
        txtNombreCompraEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreCompraEntradaActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombreCompraEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 200, -1));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 180, 20));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 180, 20));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 210, 20));

        jLabel12.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jLabel12.setText("Código de palco");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        txtEmailCompraEntrada1.setBorder(null);
        txtEmailCompraEntrada1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailCompraEntrada1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmailCompraEntrada1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 180, -1));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 180, 20));

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("VER PALCOS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 120, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCedulaCompraEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaCompraEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaCompraEntradaActionPerformed

    private void txtEmailCompraEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailCompraEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailCompraEntradaActionPerformed

    private void txtTelefonoCompraEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoCompraEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoCompraEntradaActionPerformed

    private void txtNombreCompraEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreCompraEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreCompraEntradaActionPerformed

    private void txtEmailCompraEntrada1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailCompraEntrada1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailCompraEntrada1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Palcos palcos = new Palcos();
        palcos.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel labelCedula;
    private javax.swing.JTextField txtCedulaCompraEntrada;
    private javax.swing.JTextField txtEmailCompraEntrada;
    private javax.swing.JTextField txtEmailCompraEntrada1;
    private javax.swing.JTextField txtNombreCompraEntrada;
    private javax.swing.JTextField txtTelefonoCompraEntrada;
    // End of variables declaration//GEN-END:variables
}