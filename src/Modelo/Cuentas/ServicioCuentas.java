package Modelo.Cuentas;

import Modelo.Clientes.Cliente;
import Modelo.Clientes.ServicioClientes;
import java.util.List;

public class ServicioCuentas {
    private IGestorCuentas gestor;
    private  ServicioClientes servicioClientes;
    private static final String PREFIJO_BANCO = "551";

    public ServicioCuentas(IGestorCuentas gestor, ServicioClientes servicioClientes) {
        this.gestor = gestor;
        this.servicioClientes = servicioClientes;
    }

    public String generarNumeroCuenta() {
        String consecutivo = String.format("%014d", gestor.listar().size() + 1);
        return PREFIJO_BANCO + consecutivo;
    }

    public void crearCuenta(String tipo, String idTitular, double saldoInicial) {
        Cliente titular = servicioClientes.buscar(idTitular);
        String numeroCuenta = generarNumeroCuenta();
        Cuenta cuenta;
        if (tipo.equalsIgnoreCase("Colones"))
            cuenta = new CuentaColones(numeroCuenta, titular, saldoInicial);
        else if (tipo.equalsIgnoreCase("Dólares"))
            cuenta = new CuentaDolares(numeroCuenta, titular, saldoInicial);
        else
            throw new IllegalArgumentException("Tipo de cuenta inválido");
        gestor.guardar(cuenta);
    }

    public void actualizarEstado(String numeroCuenta, boolean activa) {
        gestor.actualizarEstado(numeroCuenta, activa);
    }

    public void eliminarCuenta(String numeroCuenta) {
        gestor.eliminar(numeroCuenta);
    }

    public Cuenta buscarCuenta(String numeroCuenta) {
        return gestor.buscar(numeroCuenta);
    }

        public Cuenta buscarPorTitularYTipo(String idTitular, String tipo) {
        for (Cuenta c : gestor.listar()) {
            if (c.getTitular().getId().equals(idTitular) && c.getTipo().equals(tipo)) {
                return c;
            }
        }
        return null;
    }

    public ServicioClientes getServicioClientes() {
        return servicioClientes;
    }
    
    public Cliente buscarTitular(String numeroCuenta) {
        Cuenta cuenta = buscarCuenta(numeroCuenta);
        return servicioClientes.buscar(cuenta.getTitular().getId());
    }

    public void depositar(String numeroCuenta, double monto) {
        Cuenta cuenta = buscarCuenta(numeroCuenta);
        cuenta.depositar(monto);
    }

    public void retirar(String numeroCuenta, double monto) {
        Cuenta cuenta = buscarCuenta(numeroCuenta);
        cuenta.retirar(monto);
    }

    public void transferir(String origen, String destino, double monto) {
        Cuenta cuentaOrigen = buscarCuenta(origen);
        Cuenta cuentaDestino = buscarCuenta(destino);
        cuentaOrigen.retirar(monto);
        cuentaDestino.depositar(monto);
    }

    public List<Cuenta> listar() {
        return gestor.listar();
    }
}