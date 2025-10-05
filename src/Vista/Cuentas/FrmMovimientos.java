/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista.Cuentas;

import Modelo.Cuentas.Cuenta;
import Modelo.Cuentas.ServicioCuentas;
import Vista.UtilGui;

/**
 *
 * @author Greivin Eliecer
 */
public class FrmMovimientos extends javax.swing.JInternalFrame {

    private final ServicioCuentas servicioCuentas;

    public FrmMovimientos(ServicioCuentas servicioCuentas1) {
        super("Movimientos", true, true, true, true);
        this.servicioCuentas = servicioCuentas1;
        initComponents();
        cargarCuentas();
    }

    private void cargarCuentas() {
        cmbCuentaOrigen.removeAllItems();
        cmbCuentaDestino.removeAllItems();
        for (Cuenta c : servicioCuentas.listar()) {
            cmbCuentaOrigen.addItem(c.getNumeroCuenta());
            cmbCuentaDestino.addItem(c.getNumeroCuenta());
        }
        actualizarLabelsCuentaOrigen();
        actualizarLabelsCuentaDestino();
    }

        private void actualizarLabelsCuentaOrigen() {
        String numeroCuenta = (String) cmbCuentaOrigen.getSelectedItem();
        if (numeroCuenta != null) {
            try {
                Cuenta cuenta = servicioCuentas.buscarCuenta(numeroCuenta);
                lblNameCuentaOrigen.setText("Titular: " + cuenta.getTitular().getNombre());
                lblTipoCuentaOrigen.setText("Tipo: " + cuenta.getTipo());
            } catch (Exception e) {
                lblNameCuentaOrigen.setText("");
                lblTipoCuentaOrigen.setText("");
            }
        } else {
            lblNameCuentaOrigen.setText("");
            lblTipoCuentaOrigen.setText("");
        }
    }

    private void actualizarLabelsCuentaDestino() {
        String numeroCuenta = (String) cmbCuentaDestino.getSelectedItem();
        if (numeroCuenta != null) {
            try {
                Cuenta cuenta = servicioCuentas.buscarCuenta(numeroCuenta);
                lblNameCuentaDestino.setText("Titular: " + cuenta.getTitular().getNombre());
                lblTipoCuentaDestino.setText("Tipo: " + cuenta.getTipo());
            } catch (Exception e) {
                lblNameCuentaDestino.setText("");
                lblTipoCuentaDestino.setText("");
            }
        } else {
            lblNameCuentaDestino.setText("");
            lblTipoCuentaDestino.setText("");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblCuentaOrigen = new javax.swing.JLabel();
        lblCuentaDestino = new javax.swing.JLabel();
        btnTransferir = new javax.swing.JButton();
        lblMonto = new javax.swing.JLabel();
        btnDepositar = new javax.swing.JButton();
        btnRetirar = new javax.swing.JButton();
        cmbCuentaOrigen = new javax.swing.JComboBox<>();
        cmbCuentaDestino = new javax.swing.JComboBox<>();
        txtMonto = new javax.swing.JFormattedTextField();
        lblTipoCuentaOrigen = new javax.swing.JLabel();
        lblNameCuentaOrigen = new javax.swing.JLabel();
        lblNameCuentaDestino = new javax.swing.JLabel();
        lblTipoCuentaDestino = new javax.swing.JLabel();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CAJERO");

        lblCuentaOrigen.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCuentaOrigen.setText("Cuenta Origen");

        lblCuentaDestino.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCuentaDestino.setText("Cuenta Destino:");

        btnTransferir.setText("Transferir");
        btnTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferirActionPerformed(evt);
            }
        });

        lblMonto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblMonto.setText("Monto: ");

        btnDepositar.setText("Depositar");
        btnDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositarActionPerformed(evt);
            }
        });

        btnRetirar.setText("Retirar");
        btnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarActionPerformed(evt);
            }
        });

        cmbCuentaOrigen.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCuentaOrigenItemStateChanged(evt);
            }
        });

        cmbCuentaDestino.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCuentaDestinoItemStateChanged(evt);
            }
        });

        txtMonto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCuentaOrigen)
                            .addComponent(lblCuentaDestino)
                            .addComponent(lblMonto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbCuentaDestino, 0, 164, Short.MAX_VALUE)
                            .addComponent(cmbCuentaOrigen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtMonto)
                                .addContainerGap())))
                    .addComponent(lblTipoCuentaOrigen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNameCuentaOrigen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTipoCuentaDestino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNameCuentaDestino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnDepositar)
                                .addGap(18, 18, 18)
                                .addComponent(btnRetirar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnTransferir)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCuentaOrigen)
                    .addComponent(cmbCuentaOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNameCuentaOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTipoCuentaOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCuentaDestino)
                    .addComponent(cmbCuentaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNameCuentaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTipoCuentaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMonto)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferirActionPerformed
        String origen = (String) cmbCuentaOrigen.getSelectedItem();
        String destino = (String) cmbCuentaDestino.getSelectedItem();
        Object montoObj = txtMonto.getValue();
        double monto = montoObj != null ? Double.parseDouble(montoObj.toString()) : 0.0;
        try {
            servicioCuentas.transferir(origen, destino, monto);
            UtilGui.mostrarMensaje(this, "Transferencia realizada", "Movimiento");
        } catch (Exception ex) {
            UtilGui.mostrarError(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnTransferirActionPerformed

    private void btnDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarActionPerformed
        String cuenta = (String) cmbCuentaOrigen.getSelectedItem();
        Object montoObj = txtMonto.getValue();
        double monto = montoObj != null ? Double.parseDouble(montoObj.toString()) : 0.0;
        try {
            servicioCuentas.depositar(cuenta, monto);
            UtilGui.mostrarMensaje(this, "Depósito realizado", "Movimiento");
        } catch (Exception ex) {
            UtilGui.mostrarError(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnDepositarActionPerformed

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        String cuenta = (String) cmbCuentaOrigen.getSelectedItem();
        Object montoObj = txtMonto.getValue();
        double monto = montoObj != null ? Double.parseDouble(montoObj.toString()) : 0.0;
        try {
            servicioCuentas.retirar(cuenta, monto);
            UtilGui.mostrarMensaje(this, "Retiro realizado", "Movimiento");
        } catch (Exception ex) {
            UtilGui.mostrarError(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnRetirarActionPerformed

    private void cmbCuentaOrigenItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCuentaOrigenItemStateChanged
         actualizarLabelsCuentaOrigen();
    }//GEN-LAST:event_cmbCuentaOrigenItemStateChanged

    private void cmbCuentaDestinoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCuentaDestinoItemStateChanged
        actualizarLabelsCuentaDestino();
    }//GEN-LAST:event_cmbCuentaDestinoItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDepositar;
    private javax.swing.JButton btnRetirar;
    private javax.swing.JButton btnTransferir;
    private javax.swing.JComboBox<String> cmbCuentaDestino;
    private javax.swing.JComboBox<String> cmbCuentaOrigen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCuentaDestino;
    private javax.swing.JLabel lblCuentaOrigen;
    private javax.swing.JLabel lblMonto;
    private javax.swing.JLabel lblNameCuentaDestino;
    private javax.swing.JLabel lblNameCuentaOrigen;
    private javax.swing.JLabel lblTipoCuentaDestino;
    private javax.swing.JLabel lblTipoCuentaOrigen;
    private javax.swing.JFormattedTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}
