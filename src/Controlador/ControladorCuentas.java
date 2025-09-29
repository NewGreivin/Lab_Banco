package Controlador;

import Modelo.Cuentas.ServicioCuentas;
import Vista.Cuentas.IVistaCuentas;
import Modelo.Clientes.Cliente;
import Modelo.Cuentas.Cuenta;

public class ControladorCuentas {
    private final ServicioCuentas servicio;
    private final IVistaCuentas vista;

    public ControladorCuentas(ServicioCuentas servicio, IVistaCuentas vista) {
        this.servicio = servicio;
        this.vista = vista;
    }

    public void crearCuenta(String tipo, String idTitular, double saldoInicial) {
        try {
            servicio.crearCuenta(tipo, idTitular, saldoInicial);
            Cuenta cuenta = servicio.buscarPorTitularYTipo(idTitular, tipo); 
            Cliente titular = servicio.getServicioClientes().buscar(idTitular);
            vista.mostrarDatosCuenta(cuenta, titular);
            vista.mostrarMensaje("Cuenta creada correctamente", "Registro exitoso");
        } catch (Exception ex) {
            vista.mostrarError(ex.getMessage());
        }
    }

    public void actualizarEstado(String numeroCuenta, boolean activa) {
        try {
            servicio.actualizarEstado(numeroCuenta, activa);
            vista.mostrarMensaje("Estado actualizado", "Actualización exitosa");
        } catch (Exception ex) {
            vista.mostrarError(ex.getMessage());
        }
    }

    public void eliminarCuenta(String numeroCuenta) {
        try {
            if (!vista.confirmar("¿Está seguro que desea eliminar la cuenta?", "Eliminar Cuenta")) return;
            servicio.eliminarCuenta(numeroCuenta);
            vista.mostrarMensaje("Cuenta eliminada", "Eliminación exitosa");
            vista.limpiar();
        } catch (Exception ex) {
            vista.mostrarError(ex.getMessage());
        }
    }

    public void buscarCuenta(String numeroCuenta) {
        try {
            Cuenta cuenta = servicio.buscarCuenta(numeroCuenta);
            Cliente titular = servicio.buscarTitular(numeroCuenta);
            vista.mostrarDatosCuenta(cuenta, titular);
        } catch (Exception ex) {
            vista.mostrarError(ex.getMessage());
        }
    }
}