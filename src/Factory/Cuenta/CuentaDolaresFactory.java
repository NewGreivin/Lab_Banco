/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory.Cuenta;

import Modelo.Clientes.Cliente;
import Modelo.Cuentas.Cuenta;
import Modelo.Cuentas.CuentaDolares;

/**
 *
 * @author Ricardo Chaves
 */
public class CuentaDolaresFactory implements ICuentasFactory {

    @Override
    public Cuenta crearCuenta(String numeroCuenta, Cliente titular, double saldo) {
        return new CuentaDolares(numeroCuenta, titular, saldo);
    }

}
