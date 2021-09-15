/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Talleres;

/**
 *
 * @author Ferchito Rodriguez
 */
public class Persona {
    
    
    private String nombre;
    private String usuario;
    private String clave;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, String usuario, String clave, int edad) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.clave = clave;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    
}
