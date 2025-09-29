package Modelo.Cuentas;

import java.util.List;

public interface IGestorCuentas {
    void guardar(Cuenta cuenta);
    void actualizarEstado(String numeroCuenta, boolean activa);
    void eliminar(String numeroCuenta);
    Cuenta buscar(String numeroCuenta);
    boolean existe(String numeroCuenta);
    List<Cuenta> listar();
}