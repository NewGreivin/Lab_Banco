
package Vista.Cuentas;

import Controlador.ControladorCuentas;
import Modelo.Clientes.Cliente;
import Modelo.Clientes.GestorClientesMem;
import Modelo.Clientes.IGestorClientes;
import Modelo.Clientes.ServicioClientes;
import Modelo.Cuentas.Cuenta;
import Modelo.Cuentas.GestorCuentasMem;
import Modelo.Cuentas.IGestorCuentas;
import Modelo.Cuentas.ServicioCuentas;
import Vista.Cuentas.IVistaCuentas;
import Vista.UtilGui;

public class FrmCuentas extends javax.swing.JInternalFrame implements IVistaCuentas  {

    private ControladorCuentas controlador;
    private ServicioClientes servicioClientes; // Guarda la referencia

    public FrmCuentas(ServicioClientes servicioClientes1) {
        super("Cuentas", true, true, true, true);
        initComponents();
        this.servicioClientes = servicioClientes1;
        IGestorCuentas gestorCuentas = new GestorCuentasMem();
        ServicioCuentas servicioCuentas = new ServicioCuentas(gestorCuentas, servicioClientes);
        controlador = new ControladorCuentas(servicioCuentas, this);
        cargarCombos(servicioClientes);
    }

    private void cargarCombos(ServicioClientes servicioClientes) {
        cmbTipoCuenta.removeAllItems();
        cmbTipoCuenta.addItem("Colones");
        cmbTipoCuenta.addItem("Dólares");

        cmbId.removeAllItems();
        for (Cliente c : servicioClientes.listar()) {
            cmbId.addItem(c.getId());
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContenedor = new javax.swing.JPanel();
        pnlBotones = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        btnActulizarEstado = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnEliminarCuenta = new javax.swing.JButton();
        btnCrearCuenta = new javax.swing.JButton();
        pnlDatos = new javax.swing.JPanel();
        lblIdTitular = new javax.swing.JLabel();
        lblTipoCuenta = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        cmbTipoCuenta = new javax.swing.JComboBox<>();
        txtEstado = new javax.swing.JCheckBox();
        txtSaldo = new javax.swing.JFormattedTextField();
        lblMostrarNombre = new javax.swing.JLabel();
        cmbId = new javax.swing.JComboBox<>();
        ScrollInformacion = new javax.swing.JScrollPane();
        txtInformacion = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBuscar.setText("Buscar Cuenta");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnActulizarEstado.setText("Actualizar Estado");
        btnActulizarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActulizarEstadoActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnEliminarCuenta.setText("Eliminar Cuenta");
        btnEliminarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCuentaActionPerformed(evt);
            }
        });

        btnCrearCuenta.setText("Crear Cuenta");
        btnCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCuentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBotonesLayout = new javax.swing.GroupLayout(pnlBotones);
        pnlBotones.setLayout(pnlBotonesLayout);
        pnlBotonesLayout.setHorizontalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCrearCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlBotonesLayout.createSequentialGroup()
                        .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnActulizarEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminarCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pnlBotonesLayout.setVerticalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCrearCuenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnActulizarEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        lblIdTitular.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblIdTitular.setText("ID Titular: ");

        lblTipoCuenta.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblTipoCuenta.setText("Tipo de cuenta:");

        lblNombre.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblNombre.setText("Nombre Titular: ");

        lblEstado.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblEstado.setText("Estado de la cuenta:");

        lblSaldo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblSaldo.setText("Saldo Inicial: ");

        txtEstado.setSelected(true);
        txtEstado.setText("Activa");

        txtSaldo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        lblMostrarNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMostrarNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        cmbId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbIdMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMostrarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSaldo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSaldo)
                        .addContainerGap())
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addComponent(lblIdTitular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbId, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTipoCuenta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbTipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEstado)
                        .addGap(18, 18, 18)
                        .addComponent(txtEstado)
                        .addGap(19, 19, 19))))
        );
        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoCuenta)
                    .addComponent(lblIdTitular)
                    .addComponent(cmbTipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstado)
                    .addComponent(txtEstado)
                    .addComponent(cmbId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addComponent(lblMostrarNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        ScrollInformacion.setViewportView(txtInformacion);

        javax.swing.GroupLayout pnlContenedorLayout = new javax.swing.GroupLayout(pnlContenedor);
        pnlContenedor.setLayout(pnlContenedorLayout);
        pnlContenedorLayout.setHorizontalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ScrollInformacion))
                .addContainerGap())
        );
        pnlContenedorLayout.setVerticalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContenedorLayout.createSequentialGroup()
                .addComponent(pnlDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCuentaActionPerformed
        String tipo = (String) cmbTipoCuenta.getSelectedItem();
        String idTitular = (String) cmbId.getSelectedItem();
        Object saldoObj = txtSaldo.getValue();
        double saldo = saldoObj != null ? Double.parseDouble(saldoObj.toString()) : 0.0;
        if (tipo == null || idTitular == null) {
            UtilGui.mostrarError(this, "Debe seleccionar el tipo de cuenta y el titular.");
            return;
        }
        controlador.crearCuenta(tipo, idTitular, saldo);
    }//GEN-LAST:event_btnCrearCuentaActionPerformed

    private void btnActulizarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActulizarEstadoActionPerformed
        String numeroCuenta = UtilGui.solicitar(this, "Ingrese el número de cuenta a actualizar:", "Actualizar Estado");
        if (numeroCuenta == null || numeroCuenta.trim().isEmpty()) return;
        boolean activa = txtEstado.isSelected();
        controlador.actualizarEstado(numeroCuenta, activa);
    }//GEN-LAST:event_btnActulizarEstadoActionPerformed

    private void btnEliminarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCuentaActionPerformed
        String numeroCuenta = UtilGui.solicitar(this, "Ingrese el número de cuenta a eliminar:", "Eliminar Cuenta");
        if (numeroCuenta == null || numeroCuenta.trim().isEmpty()) return;
        controlador.eliminarCuenta(numeroCuenta);
    }//GEN-LAST:event_btnEliminarCuentaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String numeroCuenta = UtilGui.solicitar(this, "Ingrese el número de cuenta a buscar:", "Buscar Cuenta");
        if (numeroCuenta == null || numeroCuenta.trim().isEmpty()) return;
        controlador.buscarCuenta(numeroCuenta);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void cmbIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbIdMouseClicked
        String id = (String) cmbId.getSelectedItem();
        Cliente cliente = servicioClientes.buscar(id);
        lblMostrarNombre.setText(cliente != null ? cliente.getNombre() : "");
    }//GEN-LAST:event_cmbIdMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollInformacion;
    private javax.swing.JButton btnActulizarEstado;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCrearCuenta;
    private javax.swing.JButton btnEliminarCuenta;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbId;
    private javax.swing.JComboBox<String> cmbTipoCuenta;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblIdTitular;
    private javax.swing.JLabel lblMostrarNombre;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblTipoCuenta;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlContenedor;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JCheckBox txtEstado;
    private javax.swing.JList<String> txtInformacion;
    private javax.swing.JFormattedTextField txtSaldo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mostrarDatosCuenta(Cuenta cuenta, Cliente titular) {
        if (cuenta == null || titular == null) {
            UtilGui.mostrarError(this, "No se encontró la cuenta o el titular.");
            txtInformacion.setListData(new String[]{});
            return;
        }
        cmbId.setSelectedItem(titular.getId());
        lblMostrarNombre.setText(titular.getNombre());
        cmbTipoCuenta.setSelectedItem(cuenta.getTipo());
        txtEstado.setSelected(cuenta.isEstado());
        txtSaldo.setValue(cuenta.getSaldo());
         String[] info = {
            "Número de cuenta: " + cuenta.getNumeroCuenta(),
            "Titular: " + titular.getNombre(),
            "Tipo: " + cuenta.getTipo(),
            "Saldo: " + cuenta.getSaldo(),
            "Estado: " + (cuenta.isEstado() ? "Activa" : "Inactiva")
        };
        txtInformacion.setListData(info);
    }

    @Override
    public void mostrarMensaje(String mensaje, String titulo) {
         UtilGui.mostrarMensaje(this, mensaje, titulo);
    }

    @Override
    public void mostrarError(String mensaje) {
        UtilGui.mostrarError(this, mensaje);
    }

    @Override
    public boolean confirmar(String mensaje, String titulo) {
        return UtilGui.confirmar(this, mensaje, titulo);
    }

    @Override
    public void limpiar() {
        cmbId.setSelectedIndex(-1);
        lblMostrarNombre.setText("");
        cmbTipoCuenta.setSelectedIndex(-1);
        txtEstado.setSelected(true);
        txtSaldo.setValue(0.00);
        txtInformacion.setListData(new String[]{});
    }

    @Override
    public void habilitarCampos() {
        cmbId.setEnabled(true);
        cmbTipoCuenta.setEnabled(true);
        txtEstado.setEnabled(true);
        txtSaldo.setEnabled(true);
        btnCrearCuenta.setEnabled(true);
        btnActulizarEstado.setEnabled(true);
        btnEliminarCuenta.setEnabled(true);
        btnBuscar.setEnabled(true);
        btnLimpiar.setEnabled(true);
    }

    @Override
    public void deshabilitarCampos() {
        cmbId.setEnabled(false);
        cmbTipoCuenta.setEnabled(false);
        txtEstado.setEnabled(false);
        txtSaldo.setEnabled(false);
        btnCrearCuenta.setEnabled(false);
        btnActulizarEstado.setEnabled(false);
        btnEliminarCuenta.setEnabled(false);
        btnBuscar.setEnabled(false);
        btnLimpiar.setEnabled(false);
    }
}
