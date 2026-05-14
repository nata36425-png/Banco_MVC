/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorBanco;

import Modelo.*;
import java.time.LocalDate;

/**
 *
 * @author natam
 */
public class ControladorBanco {
    
    Banco banco;
    
    public ControladorBanco() {
        banco = new Banco();
    }
        
    /*
    *Nombre del metodo: CrearCliente
    *Parametros recibidos: Documento, Nombre, Correo, Fecha de nacimineto, Estatura, Tipo
    *Tipo de retorno: Cliente 
    *Descripcion: Crear un nuevo cliente 
     */
    public Cliente crearCliente(String tipo, String documento, String nombre, String correo, String telefono, int diaDeNacimiento, int mesDeNacimiento, int anioDeNacimiento, double estatura) {

        Cliente cliente = null;

        try {
            LocalDate fechaNacimiento = LocalDate.of(anioDeNacimiento, mesDeNacimiento, diaDeNacimiento);

            cliente = new Cliente(tipo, documento, nombre, correo, telefono, fechaNacimiento, estatura);

            return cliente;

        } catch (Exception ex) {
            System.out.println("error al crear cliente: " + ex.getMessage());
            return null;
        }
    }
}
