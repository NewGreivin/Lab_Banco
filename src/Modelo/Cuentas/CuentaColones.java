package Modelo.Cuentas;

import Modelo.Clientes.Cliente;

public class CuentaColones extends Cuenta {
    public CuentaColones(String numeroCuenta, Cliente idTitular, double saldoInicial) {
        super(numeroCuenta, idTitular, saldoInicial);
    }
    @Override
    public String getTipo() { return "Colones"; }
}