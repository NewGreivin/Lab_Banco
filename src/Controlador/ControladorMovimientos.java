package Controlador;

import Modelo.Cuentas.ServicioCuentas;
import Vista.Cuentas.IVistaMovimientos;

public class ControladorMovimientos {
    private final ServicioCuentas servicio;
    private final IVistaMovimientos vista;

    public ControladorMovimientos(ServicioCuentas servicio, IVistaMovimientos vista) {
        this.servicio = servicio;
        this.vista = vista;
    }

    public void depositar(String numeroCuenta, double monto) {
        try {
            servicio.depositar(numeroCuenta, monto);
            vista.mostrarMensaje("Depósito realizado", "Movimiento exitoso");
        } catch (Exception ex) {
            vista.mostrarError(ex.getMessage());
        }
    }

    public void retirar(String numeroCuenta, double monto) {
        try {
            servicio.retirar(numeroCuenta, monto);
            vista.mostrarMensaje("Retiro realizado", "Movimiento exitoso");
        } catch (Exception ex) {
            vista.mostrarError(ex.getMessage());
        }
    }

    public void transferir(String origen, String destino, double monto) {
        try {
            servicio.transferir(origen, destino, monto);
            vista.mostrarMensaje("Transferencia realizada", "Movimiento exitoso");
        } catch (Exception ex) {
            vista.mostrarError(ex.getMessage());
        }
    }
}