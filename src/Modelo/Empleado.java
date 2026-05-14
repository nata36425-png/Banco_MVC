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
public class Empleado extends Persona {
    
    private String cargo;
    private int salario;

    public Empleado() {
    }

    public Empleado(String cargo, int salario) {
        this.cargo = cargo;
        this.salario = salario;
    }

    public Empleado(String cargo, int salario, String documento, String nombre, String correo, String telefono, LocalDate fechaNacimiento, double estatura) {
        super(documento, nombre, correo, telefono, fechaNacimiento, estatura);
        this.cargo = cargo;
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
      
    
}
