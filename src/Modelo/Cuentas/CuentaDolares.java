package Modelo.Cuentas;

import Modelo.Clientes.Cliente;

public class CuentaDolares extends Cuenta {
    public CuentaDolares(String numeroCuenta, Cliente idTitular, double saldoInicial) {
        super(numeroCuenta, idTitular, saldoInicial);
    }
    @Override
    public String getTipo() { return "Dólares"; }
}