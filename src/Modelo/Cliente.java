/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.time.LocalDate;

/**
 *
 * @author natam
 */
public class Cliente extends Persona {
     private String tipo;

    public Cliente() {
    }

    public Cliente(String tipo) {
        this.tipo = tipo;
    }

    public Cliente(String tipo, String documento, String nombre, String correo, String telefono, LocalDate fechaNacimiento, double estatura) {
        super(documento, nombre, correo, telefono, fechaNacimiento, estatura);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
    
    
    
