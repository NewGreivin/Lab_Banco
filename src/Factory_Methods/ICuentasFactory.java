/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Factory_Methods;

import Modelo.Clientes.Cliente;
import Modelo.Cuentas.Cuenta;

/**
 *
 * @author Ricardo Chaves
 */
public interface ICuentasFactory {
    Cuenta crearCuenta(String numeroCuenta, Cliente titular, double saldo);
}
