/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author jprod
 */
public class Cliente {
    private final String id;
    private final String nombre;
    private String correo;
    private String telefono;
    private boolean preferencia;

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getCorreo() { return correo; }
    public String getTelefono() { return telefono; }
    public boolean isPreferencia() { return preferencia; }
        
    public void setCorreo(String correo) { this.correo = Objects.requireNonNull(correo,"El correo no puede ser un valor nulo"); }
    public void setTelefono(String telefono) { this.telefono = Objects.requireNonNull(telefono,"El telefono no puede ser un valor nulo"); }
    public void setPreferencia(boolean preferencia) { this.preferencia = preferencia; }
    
    public Cliente(String id, String nombre, String correo, String telefono, boolean preferencia) {
        this.id = Objects.requireNonNull(id,"El id no puede ser un valor nulo");
        this.nombre = formatearNombre(Objects.requireNonNull(nombre,"El nombre no puede ser un valor nulo"));
        this.correo = Objects.requireNonNull(correo,"El correo no puede ser un valor nulo");
        this.telefono = Objects.requireNonNull(telefono,"El telefono no puede ser un valor nulo");
        this.preferencia = preferencia;
    }
    
    private String formatearNombre(String nombre) {
    if (nombre == null || nombre.isEmpty()) return nombre;
    String[] partes = nombre.toLowerCase().split(" ");
    List<String> palabras = new ArrayList<>();
    for (String parte : partes) {
        if (!parte.isEmpty()) {
            palabras.add(Character.toUpperCase(parte.charAt(0)) + parte.substring(1));
        }
    }
    return String.join(" ", palabras);
    }
}
