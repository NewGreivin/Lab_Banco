package Vista.Cuentas;

import Modelo.Cuentas.Cuenta;
import Modelo.Clientes.Cliente;

public interface IVistaCuentas {
    void mostrarDatosCuenta(Cuenta cuenta, Cliente titular);
    void mostrarMensaje(String mensaje, String titulo);
    void mostrarError(String mensaje);
    boolean confirmar(String mensaje, String titulo);
    void limpiar();
    void habilitarCampos();
    void deshabilitarCampos();
}