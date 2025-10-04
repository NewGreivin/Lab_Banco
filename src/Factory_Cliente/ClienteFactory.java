/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory_Cliente;

import Modelo.Clientes.Cliente;

/**
 *
 * @author Ricardo Chaves
 */
public class ClienteFactory implements IClienteFactory{

    @Override
    public Cliente crearCliente(String id, String nombre, String correo, String telefono, boolean preferencia) {
        return new Cliente(id, nombre, correo, telefono, preferencia);
    }
    
}
