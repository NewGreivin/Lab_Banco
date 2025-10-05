/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Factory.Cliente;

import Modelo.Clientes.Cliente;

/**
 *
 * @author Ricardo Chaves
 */
public interface IClienteFactory {
    Cliente crearCliente(String id, String nombre, String correo, String telefono, boolean preferencia);
}
